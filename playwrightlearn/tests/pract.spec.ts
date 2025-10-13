import { expect,test } from "playwright/test";

test('Practic spec',async({page})=>{
    await page.goto("https://practice.expandtesting.com/");
    const title=await page.title();
    console.log("The title of the page is",title);
    expect(title).toBe("Practice E-Commerce Site – Automation Practice");  
})