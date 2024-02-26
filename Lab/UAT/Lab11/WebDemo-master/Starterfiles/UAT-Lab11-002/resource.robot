*** Settings ***
Documentation     A resource file with reusable keywords and variables.
...
...               The system specific keywords created here form our own
...               domain specific language. They utilize keywords provided
...               by the imported SeleniumLibrary.
Library           SeleniumLibrary

*** Variables ***
${SERVER}         localhost:7272
${BROWSER}        Firefox
${DELAY}          0
${VALID FIRST NAME}    Somsri
${VALID LAST NAME}    Sodsai
${VALID ORGANIZATION}    CS KKU
${VALID EMAIL}    somsri@kkumail.com
@{VALID PHONNO}    081-001-1234    081.001.1234    081 001 1234
${InValid Registration URL}      http://${SERVER}/Lab3/Registration.html
#${Registration URL}      http://${SERVER}/Lab11/Registration.html
${Valid Registration URL}      http://${SERVER}/Lab11/Registration.html
${Success URL}    http://${SERVER}/Success.html

*** Keywords ***
Open Browser To Lab3 Registration Page
    Open Browser    ${InValid Registration URL}    ${BROWSER}
    Maximize Browser Window
    Set Selenium Speed    ${DELAY}
    Registration Page Should Be Open

Open Browser To Lab11 Registration Page
    Open Browser    ${Valid Registration URL}    ${BROWSER}
    Maximize Browser Window
    Set Selenium Speed    ${DELAY}
    Registration Page Should Be Open

Registration Page Should Be Open
    Title Should Be    Event Registration

Go To Registration Page
    Go To    ${Valid Registration URL}
    Registration Page Should Be Open

Input Firstname
    [Arguments]    ${firstname}
    Input Text    firstname    ${firstname}

Input Lastname
    [Arguments]    ${lastname}
    Input Text    lastname    ${lastname}

Input Email
    [Arguments]    ${email}
    Input Text    email    ${email}

Input PhoneNo
    [Arguments]    ${phonno}
    Input Text    phone    ${Phonno}

Input Organization
    [Arguments]    ${organization}
    Input Text    organization    ${organization}

Submit Credentials
    Click Button    registerButton

Success Page Should Be Open
    Location Should Be    ${Success URL}
    Title Should Be    Success 
    Element Text Should Be    h1    Success
    Element Text Should Be    h2    Thank you for participating in our event

Empty Firstname And Lastname Should Be Fail
    Location Should Be    ${Valid Registration URL}
    Wait Until Element Is Visible    errors
    Element Text Should Be    errors    *Please enter your name!!

Empty Firstname Should Be Fail
    Location Should Be    ${Valid Registration URL}
    Wait Until Element Is Visible    errors
    Element Text Should Be    errors    *Please enter your first name!!

Empty Lastname Should Be Fail
    Location Should Be    ${Valid Registration URL}
    Wait Until Element Is Visible    errors
    Element Text Should Be    errors    *Please enter your last name!!

Empty Email Should Be Fail
    Location Should Be    ${Valid Registration URL}
    Wait Until Element Is Visible    errors
    Element Text Should Be    errors    *Please enter your email!!

Empty PhoneNo Should Be Fail
    Location Should Be    ${Valid Registration URL}
    Wait Until Element Is Visible    errors
    Element Text Should Be    errors    *Please enter your phone number!!

Invalid PhoneNo Should Be Fail
    Location Should Be    ${Valid Registration URL}
    Wait Until Element Is Visible    errors
    Element Text Should Be    errors    Please enter a valid phone number, e.g., 081-234-5678, 081 234 5678, or 081.234.5678)
