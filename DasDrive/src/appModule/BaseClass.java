package appModule;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import DriveTestCasesData.Xls_Reader;

	public class BaseClass {
		public static WebDriver driver;
		
	
	public static String TDSspath = "Screenshot Path";
	public static String TDResult = "Result";
	public static String TDTrunflag = "Test Run Flag";
	public static String TDExpectedres = "Expected Result";
	public static String TDTcid = "Test Case ID";
	public static String TDPara1 = "Parameter1";
	public static String TDPara2 = "Parameter2";
	public static String TDPara3 = "Parameter3";
	public static String TDPara4 = "Parameter4";
	public static String TDPara5 = "Parameter5";
	public static String TDPara6 = "Parameter6";
	
	
	public static String ORSheet = "Sheet1";
	public static String ORSrl = "Serial No.";
	public static String ORObjName = "Object Name";
	public static String OROid = "Object Identification";
	public static String ORType = "Object Type";

	public static String TRSheet = "Sheet1";
	public static String TRRunpara = "Run Parameter";
	public static String TRValue = "Value";

	public static String testcaseid, expectedresult, testrunflag, spath, parameter1,
	parameter2;
	
	boolean evalue, evalue1, evalue2, evalue3;
	public static File scrFile;
	public static Random rm = new Random();
	public static Select sl, sl2;
	public static WebElement wb, wb2;
	public static List<WebElement> wblist;
	public static int c;
	
	
	public static  Xls_Reader xltcdata =  new Xls_Reader("C:\\Users\\CBTECH5\\workspace\\DasDrive\\src\\DriveTestCasesData\\TestData.xlsx");
	public static  Xls_Reader xltcrunpara =  new Xls_Reader("C:\\Users\\CBTECH5\\workspace\\DasDrive\\src\\DriveTestCasesData\\TestRunParameter.xlsx");
	public static  Xls_Reader xlobjrep = new Xls_Reader("C:\\Users\\CBTECH5\\workspace\\DasDrive\\src\\DriveTestCasesData\\ObjectRepository.xlsx");

	public static String baseurl = xltcrunpara.getCellData(TRSheet, TRValue, 5);
	public static String Browser = xltcrunpara.getCellData(TRSheet, TRValue, 4);
	public static String testscreenpath = xltcrunpara.getCellData(TRSheet, TRValue, 7);
	
	public static String emailprop = xlobjrep.getCellData(ORSheet, OROid, 2);
	public static String passprop = xlobjrep.getCellData(ORSheet, OROid, 3);
	public static String loginbutton = xlobjrep.getCellData(ORSheet, OROid, 4);
	
	public static String connectmenu = xlobjrep.getCellData(ORSheet, OROid, 5);
	public static String windowsconnect = xlobjrep.getCellData(ORSheet, OROid, 6);
	public static String macconnect = xlobjrep.getCellData(ORSheet, OROid, 7);
	public static String iphoneconnect = xlobjrep.getCellData(ORSheet, OROid, 8);
	public static String androidconnect = xlobjrep.getCellData(ORSheet, OROid, 9);
	
	public static String aboutusmenu = xlobjrep.getCellData(ORSheet, OROid, 10);
	public static String aboutusdrop = xlobjrep.getCellData(ORSheet, OROid, 11);
	public static String contactusdrop = xlobjrep.getCellData(ORSheet, OROid, 12);
	
	public static String categoriessubmenu = xlobjrep.getCellData(ORSheet, OROid, 128);
	public static String idlink = xlobjrep.getCellData(ORSheet, OROid, 129);
	public static String addcategoryb = xlobjrep.getCellData(ORSheet, OROid, 139);
	public static String titletbox = xlobjrep.getCellData(ORSheet, OROid, 140);
	public static String cattypedd = xlobjrep.getCellData(ORSheet, OROid, 141);
	public static String catdesctbox = xlobjrep.getCellData(ORSheet, OROid, 142);
	public static String requiredckbox = xlobjrep.getCellData(ORSheet, OROid, 143);
	public static String userid = xlobjrep.getCellData(ORSheet, OROid, 144);
	public static String savebcss = xlobjrep.getCellData(ORSheet, OROid, 145);
	public static String cancellink = xlobjrep.getCellData(ORSheet, OROid, 42);
	public static String errormessage = xlobjrep.getCellData(ORSheet, OROid, 224);
	public static String successmessage = xlobjrep.getCellData(ORSheet, OROid, 225);
	public static String userssubmenu = xlobjrep.getCellData(ORSheet, OROid, 77);
	public static String usersaddpass = xlobjrep.getCellData(ORSheet, OROid, 86);
	public static String usersaddrepass = xlobjrep.getCellData(ORSheet, OROid, 87);
	public static String usersaddsave = xlobjrep.getCellData(ORSheet, OROid, 88);
	public static String usersaddb = xlobjrep.getCellData(ORSheet, OROid, 92);
	public static String usersaddemailid = xlobjrep.getCellData(ORSheet, OROid, 93);
	public static String usersaddfullname = xlobjrep.getCellData(ORSheet, OROid, 94);
	public static String usersIDlink = xlobjrep.getCellData(ORSheet, OROid, 70);
	public static String usersdeleteb = xlobjrep.getCellData(ORSheet, OROid, 89);
	public static String usersaddactive = xlobjrep.getCellData(ORSheet, OROid, 90);
	
	public static String userlink = xlobjrep.getCellData(ORSheet, OROid, 130);
	public static String titlelink = xlobjrep.getCellData(ORSheet, OROid, 131);
	public static String desclink = xlobjrep.getCellData(ORSheet, OROid, 132);
	public static String sloptionlink = xlobjrep.getCellData(ORSheet, OROid, 133);
	public static String createdlink = xlobjrep.getCellData(ORSheet, OROid, 134);
	public static String modifiedlink = xlobjrep.getCellData(ORSheet, OROid, 135);
	public static String deleteb = xlobjrep.getCellData(ORSheet, OROid, 136);
	public static String nextb = xlobjrep.getCellData(ORSheet, OROid, 137);
	public static String prevb = xlobjrep.getCellData(ORSheet, OROid, 138);
	

	public static String settings = xlobjrep.getCellData(ORSheet, OROid, 165);
	public static String changepasslink = xlobjrep.getCellData(ORSheet, OROid, 166);
	public static String heading = xlobjrep.getCellData(ORSheet, OROid, 167);
	public static String oldpass = xlobjrep.getCellData(ORSheet, OROid, 168);
	public static String newpass = xlobjrep.getCellData(ORSheet, OROid, 169);
	public static String conpass = xlobjrep.getCellData(ORSheet, OROid, 170);
	public static String submitb = xlobjrep.getCellData(ORSheet, OROid, 171);
	public static String passstrength = xlobjrep.getCellData(ORSheet, OROid, 172);
		
	
	
	
	

	

	public static String adminmenu = xlobjrep.getCellData(ORSheet, OROid, 13);
	public static String volumesubmenu = xlobjrep.getCellData(ORSheet, OROid, 14);
	public static String vid = xlobjrep.getCellData(ORSheet, OROid, 15);
	public static String vsqlink = xlobjrep.getCellData(ORSheet, OROid, 17);
	public static String vhqlink = xlobjrep.getCellData(ORSheet, OROid, 18);
	public static String vdamlink = xlobjrep.getCellData(ORSheet, OROid, 19);
	public static String addbprop = xlobjrep.getCellData(ORSheet, OROid, 26);
	public static String addname = xlobjrep.getCellData(ORSheet, OROid, 27);
	public static String Huparrow = xlobjrep.getCellData(ORSheet, OROid, 28);
	public static String savebprop = xlobjrep.getCellData(ORSheet, OROid, 29);
	public static String Sdownarrow = xlobjrep.getCellData(ORSheet, OROid, 30);
	public static String Stfield = xlobjrep.getCellData(ORSheet, OROid, 31);
	public static String keytype = xlobjrep.getCellData(ORSheet, OROid, 32);
	public static String Htfield = xlobjrep.getCellData(ORSheet, OROid, 33);
	public static String Aspace = xlobjrep.getCellData(ORSheet, OROid, 34);
	public static String editHdownarrow = xlobjrep.getCellData(ORSheet, OROid, 35);
	public static String newvol = xlobjrep.getCellData(ORSheet, OROid, 36);
	
	public static String newvolremsp = xlobjrep.getCellData(ORSheet, OROid, 37);
	public static String editsqbox = xlobjrep.getCellData(ORSheet, OROid, 38);
	public static String softuparrow = xlobjrep.getCellData(ORSheet, OROid, 39);
	public static String editSQdownarrow = xlobjrep.getCellData(ORSheet, OROid, 40);
	public static String assignedspace = xlobjrep.getCellData(ORSheet, OROid, 41);
	
	public static String cancelblink = xlobjrep.getCellData(ORSheet, OROid, 42);
	public static String veditbutton = xlobjrep.getCellData(ORSheet, OROid, 45);
	public static String editowner = xlobjrep.getCellData(ORSheet, OROid, 43);
	public static String editname = xlobjrep.getCellData(ORSheet, OROid, 44);
	public static String editdamtab = xlobjrep.getCellData(ORSheet, OROid, 46);
	public static String editdamcheck = xlobjrep.getCellData(ORSheet, OROid, 47);
	
	
	public static String DBsubmenu = xlobjrep.getCellData(ORSheet, OROid, 156);
	public static String adddocumentblink = xlobjrep.getCellData(ORSheet, OROid, 157);
	public static String nametbox = xlobjrep.getCellData(ORSheet, OROid, 158);
	public static String desctbox = xlobjrep.getCellData(ORSheet, OROid, 159);
	public static String editb = xlobjrep.getCellData(ORSheet, OROid, 163);
	
	public static String editcategoryb = xlobjrep.getCellData(ORSheet, OROid, 146);
	
	public static String entriestablink = xlobjrep.getCellData(ORSheet, OROid, 147);
	public static String entriesaddlink = xlobjrep.getCellData(ORSheet, OROid, 148);
	public static String entriesnametbox = xlobjrep.getCellData(ORSheet, OROid, 149);
	public static String entriescodetbox = xlobjrep.getCellData(ORSheet, OROid, 150);
	public static String entriesdesctbox = xlobjrep.getCellData(ORSheet, OROid, 151);
	public static String entriessaveb = xlobjrep.getCellData(ORSheet, OROid, 152);
	public static String entriescloseb = xlobjrep.getCellData(ORSheet, OROid, 153);
	public static String entriesheading = xlobjrep.getCellData(ORSheet, OROid, 154);
	public static String entriescrossb = xlobjrep.getCellData(ORSheet, OROid, 155);
	
	
	public static String groupssubmenu = xlobjrep.getCellData(ORSheet, OROid, 116);
	public static String addgroupb = xlobjrep.getCellData(ORSheet, OROid, 117);
	public static String grouptbox = xlobjrep.getCellData(ORSheet, OROid, 118);
	public static String groupdescboxid = xlobjrep.getCellData(ORSheet, OROid, 119);
	public static String save = xlobjrep.getCellData(ORSheet, OROid, 230);
	public static String groupowner = xlobjrep.getCellData(ORSheet, OROid, 120);
	public static String groupdeleteb = xlobjrep.getCellData(ORSheet, OROid, 121);
	public static String namelink = xlobjrep.getCellData(ORSheet, OROid, 122);
	public static String nextlink = xlobjrep.getCellData(ORSheet, OROid, 123);
	public static String prevlink = xlobjrep.getCellData(ORSheet, OROid, 124);
	public static String editgroupb = xlobjrep.getCellData(ORSheet, OROid, 226);
	public static String userstab = xlobjrep.getCellData(ORSheet, OROid, 227);
	public static String volumepermissionstab = xlobjrep.getCellData(ORSheet, OROid, 228);
	public static String filepermissionstab = xlobjrep.getCellData(ORSheet, OROid, 229);
	public static String grouppopp1 = xlobjrep.getCellData(ORSheet, OROid, 232);
	public static String grouppopp2 = xlobjrep.getCellData(ORSheet, OROid, 233);
	public static String grouppopvalue1 = xlobjrep.getCellData(ORSheet, OROid, 234);
	public static String grouppopvalue2 = xlobjrep.getCellData(ORSheet, OROid, 235);
	public static String popoverclass = xlobjrep.getCellData(ORSheet, OROid, 236);
	
	public static String availvolperbox = xlobjrep.getCellData(ORSheet, OROid, 236);
	public static String volperrightbutton = xlobjrep.getCellData(ORSheet, OROid, 237);
	public static String volperleftbutton = xlobjrep.getCellData(ORSheet, OROid, 238);
	public static String currentvolperbox = xlobjrep.getCellData(ORSheet, OROid, 239);
	
	public static String descriptionboxid = xlobjrep.getCellData(ORSheet, OROid, 119);
	
	public static String alluserslist = xlobjrep.getCellData(ORSheet, OROid, 240);
	public static String currentuserslist = xlobjrep.getCellData(ORSheet, OROid, 241);
	public static String rightbutton = xlobjrep.getCellData(ORSheet, OROid, 242);
	public static String leftbutton = xlobjrep.getCellData(ORSheet, OROid, 243);

	
	public static String userseditb = xlobjrep.getCellData(ORSheet, OROid, 96);
	
	public static String userseditfullname = xlobjrep.getCellData(ORSheet, OROid, 94);
	public static String userseditactive = xlobjrep.getCellData(ORSheet, OROid, 95);
	public static String userseditdate = xlobjrep.getCellData(ORSheet, OROid, 97);
	public static String usersdatenmonth = xlobjrep.getCellData(ORSheet, OROid, 98);
	public static String usersdatepick = xlobjrep.getCellData(ORSheet, OROid, 99);
	public static String usersrolelist = xlobjrep.getCellData(ORSheet, OROid, 100);
	public static String userseditcancel = xlobjrep.getCellData(ORSheet, OROid, 42);
	public static String userseditacttab = xlobjrep.getCellData(ORSheet, OROid, 112);
	public static String editalsearchb = xlobjrep.getCellData(ORSheet, OROid, 102);
	public static String eventlink = xlobjrep.getCellData(ORSheet, OROid, 104);
	
	public static String modellink = xlobjrep.getCellData(ORSheet, OROid, 106);
	public static String valuelink = xlobjrep.getCellData(ORSheet, OROid, 107);
	public static String emailaddresslink = xlobjrep.getCellData(ORSheet, OROid, 108);
	public static String entitylink = xlobjrep.getCellData(ORSheet, OROid, 109);
	public static String searchbox = xlobjrep.getCellData(ORSheet, OROid, 110);
	public static String previous = xlobjrep.getCellData(ORSheet, OROid, 111);
	public static String usernamelink = xlobjrep.getCellData(ORSheet, OROid, 113);
	public static String useriplink = xlobjrep.getCellData(ORSheet, OROid, 114);
	
	
	public static String userseditpass = xlobjrep.getCellData(ORSheet, OROid, 86);
	public static String userseditrepass = xlobjrep.getCellData(ORSheet, OROid, 87);
	public static String userseditsave = xlobjrep.getCellData(ORSheet, OROid, 88);
	public static String userseditaultab = xlobjrep.getCellData(ORSheet, OROid, 101);
	public static String editalsearch = xlobjrep.getCellData(ORSheet, OROid, 102);
	public static String userseditRLtab = xlobjrep.getCellData(ORSheet, OROid, 115);
	public static String groupdescbox = xlobjrep.getCellData(ORSheet, OROid, 119);
	

	public static String dammanagermenu = xlobjrep.getCellData(ORSheet, OROid, 173);
	public static String searchsubmenu = xlobjrep.getCellData(ORSheet, OROid, 174);
	public static String file = xlobjrep.getCellData(ORSheet, OROid, 175);
	public static String openfile = xlobjrep.getCellData(ORSheet, OROid, 176);
	public static String downloadb = xlobjrep.getCellData(ORSheet, OROid, 177);
	public static String bundle = xlobjrep.getCellData(ORSheet, OROid, 178);
	public static String bundlefile = xlobjrep.getCellData(ORSheet, OROid, 179);
	public static String filepreview = xlobjrep.getCellData(ORSheet, OROid, 180);
	public static String auditlog = xlobjrep.getCellData(ORSheet, OROid, 181);
	public static String alerissearch = xlobjrep.getCellData(ORSheet, OROid, 182);
	public static String volumebox = xlobjrep.getCellData(ORSheet, OROid, 183);
	public static String categorybox = xlobjrep.getCellData(ORSheet, OROid, 184);
	public static String namebox = xlobjrep.getCellData(ORSheet, OROid, 185);
	public static String applyfilterb = xlobjrep.getCellData(ORSheet, OROid, 186);
	public static String removefilter = xlobjrep.getCellData(ORSheet, OROid, 187);
	public static String volumeselect = xlobjrep.getCellData(ORSheet, OROid, 188);
	public static String browse = xlobjrep.getCellData(ORSheet, OROid, 189);
	public static String typecol = xlobjrep.getCellData(ORSheet, OROid, 190);
	public static String typecolvalue = xlobjrep.getCellData(ORSheet, OROid, 191);
	public static String next = xlobjrep.getCellData(ORSheet, OROid, 192);
	public static String auditdate = xlobjrep.getCellData(ORSheet, OROid, 193);
	public static String gidate = xlobjrep.getCellData(ORSheet, OROid, 194);
	public static String filerevisiontab = xlobjrep.getCellData(ORSheet, OROid, 195);
	public static String filerevdate = xlobjrep.getCellData(ORSheet, OROid, 196);
	public static String filerevsize = xlobjrep.getCellData(ORSheet, OROid, 197);
	public static String fileradio = xlobjrep.getCellData(ORSheet, OROid, 198);
	public static String filedownload = xlobjrep.getCellData(ORSheet, OROid, 199);
	public static String filerestore = xlobjrep.getCellData(ORSheet, OROid, 200);
	public static String cancel = xlobjrep.getCellData(ORSheet, OROid, 201);
	public static String categoryinfo = xlobjrep.getCellData(ORSheet, OROid, 202);
	public static String volumeinfo = xlobjrep.getCellData(ORSheet, OROid, 203);
	public static String volumelink = xlobjrep.getCellData(ORSheet, OROid, 205);
	public static String typelink = xlobjrep.getCellData(ORSheet, OROid, 207);
	public static String sizelink = xlobjrep.getCellData(ORSheet, OROid, 208);
	
	public static String searchbytag = xlobjrep.getCellData(ORSheet, OROid, 210);
	public static String tagfield = xlobjrep.getCellData(ORSheet, OROid, 211);
	public static String tagslist = xlobjrep.getCellData(ORSheet, OROid, 212);
	public static String searchicon = xlobjrep.getCellData(ORSheet, OROid, 213);
	public static String filecount = xlobjrep.getCellData(ORSheet, OROid, 214);
	public static String tagpart1 = xlobjrep.getCellData(ORSheet, OROid, 215);
	public static String tagpart2 = xlobjrep.getCellData(ORSheet, OROid, 216);
	
	
	public static String usersEmailadlink = xlobjrep.getCellData(ORSheet, OROid, 78);
	public static String usersFullNamelink = xlobjrep.getCellData(ORSheet, OROid, 79);
	public static String usersActivelink = xlobjrep.getCellData(ORSheet, OROid, 80);
	public static String usersRolelink = xlobjrep.getCellData(ORSheet, OROid, 81);
	public static String usersExpirylink = xlobjrep.getCellData(ORSheet, OROid, 82);
	public static String usersModifiedlink = xlobjrep.getCellData(ORSheet, OROid, 83);
	public static String usersCdeleteb = xlobjrep.getCellData(ORSheet, OROid, 84);
	public static String userseditRGTab = xlobjrep.getCellData(ORSheet, OROid, 85);
	public static String userseditpassval = xlobjrep.getCellData(ORSheet, OROid, 90);
	public static String usersemails = xlobjrep.getCellData(ORSheet, OROid, 91);
	
	public static String VEsubmenu = xlobjrep.getCellData(ORSheet, OROid, 164);
	public static String pass = xlobjrep.getCellData(ORSheet, OROid, 86);
	public static String repass = xlobjrep.getCellData(ORSheet, OROid, 87);
	public static String editaccsave = xlobjrep.getCellData(ORSheet, OROid, 88);
	public static String editaccb = xlobjrep.getCellData(ORSheet, OROid, 96);
	public static String emailid = xlobjrep.getCellData(ORSheet, OROid, 93);
	public static String fullname = xlobjrep.getCellData(ORSheet, OROid, 94);
	public static String active = xlobjrep.getCellData(ORSheet, OROid, 95);
	public static String date = xlobjrep.getCellData(ORSheet, OROid, 97);
	public static String datenmonth = xlobjrep.getCellData(ORSheet, OROid, 98);
	public static String datepick = xlobjrep.getCellData(ORSheet, OROid, 99);
	public static String rolelist = xlobjrep.getCellData(ORSheet, OROid, 100);
	
	

	public static String idprop = xlobjrep.getCellData(ORSheet, OROid, 15);
	public static String nameprop = xlobjrep.getCellData(ORSheet, OROid, 16);
	public static String softprop = xlobjrep.getCellData(ORSheet, OROid, 17);
	public static String hardprop = xlobjrep.getCellData(ORSheet, OROid, 18);
	public static String damprop = xlobjrep.getCellData(ORSheet, OROid, 19);
	public static String vdelete = xlobjrep.getCellData(ORSheet, OROid, 20);
	public static String vpass = xlobjrep.getCellData(ORSheet, OROid, 21);
	public static String vpassdel = xlobjrep.getCellData(ORSheet, OROid, 22);
	public static String vprev = xlobjrep.getCellData(ORSheet, OROid, 23);
	public static String vnext = xlobjrep.getCellData(ORSheet, OROid, 24);
	public static String vpasscancel = xlobjrep.getCellData(ORSheet, OROid, 25);
	
	public static String editacccancel = xlobjrep.getCellData(ORSheet, OROid, 42);
	
	public static String editvolentab = xlobjrep.getCellData(ORSheet, OROid, 48);
	public static String edithuparrow = xlobjrep.getCellData(ORSheet, OROid, 49);
	public static String editsuparrow = xlobjrep.getCellData(ORSheet, OROid, 50);
	public static String editvolpertab = xlobjrep.getCellData(ORSheet, OROid, 51);
	public static String editvolperaddb = xlobjrep.getCellData(ORSheet, OROid, 52);
	public static String editvolpername = xlobjrep.getCellData(ORSheet, OROid, 53);
	public static String editvolperclose = xlobjrep.getCellData(ORSheet, OROid, 54);
	public static String editvolperhead = xlobjrep.getCellData(ORSheet, OROid, 55);
	public static String editvolperread = xlobjrep.getCellData(ORSheet, OROid, 56);
	public static String editvolperwrite = xlobjrep.getCellData(ORSheet, OROid, 57);
	public static String editvolperexecute = xlobjrep.getCellData(ORSheet, OROid, 58);
	public static String editvolperuser = xlobjrep.getCellData(ORSheet, OROid, 59);
	public static String editvolpersave = xlobjrep.getCellData(ORSheet, OROid, 60);
	public static String editvolperdesc = xlobjrep.getCellData(ORSheet, OROid, 61);
	public static String editvolpergroup = xlobjrep.getCellData(ORSheet, OROid, 62);
	public static String editvolperuserbox = xlobjrep.getCellData(ORSheet, OROid, 63);
	public static String editvolpercross = xlobjrep.getCellData(ORSheet, OROid, 64);
	public static String editvolpereditb = xlobjrep.getCellData(ORSheet, OROid, 65);
	public static String editvolperedithead = xlobjrep.getCellData(ORSheet, OROid, 66);
	public static String editvolperdelete = xlobjrep.getCellData(ORSheet, OROid, 67);
	public static String editvolpernext = xlobjrep.getCellData(ORSheet, OROid, 68);
	public static String editvolperperv = xlobjrep.getCellData(ORSheet, OROid, 69);
	public static String editvolperidlink = xlobjrep.getCellData(ORSheet, OROid, 70);
	public static String editvolpernamelink = xlobjrep.getCellData(ORSheet, OROid, 71);
	public static String editvolperreadlink = xlobjrep.getCellData(ORSheet, OROid, 72);
	public static String editvolperwritelink = xlobjrep.getCellData(ORSheet, OROid, 73);
	public static String editvolperexecutelink = xlobjrep.getCellData(ORSheet, OROid, 74);
	public static String editvolpercreatedlink = xlobjrep.getCellData(ORSheet, OROid, 75);
	public static String editvolpermodifiedlink = xlobjrep.getCellData(ORSheet, OROid, 76);
	
	public static String edithdownarrow = xlobjrep.getCellData(ORSheet, OROid, 35);

	public static String editassignedspace = xlobjrep.getCellData(ORSheet, OROid, 249);
	
	
	public static String uploadsubmenu = xlobjrep.getCellData(ORSheet, OROid, 217);
	
	public static String categorysubmenu = xlobjrep.getCellData(ORSheet, OROid, 128);
	public static String categorytype = xlobjrep.getCellData(ORSheet, OROid, 141);
	public static String requirecheck = xlobjrep.getCellData(ORSheet, OROid, 143);
	public static String categorysave = xlobjrep.getCellData(ORSheet, OROid, 145);
	public static String rowcount = xlobjrep.getCellData(ORSheet, OROid, 218);
	public static String reqpart1 = xlobjrep.getCellData(ORSheet, OROid, 219);
	public static String reqpart2 = xlobjrep.getCellData(ORSheet, OROid, 220);
	public static String reqeditpart1 = xlobjrep.getCellData(ORSheet, OROid, 221);
	public static String reqeditpart2 = xlobjrep.getCellData(ORSheet, OROid, 222);
	public static String addfilesb = xlobjrep.getCellData(ORSheet, OROid, 223);
	public static String cateditb = xlobjrep.getCellData(ORSheet, OROid, 244);
	
	public static String categoryfield = xlobjrep.getCellData(ORSheet, OROid, 245);
	public static String uploaddeleteb = xlobjrep.getCellData(ORSheet, OROid, 246);
	public static String submit = xlobjrep.getCellData(ORSheet, OROid, 247);
	public static String startupload = xlobjrep.getCellData(ORSheet, OROid, 247);
	
	
	
	
	public static WebDriver loadURL() {
		
		switch (Browser) {
		
		case "Firefox":
			driver = new FirefoxDriver();
			driver.get(baseurl);
			break;
		case "Chrome":
			driver = new ChromeDriver();
			driver.get(baseurl);
			break;
		case "IE":
			driver = new InternetExplorerDriver();
			driver.get(baseurl);
			break;
		default:
			System.out.println("Invalid Browser name");
		}
		return driver;
	}
	public void login(int row2 ) throws IOException {
		String TDSheet = "Login";
		testcaseid = "DLP_01";
		int row = 2;
		testrunflag = xltcdata.getCellData(TDSheet, TDTrunflag, row);
		//testcaseid = xltcdata.getCellData(TDSheet, TDTcid, row);
		parameter1 = xltcdata.getCellData(TDSheet, TDPara1, row);
		parameter2 = xltcdata.getCellData(TDSheet, TDPara2, row);
		expectedresult = xltcdata.getCellData(TDSheet, TDExpectedres, row);
	
		spath = testscreenpath + "\\" + TDSheet + "\\" + testcaseid + ".png";

		switch (testrunflag) {
		case "y":
			BaseClass.driver = loadURL();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath(emailprop)).sendKeys(parameter1);
			driver.findElement(By.xpath(passprop)).sendKeys(parameter2);
			driver.findElement(By.xpath(loginbutton)).submit();
		break;
		
		default:
			xltcdata.setCellData(TDSheet, TDResult, row, "NO permission");
		}
		scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// now save the screenshot to a file some place
		FileUtils.copyFile(scrFile, new File(spath));
		xltcdata.setCellData(TDSheet, TDSspath, row, spath);

	}
	
	}
