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

WebUI.navigateToUrl('http://localhost:4000/login')

WebUI.setText(findTestObject('Object Repository/Add requirement/Page_ShareBug - Login/input__email'), email)

WebUI.setText(findTestObject('Object Repository/Add requirement/Page_ShareBug - Login/input__password'), password)

WebUI.click(findTestObject('Object Repository/Add requirement/Page_ShareBug - Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Add requirement/Page_ShareBug - Dashboard/a_Project List'))

WebUI.click(findTestObject('Object Repository/Add requirement/Page_ShareBug - Project list/h4_Project Alpha'))

WebUI.click(findTestObject('Object Repository/Add requirement/Page_ShareBug - Project home/a_Requirements'))

WebUI.click(findTestObject('Object Repository/Add requirement/Page_ShareBug - Requirement/button_Add Requirement'))

WebUI.setText(findTestObject('Object Repository/Add requirement/Page_ShareBug - Requirement/input_Select Release_releaseName'), 
    release)

WebUI.setText(findTestObject('Object Repository/Add requirement/Page_ShareBug - Requirement/input__type'), reqType)

WebUI.setText(findTestObject('Object Repository/Add requirement/Page_ShareBug - Requirement/textarea_Requirement Description_description'), 
    reqDesscription)

WebUI.click(findTestObject('Object Repository/Add requirement/Page_ShareBug - Requirement/button_Save'))

WebUI.click(findTestObject('Object Repository/Add requirement/Page_ShareBug - Requirement/input_Total_requirementKeyword'))

