const form = document.getElementById('user-form');
const usernameInput = document.getElementById('username');
const errorMessage = document.getElementById('error-message');
const userDetails = document.getElementById('user-details');
const avatar = document.getElementById('avatar');
const nameEl = document.getElementById('name');
const loginEl = document.getElementById('login');
const bioEl = document.getElementById('bio');
const followersEl = document.getElementById('followers');
const followingEl = document.getElementById('following');
const publicReposEl = document.getElementById('public_repos');
const profileLink = document.getElementById('profile-link');

form.addEventListener('submit', async (e) => {
    e.preventDefault();
    const username = usernameInput.value.trim();
    if (!username) return;

    errorMessage.textContent = '';
    userDetails.style.display = 'none';

    try {
        const response = await fetch(`https://api.github.com/users/${username}`);
        if (!response.ok) {
            if (response.status === 404) {
                errorMessage.textContent = 'User not found.';
            } else {
                errorMessage.textContent = 'Failed to fetch user details.';
            }
            return;
        }
        const data = await response.json();

        avatar.src = data.avatar_url || '';
        nameEl.textContent = data.name || 'No name provided';
        loginEl.textContent = `@${data.login}`;
        bioEl.textContent = data.bio || '';
        followersEl.textContent = data.followers;
        followingEl.textContent = data.following;
        publicReposEl.textContent = data.public_repos;
        profileLink.href = data.html_url;

        userDetails.style.display = 'block';
    } catch (error) {
        errorMessage.textContent = 'Error fetching user details.';
    }
});

// New code to fetch and display 4 predefined users on page load
const multipleUsersContainer = document.getElementById('multiple-users');
const predefinedUsers = ['torvalds', 'gaearon', 'yyx990803', 'sindresorhus'];

async function fetchAndDisplayUser(username) {
    try {
        const response = await fetch(`https://api.github.com/users/${username}`);
        if (!response.ok) {
            console.error(`Failed to fetch user: ${username}`);
            return null;
        }
        const data = await response.json();
        return data;
    } catch (error) {
        console.error(`Error fetching user ${username}:`, error);
        return null;
    }
}

function createUserCard(user) {
    if (!user) return '';
    return `
    <div class="user-card" style="border:1px solid #ccc; padding:10px; width:220px; border-radius:8px;">
        <img src="${user.avatar_url}" alt="${user.login} avatar" style="width:100%; border-radius:8px;" />
        <h3>${user.name || 'No name provided'}</h3>
        <p>@${user.login}</p>
        <p>${user.bio || ''}</p>
        <p><strong>Followers:</strong> ${user.followers}</p>
        <p><strong>Following:</strong> ${user.following}</p>
        <p><strong>Public Repos:</strong> ${user.public_repos}</p>
        <p><a href="${user.html_url}" target="_blank" rel="noopener">View Profile</a></p>
    </div>
    `;
}

async function displayMultipleUsers() {
    multipleUsersContainer.innerHTML = 'Loading users...';
    const usersData = await Promise.all(predefinedUsers.map(fetchAndDisplayUser));
    multipleUsersContainer.innerHTML = usersData.map(createUserCard).join('');
}

window.addEventListener('DOMContentLoaded', () => {
    displayMultipleUsers();
});
