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

WebUI.click(findTestObject('Object Repository/DGP-21/Page_Home - PLATO Testing - Site/a_Services'))

WebUI.click(findTestObject('Object Repository/DGP-21/Page_Services - PLATO Testing - Site/p_Our team of software testing specialists _0ee60f'))

WebUI.click(findTestObject('Object Repository/DGP-21/Page_Services - PLATO Testing - Site/body_Skip to content elementor - v3.21.0 - _c63ced'))

WebUI.click(findTestObject('Object Repository/DGP-21/Page_Services - PLATO Testing - Site/a_Full List Of Testing Services'))

WebUI.closeBrowser()

