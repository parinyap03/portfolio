*** Settings ***
Resource          resource.robot

*** Test Cases ***   
Open Event Registration Page
    Open Browser To Lab3 Registration Page

Register Success
    Input Firstname    Somsri
    Input Lastname    Sodsai
    Input Organization    CS KKU
    Input Email    somsri@kkumail.com
    Input PhoneNo    081-001-1234
    Submit Credentials
    Success Page Should Be Open

Open Event Registration Page
    Open Browser To Lab3 Registration Page

Register Success No Organization Info
    Input Firstname    Somsri
    Input Lastname    Sodsai
    Input Email    somsri@kkumail.com
    Input PhoneNo    081-001-1234
    Submit Credentials
    Success Page Should Be Open




    