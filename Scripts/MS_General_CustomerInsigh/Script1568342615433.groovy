import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

String closeC =' '
//row = 1

xlsData = findTestData('MS_General_CustomerInsigh')

btnNext = findTestObject('Object Repository/btn_next')

for (int row = 1; row <= xlsData.getRowNumbers(); row++) {
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://surveyconduct.feedback180.com/n494hvgm')

WebUI.waitForPageLoad(GlobalVariable.time)

WebUI.verifyElementText(findTestObject('Object Repository/btn_start'), 'เริ่มทำแบบประเมิน', FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/btn_start'))

'ความพึงพอใจโดยรวมอยู่ในระดับใด'
closeC = xlsData.getValue('ความพึงพอใจโดยรวมอยู่ในระดับใด',  row)
if(closeC == 'close') {
  WebUI.closeBrowser()
  closeC =''
  continue
}
WebUI.click(findTestObject('vote_score1-10', [('rowNo') : '1', ('vote') : xlsData.getValue('ความพึงพอใจโดยรวมอยู่ในระดับใด', 
                row)]))
WebUI.verifyElementText(btnNext, 'ถัดไป', FailureHandling.STOP_ON_FAILURE)
WebUI.click(btnNext)

'ความรวดเร็วของการบริการ'
closeC = xlsData.getValue('ความรวดเร็วของการบริการ',  row)
if(closeC == 'close') {
  WebUI.closeBrowser()
  closeC =''
  continue
}
WebUI.click(findTestObject('radio_vote', [('rowNo') : '2', ('vote') : xlsData.getValue('ความรวดเร็วของการบริการ', row)]))

'คุณภาพของสินค้า'
closeC = xlsData.getValue('คุณภาพของสินค้า',  row)
if(closeC == 'close') {
  WebUI.closeBrowser()
  closeC =''
  continue
}
WebUI.click(findTestObject('radio_vote', [('rowNo') : '3', ('vote') : xlsData.getValue('คุณภาพของสินค้า', row)]))

'บรรยากาศ'
closeC = xlsData.getValue('บรรยากาศ',  row)
if(closeC == 'close') {
  WebUI.closeBrowser()
  closeC =''
  continue
}
WebUI.click(findTestObject('radio_vote', [('rowNo') : '4', ('vote') : xlsData.getValue('บรรยากาศ', row)]))

'ราคา'
closeC = xlsData.getValue('ราคา',  row)
if(closeC == 'close') {
  WebUI.closeBrowser()
  closeC =''
  continue
}
WebUI.click(findTestObject('radio_vote', [('rowNo') : '5', ('vote') : xlsData.getValue('ราคา', row)]))

'ความสะดวกในการเดินทาง'
closeC = xlsData.getValue('ความสะดวกในการเดินทาง',  row)
if(closeC == 'close') {
  WebUI.closeBrowser()
  closeC =''
  continue
}
WebUI.click(findTestObject('radio_vote', [('rowNo') : '6', ('vote') : xlsData.getValue('ความสะดวกในการเดินทาง', row)]))

WebUI.verifyElementText(findTestObject('Object Repository/btn_back'), 'กลับ', FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(btnNext, 'ถัดไป', FailureHandling.STOP_ON_FAILURE)
WebUI.click(btnNext)

'ใช้บริการบ่อยแค่ไหน'
closeC = xlsData.getValue('ใช้บริการบ่อยแค่ไหน',  row)
if(closeC == 'close') {
  WebUI.closeBrowser()
  closeC =''
  continue
}
WebUI.click(findTestObject('radio_choice', [('text') : xlsData.getValue('ใช้บริการบ่อยแค่ไหน', row)]))

WebUI.verifyElementText(findTestObject('Object Repository/btn_back'), 'กลับ', FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(btnNext, 'ถัดไป', FailureHandling.STOP_ON_FAILURE)
WebUI.click(btnNext)

'มีอะไรอยากแนะนำไหม'
closeC = xlsData.getValue('มีอะไรอยากแนะนำไหม',  row)
if(closeC == 'close') {
  WebUI.closeBrowser()
  closeC =''
  continue
}
WebUI.setText(findTestObject('text_area1'), xlsData.getValue('มีอะไรอยากแนะนำไหม', row))

WebUI.verifyElementText(findTestObject('Object Repository/btn_back'), 'กลับ', FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(btnNext, 'ถัดไป', FailureHandling.STOP_ON_FAILURE)
WebUI.click(btnNext)

'เพศ'
closeC = xlsData.getValue('เพศ',  row)
if(closeC == 'close') {
  WebUI.closeBrowser()
  closeC =''
  continue
}
WebUI.click(findTestObject('radio_choice', [('text') : xlsData.getValue('เพศ', row)]))

'ปีเกิด (พ.ศ.)'
closeC = xlsData.getValue('ปีเกิด (พ.ศ.)',  row)
if(closeC == 'close') {
  WebUI.closeBrowser()
  closeC =''
  continue
}
WebUI.setText(findTestObject('text_area2'), xlsData.getValue('ปีเกิด (พ.ศ.)', row))


WebUI.verifyElementText(findTestObject('Object Repository/btn_back'), 'กลับ', FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(btnNext, 'ส่งแบบประเมิน', FailureHandling.STOP_ON_FAILURE)
WebUI.click(btnNext)

WebUI.waitForElementPresent(findTestObject('Object Repository/thankyou_img'), GlobalVariable.time)


WebUI.closeBrowser()
}
