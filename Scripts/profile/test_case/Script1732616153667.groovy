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

WebUI.navigateToUrl('https://trial.rpl.id/landing/index.html')

WebUI.click(findTestObject('Object Repository/profile/add user child/mentahan/img'))

WebUI.click(findTestObject('Object Repository/profile/add user child/mentahan/span_'))

WebUI.click(findTestObject('Object Repository/profile/add user child/mentahan/button_Login'))

WebUI.setText(findTestObject('Object Repository/profile/add user child/mentahan/input_Email_email'), 'rplkeysuper@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/profile/add user child/mentahan/input_Lupa Password_password'), 
    'wp1F1Z7fk3D1p8vGoyZBqQ==')

WebUI.click(findTestObject('Object Repository/profile/add user child/mentahan/button_Masuk'))

WebUI.click(findTestObject('Object Repository/profile/add user child/mentahan/a_Akun Staff'))

WebUI.setText(findTestObject('Object Repository/profile/add user child/mentahan/input_Ubah Password_search'), 'sales')

WebUI.click(findTestObject('Object Repository/profile/add user child/mentahan/a_Detail'))

WebUI.click(findTestObject('Object Repository/profile/add user child/mentahan/button_Edit'))

WebUI.setText(findTestObject('Object Repository/profile/add user child/detail user child/detail_telepon'), '6221750103812')

