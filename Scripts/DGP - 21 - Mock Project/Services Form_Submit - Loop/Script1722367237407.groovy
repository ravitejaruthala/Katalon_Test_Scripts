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

WebUI.maximizeWindow()

WebUI.click(findTestObject('DGP-21/Services Form_Enter Data/Select Services/i_Services_fa'))

Dropdown = WebUI.getNumberOfTotalOption(findTestObject('DGP-21/Services Form_Enter Data/select_timeline'))

TIndex = 0

for (TIndex = 0; TIndex < Dropdown; TIndex++)
	 {
    WebUI.setText(findTestObject('Object Repository/DGP-21/Services Form_Enter Data/Enter First Name'), 'firstname')

    WebUI.setText(findTestObject('Object Repository/DGP-21/Services Form_Enter Data/Enter Last Name'), 'Test Last Name')

    WebUI.setText(findTestObject('Object Repository/DGP-21/Services Form_Enter Data/input__your-email'), 'Test@test.com')

    WebUI.setText(findTestObject('Object Repository/DGP-21/Services Form_Enter Data/Enter Phone'), '1234567890')

    WebUI.setText(findTestObject('Object Repository/DGP-21/Services Form_Enter Data/input_Company_text-132'), 'Plato')

    WebUI.setText(findTestObject('Object Repository/DGP-21/Services Form_Enter Data/textarea__textarea-734'), 'Mock Project')

    // variable1 = WebUI.getNumberOfSelectedOption(findTestObject('DGP-21/Services Form_Enter Data/select_timeline'), 
    //  FailureHandling.STOP_ON_FAILURE)
    //WebUI.selectOptionByValue(findTestObject('Object Repository/DGP-21/Services Form_Enter Data/select_timeline'), 
    // variable1, true)
    WebUI.selectOptionByIndex(findTestObject('DGP-21/Services Form_Enter Data/select_timeline'), TIndex)

    WebUI.delay(2)

    WebUI.selectOptionByIndex(findTestObject('DGP-21/Services Form_Enter Data/Select Amount Range/select Amount Range'), 
        TIndex)

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/DGP-21/Services Form_Enter Data/input__wpcf7-form-control wpcf7-submit has-spinner'))

    WebUI.delay(1)

    String variable = WebUI.getText(findTestObject('DGP-21/Services Form_Enter Data/Service Form - Thank you Message/Confirmation Message'))

    WebUI.verifyMatch(variable, 'Thank you for your message. It has been sent.', false)
}

WebUI.closeBrowser()

