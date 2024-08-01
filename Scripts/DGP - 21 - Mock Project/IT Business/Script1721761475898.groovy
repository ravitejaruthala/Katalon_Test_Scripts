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

WebUI.focus(findTestObject('DGP-21/Services Form_Enter Data/Select Services/i_Services_fa'))

WebUI.focus(findTestObject('DGP-21/IT Business Consulting/IT Business_Select/a_IT  Business Consulting'))

WebUI.click(findTestObject('Object Repository/DGP-21/IT Business Consulting/IT Business_Select/a_IT  Business Consulting'))

WebUI.click(findTestObject('Object Repository/DGP-21/IT Business Consulting/div_Home  IT  Business Consulting'))

variable = WebUI.getUrl()

WebUI.verifyMatch(variable, 'http://3.145.59.133:8202/it-business-consulting/', false)

WebUI.focus(findTestObject('Object Repository/DGP-21/IT Business Consulting/h2_Our network of quality and skilled IT co_7fb40a'))

WebUI.click(findTestObject('Object Repository/DGP-21/IT Business Consulting/h2_Our network of quality and skilled IT co_7fb40a'))

WebUI.click(findTestObject('Object Repository/DGP-21/IT Business Consulting/h2_Why Consultants Work with PLATO'))

WebUI.click(findTestObject('Object Repository/DGP-21/IT Business Consulting/h2_Become a PLATO Consultant Today'))

WebUI.click(findTestObject('Object Repository/DGP-21/IT Business Consulting/h2_Why Businesses Work with PLATO'))

WebUI.click(findTestObject('Object Repository/DGP-21/IT Business Consulting/h2_Our Services'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/DGP-21/IT Business Consulting/p_Project Management'))

WebUI.focus(findTestObject('Object Repository/DGP-21/IT Business Consulting/p_Business Analysis'))

WebUI.focus(findTestObject('Object Repository/DGP-21/IT Business Consulting/p_Change Management'))

WebUI.click(findTestObject('Object Repository/DGP-21/IT Business Consulting/p_Architecture  Infrastructure'))

WebUI.click(findTestObject('Object Repository/DGP-21/IT Business Consulting/div_Software Development'))

WebUI.click(findTestObject('Object Repository/DGP-21/IT Business Consulting/p_Management Consulting'))

WebUI.click(findTestObject('Object Repository/DGP-21/IT Business Consulting/p_IT Planning'))

WebUI.click(findTestObject('Object Repository/DGP-21/IT Business Consulting/p_Desktop Services'))

WebUI.click(findTestObject('Object Repository/DGP-21/IT Business Consulting/p_Database Analysis'))

WebUI.click(findTestObject('Object Repository/DGP-21/IT Business Consulting/p_PLATO is providing opportunities to Indig_456766'))

WebUI.click(findTestObject('Object Repository/DGP-21/IT Business Consulting/p_Innovative customer engagements that crea_40cf2c'))

WebUI.click(findTestObject('Object Repository/DGP-21/IT Business Consulting/p_Provide expanded career paths for Indigen_ca7b24'))

WebUI.click(findTestObject('Object Repository/DGP-21/IT Business Consulting/div_The key pillars to the PLATO approach i_19af5c'))

WebUI.click(findTestObject('Object Repository/DGP-21/IT Business Consulting/p_Based on a mature client and consultant e_8f7ba3'))

WebUI.click(findTestObject('Object Repository/DGP-21/IT Business Consulting/div_The key pillars to the PLATO approach i_19af5c_1'))

WebUI.click(findTestObject('Object Repository/DGP-21/IT Business Consulting/p_Alignment with customer needs and objectives'))

WebUI.click(findTestObject('Object Repository/DGP-21/IT Business Consulting/p_PLATO  Internal Use Only'))

WebUI.closeBrowser()

