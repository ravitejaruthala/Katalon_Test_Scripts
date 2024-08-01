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

WebUI.navigateToUrl('http://3.145.59.133:8202/')

WebUI.click(findTestObject('Object Repository/DGP-21/Reach Out Form_Submit/Click Work with Us'))

WebUI.setText(findTestObject('Object Repository/DGP-21/Reach Out Form_Submit/Reach Out Fields/Enter First Name'), '')

WebUI.click(findTestObject('Object Repository/DGP-21/Reach Out Form_Submit/Reach Out Fields/Enter Last Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual('Please fill out this field.', 'Please fill out this field.')

WebUI.setText(findTestObject('Object Repository/DGP-21/Reach Out Form_Submit/Reach Out Fields/Enter Last Name'), 'Test Last Name')

WebUI.setText(findTestObject('Object Repository/DGP-21/Reach Out Form_Submit/Reach Out Fields/Enter Email'), 'Reachout@test.com')

WebUI.setText(findTestObject('Object Repository/DGP-21/Reach Out Form_Submit/Reach Out Fields/Enter Phone'), '1234567890')

WebUI.setText(findTestObject('Object Repository/DGP-21/Reach Out Form_Submit/Reach Out Fields/Enter Company'), 'Platotech')

WebUI.selectOptionByValue(findTestObject('Object Repository/DGP-21/Reach Out Form_Submit/Reach Out Fields/Select Location'), 
    'Halifax', true)

WebUI.setText(findTestObject('Object Repository/DGP-21/Reach Out Form_Submit/Reach Out Fields/Enter Text'), 'Mock Project - DGP21')

WebUI.click(findTestObject('Object Repository/DGP-21/Reach Out Form_Submit/Reach Out Fields/Click Submit Button'))

variable = WebUI.getText(findTestObject('DGP-21/Reach Out Form_Submit/REACHOUT - CONFIRMATION MSG/ReachOut - Confirmation message'))

WebUI.verifyMatch(variable, 'One or more fields have an error. Please check and try again.', false)

WebUI.closeBrowser()

