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

Mobile.startApplication(GlobalVariable.APK, true)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.ImageView - Sauce Labs Backpack'), 0)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.ImageView - Plus Icon'), 0)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.TextView - Add To Cart'), 0)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.ImageView - Cart Icon'), 0)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.TextView - Proceed To Checkout'), 0)

Mobile.setText(findTestObject('Object Repository/Android/android.widget.EditText - Username'), GlobalVariable.INV_USERNAME, 
    0)

Mobile.setEncryptedText(findTestObject('Object Repository/Android/android.widget.EditText - Password'), GlobalVariable.PASSWORD, 
    0)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.TextView - Login'), 0)

Mobile.takeScreenshot('D:\\Program Files\\Katalon\\Katalon Projects\\TaskDay8_KatalonMobileTesting_DendyIndriyoSaputro\\Screenshot\\screenshot2.png')

WebUI.delay(2)

Mobile.closeApplication()

