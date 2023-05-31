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

Mobile.tap(findTestObject('Object Repository/Android/android.widget.ImageView - Minus Icon'), 0)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.TextView - Proceed To Checkout'), 0)

Mobile.setText(findTestObject('Object Repository/Android/android.widget.EditText - Username'), GlobalVariable.USERNAME, 
    0)

Mobile.setEncryptedText(findTestObject('Object Repository/Android/android.widget.EditText - Password'), GlobalVariable.PASSWORD, 
    0)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.TextView - Login'), 0)

Mobile.setText(findTestObject('Object Repository/Android/android.widget.EditText - Full Name'), 'Abdul Budi', 0)

Mobile.setText(findTestObject('Object Repository/Android/android.widget.EditText - Address Line 1'), 'Mawar 123', 0)

Mobile.setText(findTestObject('Object Repository/Android/android.widget.EditText - City'), 'Bekasi', 0)

Mobile.setText(findTestObject('Object Repository/Android/android.widget.EditText - StateorRegion'), 'Jawa Barat', 0)

Mobile.setText(findTestObject('Object Repository/Android/android.widget.EditText - Zip Code'), '17424', 0)

Mobile.setText(findTestObject('Object Repository/Android/android.widget.EditText - Country'), 'Indonesia', 0)

Mobile.tap(findTestObject('Object Repository/Android/android.view.ViewGroup - To Payment'), 0)

Mobile.setText(findTestObject('Object Repository/Android/android.widget.EditText - Card - Full Name'), 'Rebecca Winter', 
    0)

Mobile.setText(findTestObject('Object Repository/Android/android.widget.EditText - Card - Card Number'), '325812657568789', 
    0)

Mobile.setText(findTestObject('Object Repository/Android/android.widget.EditText - Card - Expiration Date'), '03/25', 0)

Mobile.setText(findTestObject('Object Repository/Android/android.widget.EditText - Card - Security Code'), '123', 0)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.TextView - Review Order'), 0)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.TextView - Place Order'), 0)

Mobile.takeScreenshot('D:\\Program Files\\Katalon\\Katalon Projects\\TaskDay8_KatalonMobileTesting_DendyIndriyoSaputro\\Screenshot\\screenshot1.png')

Mobile.tap(findTestObject('Object Repository/Android/android.widget.TextView - Continue Shopping'), 0)

WebUI.delay(2)

Mobile.closeApplication()

