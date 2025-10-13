import { test, expect } from '@playwright/test';

test.describe('API tests for reqres.in', () => {
    test('GET user data', async ({ request }) => {
        const response = await request.get('https://reqres.in/api/users/2');

        // Verify status code
        expect(response.status()).toBe(401);

        // Verify response body
        const body = await response.json();
        console.log(body);
        //expect(body.data.first_name).toBe('Janet');
    });
    test('POST create user', async ({ request }) => {
        const response = await request.post('https://reqres.in/api/users', {
            data: {
                name: 'Taufik',
                job: 'QA Automation Engineer'
            },
        });

        expect(response.status()).toBe(401); // Created
        const body = await response.json();
        console.log(body);
    });
});