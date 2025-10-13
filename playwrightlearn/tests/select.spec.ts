import {test, expect } from "@playwright/test"
import { request } from "http";

test('Select class demo', async ({page,browser,request}) => {
   
    

    await page.goto("https://practice.expandtesting.com/dropdown");
    await page.selectOption("//select[@id='dropdown']", "Option 1");
    await expect(page.locator("//select[@id='dropdown']")).toHaveValue("1");
    await page.selectOption("//select[@id='dropdown']", "Option 2");
    await expect(page.locator("//select[@id='dropdown']")).toHaveValue("2");

    const context1=await browser.newContext();
    const page1=await context1.newPage();
    await page1.goto("http://regression.myresman.com/");
    const title=await page1.title();
    console.log("The title of the page is",title);
    const response=await request.get("https://practice.expandtesting.com/dropdown");
    console.log("The status code is",response.status());
    await expect(response).toBeOK();


  

});