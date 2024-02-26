*** Settings ***
Resource          resource.robot

*** Test Cases ***   
Open Event Registration Page
    Open Browser To Lab3 Registration Page

Empty First Name
    Input Firstname    ${EMPTY}
    Input Lastname    Sodsai
    Input Organization    CS KKU
    Input Email    somsri@kkumail.com
    Input PhoneNo    081-001-1234
    Submit Credentials
    Empty Firstname Should Be Fail
    Capture Page Screenshot    emptyFN.jpg

Open Event Registration Page
    Open Browser To Lab3 Registration Page

Empty Last Name
    Input Firstname    Somsri
    Input Organization    CS KKU
    Input Email    somsri@kkumail.com
    Input PhoneNo    081-001-1234
    Submit Credentials
    Registration Page Should Be Open
    Empty Lastname Should Be Fail
    Capture Page Screenshot    emptyLN.jpg

Open Event Registration Page
    Open Browser To Lab11 Registration Page

Empty First Name and Last Name
    Input Firstname    ${EMPTY}
    Input Lastname    ${EMPTY}
    Input Organization    CS KKU
    Input Email    somsri@kkumail.com
    Input PhoneNo    081-001-1234
    Submit Credentials
    Empty Firstname And Lastname Should Be Fail
    Capture Page Screenshot    emptyFLN.jpg

Open Event Registration Page
    Open Browser To Lab11 Registration Page

Empty Email
    Input Firstname    Somsri
    Input Lastname    Sodsai
    Input Organization    CS KKU
    Input PhoneNo    081-001-1234
    Submit Credentials
    Empty Email Should Be Fail
    Capture Page Screenshot    emptyEm.jpg
	
Open Event Registration Page
    Open Browser To Lab11 Registration Page

Empty Phone Number
    Input Firstname    Somsri
    Input Lastname    Sodsai
    Input Organization    CS KKU
    Input Email    somsri@kkumail.com
    Submit Credentials
    Empty PhoneNo Should Be Fail
    Capture Page Screenshot    emptyPh.jpg

Open Event Registration Page
    Open Browser To Lab11 Registration Page

Invalid Phone Number
    Input Firstname    Somsri
    Input Lastname    Sodsai
    Input Organization    CS KKU
    Input Email    somsri@kkumail.com
    Input PhoneNo    1234
    Submit Credentials
    Invalid PhoneNo Should Be Fail
    Capture Page Screenshot    invalidPh.jpg


