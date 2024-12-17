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

WebUI.navigateToMaskedUrl(url)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Object Repository/Login/Page_Home  Rajawali Putra Logistik/x_pop_up'), 0)

WebUI.click(findTestObject('Object Repository/Login/Page_Home  Rajawali Putra Logistik/x_pop_up'))

WebUI.click(findTestObject('Object Repository/Login/Page_Home  Rajawali Putra Logistik/button_Login'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Login  Rajawali Putra Logistik/username'), username)

WebUI.setText(findTestObject('Object Repository/Login/Page_Login  Rajawali Putra Logistik/password'), password)

WebUI.click(findTestObject('Object Repository/Login/Page_Login  Rajawali Putra Logistik/button_Masuk'))

WebUI.click(findTestObject('Object Repository/profile/Page_Akun  Rajawali Putra Logistik/menu_akun_staff'))

WebUI.setText(findTestObject('Object Repository/profile/search_user'), sales)

WebUI.verifyElementText(findTestObject('Object Repository/profile/list_user'), user_sales)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/profile/detail_user'))

WebUI.click(findTestObject('Object Repository/profile/add user child/detail user child/detail_button_Edit'))

WebUI.click(findTestObject('Object Repository/profile/add user child/detail user child/detail_office'))

WebUI.click(findTestObject('Object Repository/profile/add user child/detail user child/detail_office_rpl_surabaya'))

WebUI.setText(findTestObject('Object Repository/profile/add user child/username'), '')

WebUI.setText(findTestObject('Object Repository/profile/add user child/username'), user_sales_new)

WebUI.setText(findTestObject('Object Repository/profile/add user child/detail user child/detail_telepon'), '')

WebUI.setText(findTestObject('Object Repository/profile/add user child/detail user child/detail_telepon'), new_tlp)

WebUI.click(findTestObject('Object Repository/profile/add user child/menu/menu_report'))

WebUI.click(findTestObject('Object Repository/profile/add user child/detail user child/detail_button_Simpan'))

WebUI.verifyElementText(findTestObject('Object Repository/profile/add user child/detail user child/detail_pop_up_user_child_berhasil_ditambah'), pop_up_berhasil_ditambah)

WebUI.setText(findTestObject('Object Repository/profile/search_user'), sales)

WebUI.verifyElementText(findTestObject('Object Repository/profile/list_user'), user_sales_new)

WebUI.closeBrowser()


