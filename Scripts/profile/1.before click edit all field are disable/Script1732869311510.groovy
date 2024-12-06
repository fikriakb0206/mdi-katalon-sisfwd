import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(url)

WebUI.click(findTestObject('Login/Page_Home  Rajawali Putra Logistik/x_pop_up'))

WebUI.click(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/button_Login'))

WebUI.setText(findTestObject('Login/Page_Login  Rajawali Putra Logistik/username'), username)

WebUI.setText(findTestObject('Login/Page_Login  Rajawali Putra Logistik/password'), password)

WebUI.click(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/button_Masuk'))

WebUI.click(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/menu_akun_staff'))

WebUI.verifyElementHasAttribute(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/profile_name'), 
    'readonly', 0)

WebUI.verifyElementHasAttribute(findTestObject('profile/Page_Akun  Rajawali Putra Logistik/profile_email'), 'readonly', 
    0)

WebUI.verifyElementHasAttribute(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/profile_phone_number'), 
    'readonly', 0)

WebUI.verifyElementHasAttribute(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/profile_province'), 
    'readonly', 0)

WebUI.verifyElementHasAttribute(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/profile_city'), 
    'readonly', 0)

WebUI.verifyElementHasAttribute(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/profile_district'), 
    'readonly', 0)

WebUI.verifyElementHasAttribute(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/profile_village'), 
    'readonly', 0)

WebUI.verifyElementHasAttribute(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/textarea_Jl. Green Sedayu 7, Cakung Timur, _71ccb5'), 
    'readonly', 0)

WebUI.verifyElementHasAttribute(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/profile_post_code'), 
    'readonly', 0)

WebUI.closeBrowser()
