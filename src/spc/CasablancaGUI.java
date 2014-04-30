/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spc;

import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

/**
 *
 * @author Zarkov
 */
public class CasablancaGUI extends javax.swing.JFrame
{
    Random r = new Random();
    Calendar cal = new GregorianCalendar();
    private Calendar bookRoomStartDate = Calendar.getInstance();
    private Calendar bookRoomEndDate = Calendar.getInstance();
    private Calendar SearchRoomSpecifiedDate = Calendar.getInstance();
    SPC spc = new SPC();
    JDBCInsertQuery jdcbinsert = new JDBCInsertQuery();
    JDBCSelectQuery jdcbselect = new JDBCSelectQuery();
    JDBCDeleteQuery jdcbdelete = new JDBCDeleteQuery();
    JDBCUpdateQuery jdcbUpdate = new JDBCUpdateQuery();
    private DefaultListModel writeList = new DefaultListModel();
    private DefaultListModel writeList1 = new DefaultListModel();
    private DefaultListModel EmptyList = new DefaultListModel();
    private ArrayList<InfoObjectConstructor> guestList = new ArrayList<>();
    private ArrayList<RoomAvaBookConstructor> roomList = new ArrayList<>();
    private ArrayList<RoomTypeIDConstructor> roomListInfo = new ArrayList<>();
    private ArrayList<String> ovcShowRoomsList = new ArrayList<>();
    private Calendar ovcStartDate = Calendar.getInstance();
    private int ovcListIndex = 0;
    private String ovcRoom1 = "001";
    private String ovcRoom2 = "002";
    private String ovcRoom3 = "003";
    private String ovcRoom4 = "004";
    private String ovcRoom5 = "005";
    private String ovcRoom6 = "006";
    private String ovcRoom7 = "007";
    private String ovcRoom8 = "008";
    private String detailsGuestID;
    private String bookingDateFrom;
    private String bookingDateTo;
    private String bookingNumberNights;
    private String bookingRoomID;
    Font fontSystem = new Font("Tahoma", Font.ITALIC, 11);
    Font fontNormal = new Font("Tahoma", Font.BOLD, 11);
    private final ImageIcon IconFree = new javax.swing.ImageIcon(getClass().getResource("/pictures/OVC-Free.png"));
    private final ImageIcon IconBook = new javax.swing.ImageIcon(getClass().getResource("/pictures/OVC-Occupied.png"));
    private final ImageIcon IconFreeBook = new javax.swing.ImageIcon(getClass().getResource("/pictures/OVC-Free-CheckIn.png"));
    private final ImageIcon IconBookFree = new javax.swing.ImageIcon(getClass().getResource("/pictures/OVC-CheckOut-Free.png"));
    private final ImageIcon IconBookBook = new javax.swing.ImageIcon(getClass().getResource("/pictures/OVC-CheckOut-CheckIn.png"));
    private int currentDate;
    private int currentMonth;
    private int currentYear;
    private String deleteBookingRoomID;
    private String deleteBookingGuestID;
    private String deleteBookingStartDate;
    private String deleteBookingEndDate;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
    private SimpleDateFormat sdfDateInt = new SimpleDateFormat("d");
    private SimpleDateFormat sdfMonthInt = new SimpleDateFormat("M");
    private SimpleDateFormat sdfYearshort = new SimpleDateFormat("yy");
    private SimpleDateFormat sdfWeekDayName = new SimpleDateFormat("EEEEE", Locale.ENGLISH);
    private SimpleDateFormat sdfMonthNameShort = new SimpleDateFormat("MMM", Locale.ENGLISH);
    private SimpleDateFormat sdfYearLong = new SimpleDateFormat("yyyy");
    private SimpleDateFormat sdfMonthName = new SimpleDateFormat("MMMMM", Locale.ENGLISH);
    private final String[] list28days = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28"};
    private final String[] list29days = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29"};
    private final String[] list30days = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
    private final String[] list31days = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    private final String[] normalView = new String[] {"001", "002", "003", "004", "005", "006", "007", "008", "009", "010", "011", "012", "013", "014", 
        "015", "016", "017", "018", "019", "020", "021", "022", "023", "024", "025", "026", "027", "028", "029", "030", "031", "032", "033", "034", 
        "035", "036", "037", "038", "039", "040", "041", "042", "043", "044", "045", "046", "047", "048", "049", "050", "051", "052", "053", "054", 
        "055", "056", "057", "058", "059", "060", "061", "062", "063", "064", "065", "066", "067", "068", "069", "070", "071", "072", "073", "074", 
        "075", "076", "077", "078", "079", "080", "081", "082", "083", "084", "085", "086", "087", "088", "089", "090", "091", "092", "093", "094", 
        "095", "096", "097", "098", "099", "100", "101", "102", "103", "104"};
    
    /**
     * Creates new form CasablancaGUI
     */
    public CasablancaGUI()
    {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jDialogSearchCustomer = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabelSearchCustomerNoChange1 = new javax.swing.JLabel();
        jTextFieldSearchCustomerFirstName = new javax.swing.JTextField();
        jLabelSearchCustomerNoChange2 = new javax.swing.JLabel();
        jTextFieldSearchCustomerLastName = new javax.swing.JTextField();
        jLabelSearchCustomerNoChange6 = new javax.swing.JLabel();
        jTextFieldSearchCustomerGuestID = new javax.swing.JTextField();
        jLabelSearchCustomerNoChange3 = new javax.swing.JLabel();
        jTextFieldSearchCustomerCountry = new javax.swing.JTextField();
        jLabelSearchCustomerNoChange4 = new javax.swing.JLabel();
        jTextFieldSearchCustomerPhoneNumber = new javax.swing.JTextField();
        jTextFieldSearchCustomerEmail = new javax.swing.JTextField();
        jLabelSearchCustomerNoChange5 = new javax.swing.JLabel();
        jLabelSearchCustomerNoChange17 = new javax.swing.JLabel();
        jButtonSearchCustomerDetails = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabelSearchCustomerFirstName = new javax.swing.JLabel();
        jLabelSearchCustomerLastName = new javax.swing.JLabel();
        jLabelSearchCustomerCountry = new javax.swing.JLabel();
        jLabelSearchCustomerPhone = new javax.swing.JLabel();
        jLabelSearchCustomerEmail = new javax.swing.JLabel();
        jLabelSearchCustomerNoChange8 = new javax.swing.JLabel();
        jLabelSearchCustomerNoChange9 = new javax.swing.JLabel();
        jLabelSearchCustomerNoChange10 = new javax.swing.JLabel();
        jLabelSearchCustomerNoChange11 = new javax.swing.JLabel();
        jLabelSearchCustomerNoChange12 = new javax.swing.JLabel();
        jLabelSearchCustomerNoChange13 = new javax.swing.JLabel();
        jLabelSearchCustomerGuestID = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabelSearchCustomerNoChange16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListSearchCustomerBookingsHistory = new javax.swing.JList();
        jPanel9 = new javax.swing.JPanel();
        jLabelSearchCustomerNoChange15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListSearchCustomerResult = new javax.swing.JList();
        jButtonShowSelectedCustomerDetails = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButtonSearchCustomerExit = new javax.swing.JButton();
        jButtonSearchCustomerReturnToBooking = new javax.swing.JButton();
        jButtonEditSelectedCustomerDetails = new javax.swing.JButton();
        jDialogSearchRoom = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jRadioButtonSearchRoom1 = new javax.swing.JRadioButton();
        jRadioButtonSearchRoom2 = new javax.swing.JRadioButton();
        jLabelSearchRoomNoChange1 = new javax.swing.JLabel();
        jComboBoxSearchRoomType = new javax.swing.JComboBox();
        jLabelSearchRoomTypePersonsNotifier = new javax.swing.JLabel();
        jRadioButtonSearchRoom3 = new javax.swing.JRadioButton();
        jRadioButtonSearchRoom0 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListSearchRoomResult = new javax.swing.JList();
        jButtonSearchRoomShowRooms = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jButtonSearchRoomRemoveFromList = new javax.swing.JButton();
        jButtonSearchRoomBookRoom = new javax.swing.JButton();
        jButtonSearchRoomExit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabelSearchNoChange2 = new javax.swing.JLabel();
        jComboBoxSearchStartMonth = new javax.swing.JComboBox();
        jComboBoxSearchStartDate = new javax.swing.JComboBox();
        jComboBoxSearchStartYear = new javax.swing.JComboBox();
        jLabelSearchNoChange4 = new javax.swing.JLabel();
        jComboBoxSearchEndMonth = new javax.swing.JComboBox();
        jComboBoxSearchEndDate = new javax.swing.JComboBox();
        jComboBoxSearchEndYear = new javax.swing.JComboBox();
        jButtonRoomSearch = new javax.swing.JButton();
        jLabelSearchRoomResultNotifier = new javax.swing.JLabel();
        jLabelSearchRoomNumberNights = new javax.swing.JLabel();
        buttonGroupSearchRoomChoice = new javax.swing.ButtonGroup();
        jDialogBooking = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabelBookingNoChange1 = new javax.swing.JLabel();
        jTextFieldBookingFirstName = new javax.swing.JTextField();
        jLabelBookingNoChange2 = new javax.swing.JLabel();
        jTextFieldBookingLastName = new javax.swing.JTextField();
        jLabelBookingNoChange3 = new javax.swing.JLabel();
        jTextFieldBookingCountry = new javax.swing.JTextField();
        jLabelBookingNoChange5 = new javax.swing.JLabel();
        jTextFieldBookingEmail = new javax.swing.JTextField();
        jLabelBookingNoChange6 = new javax.swing.JLabel();
        jTextFieldBookingGuestID = new javax.swing.JTextField();
        jButtonBookingCreateID = new javax.swing.JButton();
        jButtonBookingSearchCustomer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelBookingNoChange4 = new javax.swing.JLabel();
        jTextFieldBookingPhoneNumber = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButtonBookingBook = new javax.swing.JButton();
        jButtonBookingExit = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabelBookingNoChange7 = new javax.swing.JLabel();
        jComboBoxBookingRoomType = new javax.swing.JComboBox();
        jLabelBookingRoomTypePersonsNotifier = new javax.swing.JLabel();
        jLabelBookingNoChange8 = new javax.swing.JLabel();
        jComboBoxBookingStartMonth = new javax.swing.JComboBox();
        jComboBoxBookingStartDate = new javax.swing.JComboBox();
        jComboBoxBookingStartYear = new javax.swing.JComboBox();
        jLabelBookingNoChange9 = new javax.swing.JLabel();
        jComboBoxBookingEndMonth = new javax.swing.JComboBox();
        jComboBoxBookingEndDate = new javax.swing.JComboBox();
        jComboBoxBookingEndYear = new javax.swing.JComboBox();
        jButtonSearchForAvailableRoom = new javax.swing.JButton();
        jLabelBookingRoomNotifier = new javax.swing.JLabel();
        jLabelBookingNumberNights = new javax.swing.JLabel();
        jDialogCheckInOut = new javax.swing.JDialog();
        jPanelCheckInList = new javax.swing.JPanel();
        jLabelCheckInOutNotifier = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListCheckInOut = new javax.swing.JList();
        jPanelCheckInButtons = new javax.swing.JPanel();
        jLabelCheckInNoChange2 = new javax.swing.JLabel();
        jComboBoxCheckInMonth = new javax.swing.JComboBox();
        jComboBoxCheckInDate = new javax.swing.JComboBox();
        jComboBoxCheckInYear = new javax.swing.JComboBox();
        jButtonCheckInPrint = new javax.swing.JButton();
        jButtonCheckInSearchCustomer = new javax.swing.JButton();
        jButtonCheckInExit = new javax.swing.JButton();
        jButtonCheckInLoad = new javax.swing.JButton();
        jButtonCheckOutLoad = new javax.swing.JButton();
        jDialogEditDetails = new javax.swing.JDialog();
        jPanelEditBookingRoom = new javax.swing.JPanel();
        jLabelEditDetailsNoChange9 = new javax.swing.JLabel();
        jLabelDetailsRoomType = new javax.swing.JLabel();
        jLabelDetailsRoomID = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelDetailsDateFrom = new javax.swing.JLabel();
        jLabelDetailsDateTo = new javax.swing.JLabel();
        jPanelEditBookingCustomer = new javax.swing.JPanel();
        jLabelEditDetailsNoChange1 = new javax.swing.JLabel();
        jTextFieldEditFirstNameNew = new javax.swing.JTextField();
        jLabelEditDetailsNoChange2 = new javax.swing.JLabel();
        jTextFieldEditLastNameNew = new javax.swing.JTextField();
        jLabelEditDetailsNoChange6 = new javax.swing.JLabel();
        jTextFieldEditCountryNew = new javax.swing.JTextField();
        jLabelEditDetailsNoChange7 = new javax.swing.JLabel();
        jTextFieldEditPhoneNew = new javax.swing.JTextField();
        jLabelEditDetailsNoChange8 = new javax.swing.JLabel();
        jTextFieldEditEmailNew = new javax.swing.JTextField();
        jLabelEditEmailOriginal = new javax.swing.JLabel();
        jLabelEditPhoneOriginal = new javax.swing.JLabel();
        jLabelEditCountryOriginal = new javax.swing.JLabel();
        jLabelEditLastNameOriginal = new javax.swing.JLabel();
        jLabelEditFirstNameOriginal = new javax.swing.JLabel();
        jLabelEditDetailsNoChange3 = new javax.swing.JLabel();
        jLabelEditDetailsNoChange10 = new javax.swing.JLabel();
        jLabelEditDetailsNoChange14 = new javax.swing.JLabel();
        jLabelEditDetailsNoChange15 = new javax.swing.JLabel();
        jLabelEditDetailsNoChange16 = new javax.swing.JLabel();
        jLabelEditGuestIDOriginal = new javax.swing.JLabel();
        jLabelEditDetailsNoChange17 = new javax.swing.JLabel();
        jLabelEditDetailsNoChange5 = new javax.swing.JLabel();
        jLabelEditDetailsNoChange4 = new javax.swing.JLabel();
        jLabelDetailsResultNotifier = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButtonDetailsSaveChanges = new javax.swing.JButton();
        jButtonDetailsExit = new javax.swing.JButton();
        jButtonDetailsChangeBooking = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListDetailsFutureBookings = new javax.swing.JList();
        jButtonDetailsShowBooking = new javax.swing.JButton();
        jDialogDetails = new javax.swing.JDialog();
        jPanelDetailsRoom = new javax.swing.JPanel();
        jLabelDetailsRoomID1 = new javax.swing.JLabel();
        jLabelDetailsRoomType1 = new javax.swing.JLabel();
        jLabelDetailsStartDate = new javax.swing.JLabel();
        jLabelNoChange12 = new javax.swing.JLabel();
        jLabelDetailsBookingDate = new javax.swing.JLabel();
        jLabelDetailsEndDate = new javax.swing.JLabel();
        jLabelNoChange10 = new javax.swing.JLabel();
        jLabelNoChange11 = new javax.swing.JLabel();
        jPanelDetailsCustomer = new javax.swing.JPanel();
        jLabelEditDetailsNoChange18 = new javax.swing.JLabel();
        jLabelDetailsFirstName = new javax.swing.JLabel();
        jLabelEditDetailsNoChange19 = new javax.swing.JLabel();
        jLabelDetailsLastName = new javax.swing.JLabel();
        jLabelEditDetailsNoChange23 = new javax.swing.JLabel();
        jLabelDetailsCountry = new javax.swing.JLabel();
        jLabelEditDetailsNoChange24 = new javax.swing.JLabel();
        jLabelDetailsPhone = new javax.swing.JLabel();
        jLabelEditDetailsNoChange25 = new javax.swing.JLabel();
        jLabelDetailsEmail = new javax.swing.JLabel();
        jLabelEditDetailsNoChange26 = new javax.swing.JLabel();
        jLabelDetailsGuestID = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jButtonExitDetails = new javax.swing.JButton();
        jButtonChangeDetails = new javax.swing.JButton();
        jDialogSetupOverview = new javax.swing.JDialog();
        jPanelSetupOverviewSelectRoomsAtRows = new javax.swing.JPanel();
        jLabelSetupOverviewNoChange1 = new javax.swing.JLabel();
        jLabelSetupOverviewNoChange2 = new javax.swing.JLabel();
        jLabelSetupOverviewNoChange3 = new javax.swing.JLabel();
        jLabelSetupOverviewNoChange4 = new javax.swing.JLabel();
        jLabelSetupOverviewNoChange5 = new javax.swing.JLabel();
        jLabelSetupOverviewNoChange6 = new javax.swing.JLabel();
        jLabelSetupOverviewNoChange7 = new javax.swing.JLabel();
        jLabelSetupOverviewNoChange8 = new javax.swing.JLabel();
        jLabelSetupOverviewNoChange9 = new javax.swing.JLabel();
        jLabelSetupOverviewNoChange10 = new javax.swing.JLabel();
        jTextFieldRow1 = new javax.swing.JTextField();
        jTextFieldRow2 = new javax.swing.JTextField();
        jTextFieldRow3 = new javax.swing.JTextField();
        jTextFieldRow4 = new javax.swing.JTextField();
        jTextFieldRow5 = new javax.swing.JTextField();
        jTextFieldRow6 = new javax.swing.JTextField();
        jTextFieldRow7 = new javax.swing.JTextField();
        jTextFieldRow8 = new javax.swing.JTextField();
        jPanelSetupOverviewSelect14DaysPeriod = new javax.swing.JPanel();
        jLabelSetupOverviewNoChange12 = new javax.swing.JLabel();
        jLabelSetupOverviewNoChange13 = new javax.swing.JLabel();
        jComboBoxSetupOverviewStartMonth = new javax.swing.JComboBox();
        jComboBoxSetupOverviewStartDate = new javax.swing.JComboBox();
        jComboBoxSetupOverviewStartYear = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldSetupOverviewEndMonth = new javax.swing.JTextField();
        jTextFieldSetupOverviewEndDate = new javax.swing.JTextField();
        jTextFieldSetupOverviewEndYear = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jButtonSetupOverviewShowRooms = new javax.swing.JButton();
        jButtonSetupOverviewExit = new javax.swing.JButton();
        jDialogRequestDeleteBooking = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jLabelRequestDeleteBooking = new javax.swing.JLabel();
        jButtonRequestContinue = new javax.swing.JButton();
        jButtonRequestCancel = new javax.swing.JButton();
        jPanelOverviewCellsButtons2 = new javax.swing.JPanel();
        jButtonRoomArrowUp = new javax.swing.JButton();
        jButtonRoomArrowDown = new javax.swing.JButton();
        jPanelMainBookingButtons = new javax.swing.JPanel();
        jButtonBooking = new javax.swing.JButton();
        jPanelMainInfoNotifier = new javax.swing.JPanel();
        jLabelOverviewInfoMessage = new javax.swing.JLabel();
        jPanelOverviewCellsButtons1 = new javax.swing.JPanel();
        jButtonSetupOverview = new javax.swing.JButton();
        jButtonResetOveriew = new javax.swing.JButton();
        jButtonPrevious7Days = new javax.swing.JButton();
        jButtonPrevious14Days = new javax.swing.JButton();
        jButtonNext7Days = new javax.swing.JButton();
        jButtonNext14Days = new javax.swing.JButton();
        jPanelMainSearchButtons = new javax.swing.JPanel();
        jButtonSearchCustomer = new javax.swing.JButton();
        jButtonSearchRoom = new javax.swing.JButton();
        jPanelMainCheckInOutButtons = new javax.swing.JPanel();
        jButtonCheckIn = new javax.swing.JButton();
        jPanelDay01 = new javax.swing.JPanel();
        jLabelDate01Day = new javax.swing.JLabel();
        jLabelDate01 = new javax.swing.JLabel();
        jLabelDate01Year = new javax.swing.JLabel();
        jPanelDay02 = new javax.swing.JPanel();
        jLabelDate02Day = new javax.swing.JLabel();
        jLabelDate02 = new javax.swing.JLabel();
        jLabelDate02Year = new javax.swing.JLabel();
        jPanelDay03 = new javax.swing.JPanel();
        jLabelDate03Day = new javax.swing.JLabel();
        jLabelDate03 = new javax.swing.JLabel();
        jLabelDate03Year = new javax.swing.JLabel();
        jPanelDay04 = new javax.swing.JPanel();
        jLabelDate04Day = new javax.swing.JLabel();
        jLabelDate04 = new javax.swing.JLabel();
        jLabelDate04Year = new javax.swing.JLabel();
        jPanelDay05 = new javax.swing.JPanel();
        jLabelDate05Day = new javax.swing.JLabel();
        jLabelDate05 = new javax.swing.JLabel();
        jLabelDate05Year = new javax.swing.JLabel();
        jPanelDay06 = new javax.swing.JPanel();
        jLabelDate06Day = new javax.swing.JLabel();
        jLabelDate06 = new javax.swing.JLabel();
        jLabelDate06Year = new javax.swing.JLabel();
        jPanelDay07 = new javax.swing.JPanel();
        jLabelDate07Day = new javax.swing.JLabel();
        jLabelDate07 = new javax.swing.JLabel();
        jLabelDate07Year = new javax.swing.JLabel();
        jPanelDay08 = new javax.swing.JPanel();
        jLabelDate08Day = new javax.swing.JLabel();
        jLabelDate08 = new javax.swing.JLabel();
        jLabelDate08Year = new javax.swing.JLabel();
        jPanelDay09 = new javax.swing.JPanel();
        jLabelDate09Day = new javax.swing.JLabel();
        jLabelDate09 = new javax.swing.JLabel();
        jLabelDate09Year = new javax.swing.JLabel();
        jPanelDay10 = new javax.swing.JPanel();
        jLabelDate10Day = new javax.swing.JLabel();
        jLabelDate10 = new javax.swing.JLabel();
        jLabelDate10Year = new javax.swing.JLabel();
        jPanelDay11 = new javax.swing.JPanel();
        jLabelDate11Day = new javax.swing.JLabel();
        jLabelDate11 = new javax.swing.JLabel();
        jLabelDate11Year = new javax.swing.JLabel();
        jPanelDay12 = new javax.swing.JPanel();
        jLabelDate12Day = new javax.swing.JLabel();
        jLabelDate12 = new javax.swing.JLabel();
        jLabelDate12Year = new javax.swing.JLabel();
        jPanelDay13 = new javax.swing.JPanel();
        jLabelDate13Day = new javax.swing.JLabel();
        jLabelDate13 = new javax.swing.JLabel();
        jLabelDate13Year = new javax.swing.JLabel();
        jPanelDay14 = new javax.swing.JPanel();
        jLabelDate14Day = new javax.swing.JLabel();
        jLabelDate14 = new javax.swing.JLabel();
        jLabelDate14Year = new javax.swing.JLabel();
        jPanelRoom1 = new javax.swing.JPanel();
        jLabelRoom1RoomID = new javax.swing.JLabel();
        jLabelRoom1RoomType = new javax.swing.JLabel();
        jPanelRoom2 = new javax.swing.JPanel();
        jLabelRoom2RoomID = new javax.swing.JLabel();
        jLabelRoom2RoomType = new javax.swing.JLabel();
        jPanelRoom3 = new javax.swing.JPanel();
        jLabelRoom3RoomID = new javax.swing.JLabel();
        jLabelRoom3RoomType = new javax.swing.JLabel();
        jPanelRoom4 = new javax.swing.JPanel();
        jLabelRoom4RoomID = new javax.swing.JLabel();
        jLabelRoom4RoomType = new javax.swing.JLabel();
        jPanelRoom5 = new javax.swing.JPanel();
        jLabelRoom5RoomID = new javax.swing.JLabel();
        jLabelRoom5RoomType = new javax.swing.JLabel();
        jPanelRoom6 = new javax.swing.JPanel();
        jLabelRoom6RoomID = new javax.swing.JLabel();
        jLabelRoom6RoomType = new javax.swing.JLabel();
        jPanelRoom7 = new javax.swing.JPanel();
        jLabelRoom7RoomID = new javax.swing.JLabel();
        jLabelRoom7RoomType = new javax.swing.JLabel();
        jPanelRoom8 = new javax.swing.JPanel();
        jLabelRoom8RoomID = new javax.swing.JLabel();
        jLabelRoom8RoomType = new javax.swing.JLabel();
        jPanelOverviewCells = new javax.swing.JPanel();
        jLabelOC101 = new javax.swing.JLabel();
        jLabelOC102 = new javax.swing.JLabel();
        jLabelOC103 = new javax.swing.JLabel();
        jLabelOC104 = new javax.swing.JLabel();
        jLabelOC105 = new javax.swing.JLabel();
        jLabelOC106 = new javax.swing.JLabel();
        jLabelOC107 = new javax.swing.JLabel();
        jLabelOC108 = new javax.swing.JLabel();
        jLabelOC109 = new javax.swing.JLabel();
        jLabelOC110 = new javax.swing.JLabel();
        jLabelOC111 = new javax.swing.JLabel();
        jLabelOC112 = new javax.swing.JLabel();
        jLabelOC113 = new javax.swing.JLabel();
        jLabelOC114 = new javax.swing.JLabel();
        jLabelOC201 = new javax.swing.JLabel();
        jLabelOC202 = new javax.swing.JLabel();
        jLabelOC203 = new javax.swing.JLabel();
        jLabelOC204 = new javax.swing.JLabel();
        jLabelOC205 = new javax.swing.JLabel();
        jLabelOC206 = new javax.swing.JLabel();
        jLabelOC207 = new javax.swing.JLabel();
        jLabelOC208 = new javax.swing.JLabel();
        jLabelOC209 = new javax.swing.JLabel();
        jLabelOC210 = new javax.swing.JLabel();
        jLabelOC211 = new javax.swing.JLabel();
        jLabelOC212 = new javax.swing.JLabel();
        jLabelOC213 = new javax.swing.JLabel();
        jLabelOC214 = new javax.swing.JLabel();
        jLabelOC301 = new javax.swing.JLabel();
        jLabelOC302 = new javax.swing.JLabel();
        jLabelOC303 = new javax.swing.JLabel();
        jLabelOC304 = new javax.swing.JLabel();
        jLabelOC305 = new javax.swing.JLabel();
        jLabelOC306 = new javax.swing.JLabel();
        jLabelOC307 = new javax.swing.JLabel();
        jLabelOC308 = new javax.swing.JLabel();
        jLabelOC309 = new javax.swing.JLabel();
        jLabelOC310 = new javax.swing.JLabel();
        jLabelOC311 = new javax.swing.JLabel();
        jLabelOC312 = new javax.swing.JLabel();
        jLabelOC313 = new javax.swing.JLabel();
        jLabelOC314 = new javax.swing.JLabel();
        jLabelOC401 = new javax.swing.JLabel();
        jLabelOC402 = new javax.swing.JLabel();
        jLabelOC403 = new javax.swing.JLabel();
        jLabelOC404 = new javax.swing.JLabel();
        jLabelOC405 = new javax.swing.JLabel();
        jLabelOC406 = new javax.swing.JLabel();
        jLabelOC407 = new javax.swing.JLabel();
        jLabelOC408 = new javax.swing.JLabel();
        jLabelOC409 = new javax.swing.JLabel();
        jLabelOC410 = new javax.swing.JLabel();
        jLabelOC411 = new javax.swing.JLabel();
        jLabelOC412 = new javax.swing.JLabel();
        jLabelOC413 = new javax.swing.JLabel();
        jLabelOC414 = new javax.swing.JLabel();
        jLabelOC501 = new javax.swing.JLabel();
        jLabelOC502 = new javax.swing.JLabel();
        jLabelOC503 = new javax.swing.JLabel();
        jLabelOC504 = new javax.swing.JLabel();
        jLabelOC505 = new javax.swing.JLabel();
        jLabelOC506 = new javax.swing.JLabel();
        jLabelOC507 = new javax.swing.JLabel();
        jLabelOC508 = new javax.swing.JLabel();
        jLabelOC509 = new javax.swing.JLabel();
        jLabelOC510 = new javax.swing.JLabel();
        jLabelOC511 = new javax.swing.JLabel();
        jLabelOC512 = new javax.swing.JLabel();
        jLabelOC513 = new javax.swing.JLabel();
        jLabelOC514 = new javax.swing.JLabel();
        jLabelOC601 = new javax.swing.JLabel();
        jLabelOC602 = new javax.swing.JLabel();
        jLabelOC603 = new javax.swing.JLabel();
        jLabelOC604 = new javax.swing.JLabel();
        jLabelOC605 = new javax.swing.JLabel();
        jLabelOC606 = new javax.swing.JLabel();
        jLabelOC607 = new javax.swing.JLabel();
        jLabelOC608 = new javax.swing.JLabel();
        jLabelOC609 = new javax.swing.JLabel();
        jLabelOC610 = new javax.swing.JLabel();
        jLabelOC611 = new javax.swing.JLabel();
        jLabelOC612 = new javax.swing.JLabel();
        jLabelOC613 = new javax.swing.JLabel();
        jLabelOC614 = new javax.swing.JLabel();
        jLabelOC701 = new javax.swing.JLabel();
        jLabelOC702 = new javax.swing.JLabel();
        jLabelOC703 = new javax.swing.JLabel();
        jLabelOC704 = new javax.swing.JLabel();
        jLabelOC705 = new javax.swing.JLabel();
        jLabelOC706 = new javax.swing.JLabel();
        jLabelOC707 = new javax.swing.JLabel();
        jLabelOC708 = new javax.swing.JLabel();
        jLabelOC709 = new javax.swing.JLabel();
        jLabelOC710 = new javax.swing.JLabel();
        jLabelOC711 = new javax.swing.JLabel();
        jLabelOC712 = new javax.swing.JLabel();
        jLabelOC713 = new javax.swing.JLabel();
        jLabelOC714 = new javax.swing.JLabel();
        jLabelOC801 = new javax.swing.JLabel();
        jLabelOC802 = new javax.swing.JLabel();
        jLabelOC803 = new javax.swing.JLabel();
        jLabelOC804 = new javax.swing.JLabel();
        jLabelOC805 = new javax.swing.JLabel();
        jLabelOC806 = new javax.swing.JLabel();
        jLabelOC807 = new javax.swing.JLabel();
        jLabelOC808 = new javax.swing.JLabel();
        jLabelOC809 = new javax.swing.JLabel();
        jLabelOC810 = new javax.swing.JLabel();
        jLabelOC811 = new javax.swing.JLabel();
        jLabelOC812 = new javax.swing.JLabel();
        jLabelOC813 = new javax.swing.JLabel();
        jLabelOC814 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabelMainShowDate = new javax.swing.JLabel();

        jDialogSearchCustomer.setTitle("Search Customer Details");
        jDialogSearchCustomer.setAlwaysOnTop(true);
        jDialogSearchCustomer.setMinimumSize(new java.awt.Dimension(700, 513));
        jDialogSearchCustomer.setResizable(false);

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setPreferredSize(new java.awt.Dimension(216, 446));

        jLabelSearchCustomerNoChange1.setText("First Name:");

        jTextFieldSearchCustomerFirstName.setPreferredSize(new java.awt.Dimension(192, 20));

        jLabelSearchCustomerNoChange2.setText("Last Name:");

        jTextFieldSearchCustomerLastName.setPreferredSize(new java.awt.Dimension(192, 20));

        jLabelSearchCustomerNoChange6.setText("Guest-ID");

        jTextFieldSearchCustomerGuestID.setPreferredSize(new java.awt.Dimension(192, 20));

        jLabelSearchCustomerNoChange3.setText("Country:");

        jTextFieldSearchCustomerCountry.setPreferredSize(new java.awt.Dimension(192, 20));

        jLabelSearchCustomerNoChange4.setText("Phone Number:");

        jTextFieldSearchCustomerPhoneNumber.setPreferredSize(new java.awt.Dimension(192, 20));

        jTextFieldSearchCustomerEmail.setPreferredSize(new java.awt.Dimension(192, 20));

        jLabelSearchCustomerNoChange5.setText("E-mail Address:");

        jLabelSearchCustomerNoChange17.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabelSearchCustomerNoChange17.setText("<html>Type in one or more information in the<br>boxes below and click search:</html>");

        jButtonSearchCustomerDetails.setText("Search");
        jButtonSearchCustomerDetails.setPreferredSize(new java.awt.Dimension(192, 35));
        jButtonSearchCustomerDetails.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSearchCustomerDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelSearchCustomerNoChange6)
                            .addComponent(jLabelSearchCustomerNoChange2)
                            .addComponent(jLabelSearchCustomerNoChange1)
                            .addComponent(jTextFieldSearchCustomerLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSearchCustomerGuestID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSearchCustomerFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSearchCustomerNoChange3)
                            .addComponent(jTextFieldSearchCustomerCountry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSearchCustomerNoChange4)
                            .addComponent(jTextFieldSearchCustomerPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSearchCustomerEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSearchCustomerNoChange5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabelSearchCustomerNoChange17))
                .addGap(10, 10, 10))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonSearchCustomerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelSearchCustomerNoChange17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelSearchCustomerNoChange6)
                .addGap(0, 0, 0)
                .addComponent(jTextFieldSearchCustomerGuestID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelSearchCustomerNoChange1)
                .addGap(0, 0, 0)
                .addComponent(jTextFieldSearchCustomerFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelSearchCustomerNoChange2)
                .addGap(0, 0, 0)
                .addComponent(jTextFieldSearchCustomerLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelSearchCustomerNoChange3)
                .addGap(0, 0, 0)
                .addComponent(jTextFieldSearchCustomerCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelSearchCustomerNoChange4)
                .addGap(0, 0, 0)
                .addComponent(jTextFieldSearchCustomerPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelSearchCustomerNoChange5)
                .addGap(0, 0, 0)
                .addComponent(jTextFieldSearchCustomerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSearchCustomerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setPreferredSize(new java.awt.Dimension(216, 428));

        jLabelSearchCustomerFirstName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSearchCustomerFirstName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabelSearchCustomerFirstName.setPreferredSize(new java.awt.Dimension(192, 20));

        jLabelSearchCustomerLastName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSearchCustomerLastName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabelSearchCustomerLastName.setPreferredSize(new java.awt.Dimension(192, 20));

        jLabelSearchCustomerCountry.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSearchCustomerCountry.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabelSearchCustomerCountry.setPreferredSize(new java.awt.Dimension(192, 20));

        jLabelSearchCustomerPhone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSearchCustomerPhone.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabelSearchCustomerPhone.setPreferredSize(new java.awt.Dimension(192, 20));

        jLabelSearchCustomerEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSearchCustomerEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabelSearchCustomerEmail.setPreferredSize(new java.awt.Dimension(192, 20));

        jLabelSearchCustomerNoChange8.setText("First Name:");

        jLabelSearchCustomerNoChange9.setText("Last Name:");

        jLabelSearchCustomerNoChange10.setText("Country:");

        jLabelSearchCustomerNoChange11.setText("Phone Number:");

        jLabelSearchCustomerNoChange12.setText("E-mail Address:");

        jLabelSearchCustomerNoChange13.setText("Guest-ID");

        jLabelSearchCustomerGuestID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSearchCustomerGuestID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabelSearchCustomerGuestID.setPreferredSize(new java.awt.Dimension(192, 20));

        jLabel59.setText("Details for selected customer:");

        jLabelSearchCustomerNoChange16.setText("Booking history for selected customer:");

        jScrollPane4.setPreferredSize(new java.awt.Dimension(100, 100));

        jListSearchCustomerBookingsHistory.setEnabled(false);
        jScrollPane4.setViewportView(jListSearchCustomerBookingsHistory);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelSearchCustomerNoChange8)
                                    .addComponent(jLabelSearchCustomerNoChange9)
                                    .addComponent(jLabelSearchCustomerNoChange10)
                                    .addComponent(jLabelSearchCustomerNoChange11)
                                    .addComponent(jLabelSearchCustomerNoChange12)
                                    .addComponent(jLabelSearchCustomerEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSearchCustomerPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSearchCustomerCountry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSearchCustomerLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSearchCustomerFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel59)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelSearchCustomerNoChange13)
                            .addComponent(jLabelSearchCustomerGuestID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabelSearchCustomerNoChange16)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel59)
                .addGap(12, 12, 12)
                .addComponent(jLabelSearchCustomerNoChange13)
                .addGap(0, 0, 0)
                .addComponent(jLabelSearchCustomerGuestID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabelSearchCustomerNoChange8)
                .addGap(0, 0, 0)
                .addComponent(jLabelSearchCustomerFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabelSearchCustomerNoChange9)
                .addGap(0, 0, 0)
                .addComponent(jLabelSearchCustomerLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabelSearchCustomerNoChange10)
                .addGap(0, 0, 0)
                .addComponent(jLabelSearchCustomerCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabelSearchCustomerNoChange11)
                .addGap(0, 0, 0)
                .addComponent(jLabelSearchCustomerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabelSearchCustomerNoChange12)
                .addGap(0, 0, 0)
                .addComponent(jLabelSearchCustomerEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabelSearchCustomerNoChange16)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelSearchCustomerNoChange15.setText("Persons found with the entered information:");

        jListSearchCustomerResult.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jListSearchCustomerResult);

        jButtonShowSelectedCustomerDetails.setText("Show details for selected customer");
        jButtonShowSelectedCustomerDetails.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jButtonShowSelectedCustomerDetails.setPreferredSize(new java.awt.Dimension(237, 35));
        jButtonShowSelectedCustomerDetails.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonShowSelectedCustomerDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(jLabelSearchCustomerNoChange15)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonShowSelectedCustomerDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelSearchCustomerNoChange15)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jButtonShowSelectedCustomerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jButtonSearchCustomerExit.setText("Exit");
        jButtonSearchCustomerExit.setPreferredSize(new java.awt.Dimension(192, 35));
        jButtonSearchCustomerExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSearchCustomerExitActionPerformed(evt);
            }
        });

        jButtonSearchCustomerReturnToBooking.setText("Return to Booking using selected customer");
        jButtonSearchCustomerReturnToBooking.setMargin(new java.awt.Insets(2, 10, 2, 10));
        jButtonSearchCustomerReturnToBooking.setPreferredSize(new java.awt.Dimension(237, 35));
        jButtonSearchCustomerReturnToBooking.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSearchCustomerReturnToBookingActionPerformed(evt);
            }
        });

        jButtonEditSelectedCustomerDetails.setText("Edit selected customer");
        jButtonEditSelectedCustomerDetails.setPreferredSize(new java.awt.Dimension(192, 35));
        jButtonEditSelectedCustomerDetails.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonEditSelectedCustomerDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButtonEditSelectedCustomerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSearchCustomerReturnToBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jButtonSearchCustomerExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonSearchCustomerReturnToBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEditSelectedCustomerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonSearchCustomerExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialogSearchCustomerLayout = new javax.swing.GroupLayout(jDialogSearchCustomer.getContentPane());
        jDialogSearchCustomer.getContentPane().setLayout(jDialogSearchCustomerLayout);
        jDialogSearchCustomerLayout.setHorizontalGroup(
            jDialogSearchCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogSearchCustomerLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogSearchCustomerLayout.setVerticalGroup(
            jDialogSearchCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogSearchCustomerLayout.createSequentialGroup()
                .addGroup(jDialogSearchCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jDialogSearchRoom.setTitle("Search Room Details");
        jDialogSearchRoom.setAlwaysOnTop(true);
        jDialogSearchRoom.setMinimumSize(new java.awt.Dimension(532, 530));
        jDialogSearchRoom.setResizable(false);

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroupSearchRoomChoice.add(jRadioButtonSearchRoom1);
        jRadioButtonSearchRoom1.setText("Search for rooms available in the entire specified period.");
        jRadioButtonSearchRoom1.setPreferredSize(new java.awt.Dimension(295, 24));
        jRadioButtonSearchRoom1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jRadioButtonSearchRoom1ActionPerformed(evt);
            }
        });

        buttonGroupSearchRoomChoice.add(jRadioButtonSearchRoom2);
        jRadioButtonSearchRoom2.setText("<html>Search for rooms with check-in on the specified<br>start date.</html>");
        jRadioButtonSearchRoom2.setPreferredSize(new java.awt.Dimension(265, 30));
        jRadioButtonSearchRoom2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jRadioButtonSearchRoom2ActionPerformed(evt);
            }
        });

        jLabelSearchRoomNoChange1.setText("Search among room type:");
        jLabelSearchRoomNoChange1.setPreferredSize(new java.awt.Dimension(124, 22));

        jComboBoxSearchRoomType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All rooms", "Single room", "Double room", "Family room" }));
        jComboBoxSearchRoomType.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxSearchRoomTypeActionPerformed(evt);
            }
        });

        jLabelSearchRoomTypePersonsNotifier.setText("(5 persons)");
        jLabelSearchRoomTypePersonsNotifier.setPreferredSize(new java.awt.Dimension(70, 22));

        buttonGroupSearchRoomChoice.add(jRadioButtonSearchRoom3);
        jRadioButtonSearchRoom3.setText("<html>Search for rooms with check-out on the specified<br>start date.</html>");
        jRadioButtonSearchRoom3.setPreferredSize(new java.awt.Dimension(265, 30));
        jRadioButtonSearchRoom3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jRadioButtonSearchRoom3ActionPerformed(evt);
            }
        });

        buttonGroupSearchRoomChoice.add(jRadioButtonSearchRoom0);
        jRadioButtonSearchRoom0.setSelected(true);
        jRadioButtonSearchRoom0.setText("Search for all rooms of specified type.");
        jRadioButtonSearchRoom0.setPreferredSize(new java.awt.Dimension(295, 24));
        jRadioButtonSearchRoom0.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jRadioButtonSearchRoom0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonSearchRoom0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonSearchRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonSearchRoom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabelSearchRoomNoChange1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jComboBoxSearchRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabelSearchRoomTypePersonsNotifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRadioButtonSearchRoom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelSearchRoomNoChange1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelSearchRoomTypePersonsNotifier, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxSearchRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jRadioButtonSearchRoom0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jRadioButtonSearchRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jRadioButtonSearchRoom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jRadioButtonSearchRoom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(527, 176));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(160, 215));

        jListSearchRoomResult.setModel(new javax.swing.AbstractListModel()
        {
            String[] strings = { "Room  001  -  Single", "Room  029  -  Single", "Room  030  -  Single", "Room  031  -  Single", "Room  032  -  Single", "Room 033 - Single", "Room 067 - Double", "Room 072 - Double", "Room 073 - Double", "Room 076 - Double", "Room 088 - Family", "Room 094 - Family", "Room 096 - Family", "Room 103 - Family", "Room 104 - Family" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jListSearchRoomResult.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListSearchRoomResult.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jListSearchRoomResultMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jListSearchRoomResult);

        jButtonSearchRoomShowRooms.setText("Show rooms in Overview");
        jButtonSearchRoomShowRooms.setPreferredSize(new java.awt.Dimension(178, 30));
        jButtonSearchRoomShowRooms.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSearchRoomShowRoomsActionPerformed(evt);
            }
        });

        jLabel61.setText("Search result:");

        jButtonSearchRoomRemoveFromList.setText("Remove from list");
        jButtonSearchRoomRemoveFromList.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButtonSearchRoomRemoveFromList.setPreferredSize(new java.awt.Dimension(178, 30));
        jButtonSearchRoomRemoveFromList.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSearchRoomRemoveFromListActionPerformed(evt);
            }
        });

        jButtonSearchRoomBookRoom.setText("Book selected room");
        jButtonSearchRoomBookRoom.setPreferredSize(new java.awt.Dimension(178, 30));
        jButtonSearchRoomBookRoom.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSearchRoomBookRoomActionPerformed(evt);
            }
        });

        jButtonSearchRoomExit.setText("Exit");
        jButtonSearchRoomExit.setPreferredSize(new java.awt.Dimension(178, 30));
        jButtonSearchRoomExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSearchRoomExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonSearchRoomShowRooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonSearchRoomRemoveFromList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonSearchRoomBookRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearchRoomExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButtonSearchRoomShowRooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonSearchRoomRemoveFromList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonSearchRoomBookRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSearchRoomExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelSearchNoChange2.setText("Specify start date:");

        jComboBoxSearchStartMonth.setMaximumRowCount(13);
        jComboBoxSearchStartMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jComboBoxSearchStartMonth.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxSearchStartMonthActionPerformed(evt);
            }
        });

        jComboBoxSearchStartDate.setMaximumRowCount(13);
        jComboBoxSearchStartDate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBoxSearchStartDate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxSearchStartDateActionPerformed(evt);
            }
        });

        jComboBoxSearchStartYear.setMaximumRowCount(13);
        jComboBoxSearchStartYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        jComboBoxSearchStartYear.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxSearchStartYearActionPerformed(evt);
            }
        });

        jLabelSearchNoChange4.setText("Specify end date:");

        jComboBoxSearchEndMonth.setMaximumRowCount(12);
        jComboBoxSearchEndMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jComboBoxSearchEndMonth.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxSearchEndMonthActionPerformed(evt);
            }
        });

        jComboBoxSearchEndDate.setMaximumRowCount(12);
        jComboBoxSearchEndDate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBoxSearchEndDate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxSearchEndDateActionPerformed(evt);
            }
        });

        jComboBoxSearchEndYear.setMaximumRowCount(12);
        jComboBoxSearchEndYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        jComboBoxSearchEndYear.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxSearchEndYearActionPerformed(evt);
            }
        });

        jButtonRoomSearch.setText("Search rooms");
        jButtonRoomSearch.setPreferredSize(new java.awt.Dimension(178, 25));
        jButtonRoomSearch.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonRoomSearchActionPerformed(evt);
            }
        });

        jLabelSearchRoomResultNotifier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSearchRoomResultNotifier.setText("28 rooms found...");
        jLabelSearchRoomResultNotifier.setPreferredSize(new java.awt.Dimension(178, 20));

        jLabelSearchRoomNumberNights.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelSearchRoomNumberNights.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSearchRoomNumberNights.setText("(7 Nights)");
        jLabelSearchRoomNumberNights.setPreferredSize(new java.awt.Dimension(178, 34));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jComboBoxSearchStartMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxSearchStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxSearchStartYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelSearchNoChange2)
                    .addComponent(jLabelSearchNoChange4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jComboBoxSearchEndMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxSearchEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxSearchEndYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelSearchRoomResultNotifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRoomSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSearchRoomNumberNights, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelSearchNoChange2)
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSearchStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSearchStartMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSearchStartYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabelSearchNoChange4)
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSearchEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSearchEndMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSearchEndYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabelSearchRoomNumberNights, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelSearchRoomResultNotifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRoomSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jDialogSearchRoomLayout = new javax.swing.GroupLayout(jDialogSearchRoom.getContentPane());
        jDialogSearchRoom.getContentPane().setLayout(jDialogSearchRoomLayout);
        jDialogSearchRoomLayout.setHorizontalGroup(
            jDialogSearchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogSearchRoomLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jDialogSearchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDialogSearchRoomLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        jDialogSearchRoomLayout.setVerticalGroup(
            jDialogSearchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogSearchRoomLayout.createSequentialGroup()
                .addGroup(jDialogSearchRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        jDialogBooking.setTitle("New Booking");
        jDialogBooking.setAlwaysOnTop(true);
        jDialogBooking.setMinimumSize(new java.awt.Dimension(410, 478));
        jDialogBooking.setResizable(false);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelBookingNoChange1.setText("Enter First Name:");

        jTextFieldBookingFirstName.setPreferredSize(new java.awt.Dimension(178, 20));
        jTextFieldBookingFirstName.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldBookingFirstNameActionPerformed(evt);
            }
        });

        jLabelBookingNoChange2.setText("Enter Last Name:");

        jTextFieldBookingLastName.setPreferredSize(new java.awt.Dimension(178, 20));

        jLabelBookingNoChange3.setText("Enter Country:");

        jTextFieldBookingCountry.setPreferredSize(new java.awt.Dimension(178, 20));

        jLabelBookingNoChange5.setText("Enter E-mail Address:");

        jTextFieldBookingEmail.setPreferredSize(new java.awt.Dimension(178, 20));

        jLabelBookingNoChange6.setText("Guest-ID");

        jTextFieldBookingGuestID.setEditable(false);
        jTextFieldBookingGuestID.setPreferredSize(new java.awt.Dimension(84, 20));

        jButtonBookingCreateID.setText("Create ID");
        jButtonBookingCreateID.setPreferredSize(new java.awt.Dimension(84, 20));
        jButtonBookingCreateID.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBookingCreateIDActionPerformed(evt);
            }
        });

        jButtonBookingSearchCustomer.setText("Search for customer");
        jButtonBookingSearchCustomer.setPreferredSize(new java.awt.Dimension(178, 35));
        jButtonBookingSearchCustomer.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBookingSearchCustomerActionPerformed(evt);
            }
        });

        jLabel1.setText("Existing customer?");

        jLabelBookingNoChange4.setText("Enter Phone-Number:");

        jTextFieldBookingPhoneNumber.setPreferredSize(new java.awt.Dimension(178, 20));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelBookingNoChange6)
                                    .addComponent(jLabelBookingNoChange2)
                                    .addComponent(jTextFieldBookingLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelBookingNoChange3)
                                    .addComponent(jTextFieldBookingCountry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jTextFieldBookingGuestID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jButtonBookingCreateID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonBookingSearchCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelBookingNoChange1)
                                    .addComponent(jTextFieldBookingFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldBookingEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelBookingNoChange5)
                                    .addComponent(jLabelBookingNoChange4)
                                    .addComponent(jTextFieldBookingPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelBookingNoChange1)
                .addGap(0, 0, 0)
                .addComponent(jTextFieldBookingFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabelBookingNoChange2)
                .addGap(0, 0, 0)
                .addComponent(jTextFieldBookingLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabelBookingNoChange3)
                .addGap(0, 0, 0)
                .addComponent(jTextFieldBookingCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabelBookingNoChange4)
                .addGap(0, 0, 0)
                .addComponent(jTextFieldBookingPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabelBookingNoChange5)
                .addGap(0, 0, 0)
                .addComponent(jTextFieldBookingEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabelBookingNoChange6)
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBookingGuestID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBookingCreateID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jButtonBookingSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jButtonBookingBook.setText("Book Room");
        jButtonBookingBook.setPreferredSize(new java.awt.Dimension(178, 35));
        jButtonBookingBook.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBookingBookActionPerformed(evt);
            }
        });

        jButtonBookingExit.setText("Exit");
        jButtonBookingExit.setPreferredSize(new java.awt.Dimension(178, 35));
        jButtonBookingExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBookingExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButtonBookingBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonBookingExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBookingExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBookingBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelBookingNoChange7.setText("Search among room type:");

        jComboBoxBookingRoomType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Single room", "Double room", "Family room" }));
        jComboBoxBookingRoomType.setPreferredSize(new java.awt.Dimension(86, 20));
        jComboBoxBookingRoomType.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxBookingRoomTypeActionPerformed(evt);
            }
        });

        jLabelBookingRoomTypePersonsNotifier.setText("(5 persons)");
        jLabelBookingRoomTypePersonsNotifier.setPreferredSize(new java.awt.Dimension(70, 22));

        jLabelBookingNoChange8.setText("Start date:");

        jComboBoxBookingStartMonth.setMaximumRowCount(12);
        jComboBoxBookingStartMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jComboBoxBookingStartMonth.setPreferredSize(new java.awt.Dimension(78, 20));
        jComboBoxBookingStartMonth.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxBookingStartMonthActionPerformed(evt);
            }
        });

        jComboBoxBookingStartDate.setMaximumRowCount(12);
        jComboBoxBookingStartDate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBoxBookingStartDate.setPreferredSize(new java.awt.Dimension(38, 20));
        jComboBoxBookingStartDate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxBookingStartDateActionPerformed(evt);
            }
        });

        jComboBoxBookingStartYear.setMaximumRowCount(12);
        jComboBoxBookingStartYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        jComboBoxBookingStartYear.setPreferredSize(new java.awt.Dimension(50, 20));
        jComboBoxBookingStartYear.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxBookingStartYearActionPerformed(evt);
            }
        });

        jLabelBookingNoChange9.setText("End date:");

        jComboBoxBookingEndMonth.setMaximumRowCount(12);
        jComboBoxBookingEndMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jComboBoxBookingEndMonth.setPreferredSize(new java.awt.Dimension(78, 20));
        jComboBoxBookingEndMonth.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxBookingEndMonthActionPerformed(evt);
            }
        });

        jComboBoxBookingEndDate.setMaximumRowCount(12);
        jComboBoxBookingEndDate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBoxBookingEndDate.setPreferredSize(new java.awt.Dimension(38, 20));
        jComboBoxBookingEndDate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxBookingEndDateActionPerformed(evt);
            }
        });

        jComboBoxBookingEndYear.setMaximumRowCount(12);
        jComboBoxBookingEndYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        jComboBoxBookingEndYear.setPreferredSize(new java.awt.Dimension(50, 20));
        jComboBoxBookingEndYear.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxBookingEndYearActionPerformed(evt);
            }
        });

        jButtonSearchForAvailableRoom.setText("Find available room");
        jButtonSearchForAvailableRoom.setPreferredSize(new java.awt.Dimension(178, 35));
        jButtonSearchForAvailableRoom.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSearchForAvailableRoomActionPerformed(evt);
            }
        });

        jLabelBookingRoomNotifier.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabelBookingRoomNotifier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBookingRoomNotifier.setText("<html>There are no available rooms of the selected type in the specified period...</html>");

        jLabelBookingNumberNights.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelBookingNumberNights.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBookingNumberNights.setText("(7 Nights)");
        jLabelBookingNumberNights.setPreferredSize(new java.awt.Dimension(178, 34));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelBookingNumberNights, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jComboBoxBookingStartMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxBookingStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxBookingStartYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelBookingNoChange8)
                            .addComponent(jLabelBookingNoChange9)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jComboBoxBookingEndMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxBookingEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxBookingEndYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelBookingNoChange7)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jComboBoxBookingRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabelBookingRoomTypePersonsNotifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelBookingRoomNotifier, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jButtonSearchForAvailableRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelBookingNoChange7)
                .addGap(0, 0, 0)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBookingRoomTypePersonsNotifier, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBookingRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabelBookingNoChange8)
                .addGap(0, 0, 0)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxBookingStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBookingStartMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBookingStartYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabelBookingNoChange9)
                .addGap(0, 0, 0)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxBookingEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBookingEndMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBookingEndYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabelBookingNumberNights, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelBookingRoomNotifier, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSearchForAvailableRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jDialogBookingLayout = new javax.swing.GroupLayout(jDialogBooking.getContentPane());
        jDialogBooking.getContentPane().setLayout(jDialogBookingLayout);
        jDialogBookingLayout.setHorizontalGroup(
            jDialogBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogBookingLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jDialogBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDialogBookingLayout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        jDialogBookingLayout.setVerticalGroup(
            jDialogBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogBookingLayout.createSequentialGroup()
                .addGroup(jDialogBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jDialogCheckInOut.setTitle("Find Check-In/Out");
        jDialogCheckInOut.setAlwaysOnTop(true);
        jDialogCheckInOut.setMinimumSize(new java.awt.Dimension(605, 377));
        jDialogCheckInOut.setResizable(false);

        jPanelCheckInList.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelCheckInList.setPreferredSize(new java.awt.Dimension(600, 250));

        jLabelCheckInOutNotifier.setText("Check-ins on the specified date:");

        jListCheckInOut.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(jListCheckInOut);

        javax.swing.GroupLayout jPanelCheckInListLayout = new javax.swing.GroupLayout(jPanelCheckInList);
        jPanelCheckInList.setLayout(jPanelCheckInListLayout);
        jPanelCheckInListLayout.setHorizontalGroup(
            jPanelCheckInListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCheckInListLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane5)
                .addGap(10, 10, 10))
            .addGroup(jPanelCheckInListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCheckInOutNotifier, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCheckInListLayout.setVerticalGroup(
            jPanelCheckInListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCheckInListLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelCheckInOutNotifier)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        jPanelCheckInButtons.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCheckInNoChange2.setText("Date:");

        jComboBoxCheckInMonth.setMaximumRowCount(12);
        jComboBoxCheckInMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jComboBoxCheckInMonth.setPreferredSize(new java.awt.Dimension(78, 20));
        jComboBoxCheckInMonth.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxCheckInMonthActionPerformed(evt);
            }
        });

        jComboBoxCheckInDate.setMaximumRowCount(12);
        jComboBoxCheckInDate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBoxCheckInDate.setPreferredSize(new java.awt.Dimension(38, 20));

        jComboBoxCheckInYear.setMaximumRowCount(12);
        jComboBoxCheckInYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        jComboBoxCheckInYear.setPreferredSize(new java.awt.Dimension(50, 20));
        jComboBoxCheckInYear.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxCheckInYearActionPerformed(evt);
            }
        });

        jButtonCheckInPrint.setText("Print daily check-in to file");
        jButtonCheckInPrint.setPreferredSize(new java.awt.Dimension(178, 35));
        jButtonCheckInPrint.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonCheckInPrintActionPerformed(evt);
            }
        });

        jButtonCheckInSearchCustomer.setText("Search for customer");
        jButtonCheckInSearchCustomer.setPreferredSize(new java.awt.Dimension(178, 35));
        jButtonCheckInSearchCustomer.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonCheckInSearchCustomerActionPerformed(evt);
            }
        });

        jButtonCheckInExit.setText("Exit");
        jButtonCheckInExit.setPreferredSize(new java.awt.Dimension(178, 35));
        jButtonCheckInExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonCheckInExitActionPerformed(evt);
            }
        });

        jButtonCheckInLoad.setText("Find check-ins");
        jButtonCheckInLoad.setPreferredSize(new java.awt.Dimension(178, 35));
        jButtonCheckInLoad.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonCheckInLoadActionPerformed(evt);
            }
        });

        jButtonCheckOutLoad.setText("Find check-outs");
        jButtonCheckOutLoad.setPreferredSize(new java.awt.Dimension(178, 35));
        jButtonCheckOutLoad.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonCheckOutLoadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCheckInButtonsLayout = new javax.swing.GroupLayout(jPanelCheckInButtons);
        jPanelCheckInButtons.setLayout(jPanelCheckInButtonsLayout);
        jPanelCheckInButtonsLayout.setHorizontalGroup(
            jPanelCheckInButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCheckInButtonsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelCheckInButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCheckInButtonsLayout.createSequentialGroup()
                        .addComponent(jComboBoxCheckInMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCheckInDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCheckInYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelCheckInNoChange2)
                    .addComponent(jButtonCheckInPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanelCheckInButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCheckInButtonsLayout.createSequentialGroup()
                        .addComponent(jButtonCheckOutLoad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jButtonCheckInExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCheckInButtonsLayout.createSequentialGroup()
                        .addComponent(jButtonCheckInLoad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jButtonCheckInSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanelCheckInButtonsLayout.setVerticalGroup(
            jPanelCheckInButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCheckInButtonsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelCheckInButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCheckInButtonsLayout.createSequentialGroup()
                        .addGroup(jPanelCheckInButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCheckInLoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCheckInSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelCheckInButtonsLayout.createSequentialGroup()
                        .addComponent(jLabelCheckInNoChange2)
                        .addGap(0, 0, 0)
                        .addGroup(jPanelCheckInButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxCheckInDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCheckInMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCheckInYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanelCheckInButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCheckInButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonCheckOutLoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonCheckInExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonCheckInPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))))
        );

        javax.swing.GroupLayout jDialogCheckInOutLayout = new javax.swing.GroupLayout(jDialogCheckInOut.getContentPane());
        jDialogCheckInOut.getContentPane().setLayout(jDialogCheckInOutLayout);
        jDialogCheckInOutLayout.setHorizontalGroup(
            jDialogCheckInOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogCheckInOutLayout.createSequentialGroup()
                .addGroup(jDialogCheckInOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelCheckInList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCheckInButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jDialogCheckInOutLayout.setVerticalGroup(
            jDialogCheckInOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogCheckInOutLayout.createSequentialGroup()
                .addComponent(jPanelCheckInList, 248, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanelCheckInButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jDialogEditDetails.setTitle("Edit Details");
        jDialogEditDetails.setAlwaysOnTop(true);
        jDialogEditDetails.setMinimumSize(new java.awt.Dimension(724, 502));
        jDialogEditDetails.setResizable(false);

        jPanelEditBookingRoom.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelEditBookingRoom.setPreferredSize(new java.awt.Dimension(300, 457));

        jLabelEditDetailsNoChange9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEditDetailsNoChange9.setText("Booking Details");

        jLabelDetailsRoomType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDetailsRoomType.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDetailsRoomType.setText("(Double Room)");
        jLabelDetailsRoomType.setPreferredSize(new java.awt.Dimension(120, 30));

        jLabelDetailsRoomID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelDetailsRoomID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDetailsRoomID.setText("001");
        jLabelDetailsRoomID.setPreferredSize(new java.awt.Dimension(60, 30));

        jLabel4.setText("Room:");
        jLabel4.setPreferredSize(new java.awt.Dimension(47, 30));

        jLabel5.setText("From:");
        jLabel5.setPreferredSize(new java.awt.Dimension(47, 30));

        jLabel6.setText("To:");
        jLabel6.setPreferredSize(new java.awt.Dimension(47, 30));

        jLabelDetailsDateFrom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDetailsDateFrom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelDetailsDateTo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDetailsDateTo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelEditBookingRoomLayout = new javax.swing.GroupLayout(jPanelEditBookingRoom);
        jPanelEditBookingRoom.setLayout(jPanelEditBookingRoomLayout);
        jPanelEditBookingRoomLayout.setHorizontalGroup(
            jPanelEditBookingRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditBookingRoomLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelEditBookingRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEditDetailsNoChange9)
                    .addGroup(jPanelEditBookingRoomLayout.createSequentialGroup()
                        .addGroup(jPanelEditBookingRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelEditBookingRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEditBookingRoomLayout.createSequentialGroup()
                                .addComponent(jLabelDetailsRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabelDetailsRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditBookingRoomLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanelEditBookingRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelDetailsDateFrom, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addComponent(jLabelDetailsDateTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(10, 10, 10))
        );
        jPanelEditBookingRoomLayout.setVerticalGroup(
            jPanelEditBookingRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditBookingRoomLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelEditDetailsNoChange9)
                .addGap(20, 20, 20)
                .addGroup(jPanelEditBookingRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelDetailsRoomID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDetailsRoomType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelEditBookingRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelDetailsDateFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanelEditBookingRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDetailsDateTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelEditBookingCustomer.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelEditDetailsNoChange1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelEditDetailsNoChange1.setText("First Name:");
        jLabelEditDetailsNoChange1.setPreferredSize(new java.awt.Dimension(44, 13));

        jTextFieldEditFirstNameNew.setPreferredSize(new java.awt.Dimension(200, 20));

        jLabelEditDetailsNoChange2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelEditDetailsNoChange2.setText("Last Name:");
        jLabelEditDetailsNoChange2.setPreferredSize(new java.awt.Dimension(44, 13));

        jTextFieldEditLastNameNew.setPreferredSize(new java.awt.Dimension(200, 20));

        jLabelEditDetailsNoChange6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelEditDetailsNoChange6.setText("Country:");
        jLabelEditDetailsNoChange6.setPreferredSize(new java.awt.Dimension(44, 13));

        jTextFieldEditCountryNew.setPreferredSize(new java.awt.Dimension(200, 20));

        jLabelEditDetailsNoChange7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelEditDetailsNoChange7.setText("Phone-number:");
        jLabelEditDetailsNoChange7.setPreferredSize(new java.awt.Dimension(44, 13));

        jTextFieldEditPhoneNew.setPreferredSize(new java.awt.Dimension(200, 20));

        jLabelEditDetailsNoChange8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelEditDetailsNoChange8.setText("E-mail address:");
        jLabelEditDetailsNoChange8.setPreferredSize(new java.awt.Dimension(44, 13));

        jTextFieldEditEmailNew.setPreferredSize(new java.awt.Dimension(200, 20));

        jLabelEditEmailOriginal.setText("ItalianStallion@ActorsMails.net");
        jLabelEditEmailOriginal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabelEditEmailOriginal.setPreferredSize(new java.awt.Dimension(200, 20));

        jLabelEditPhoneOriginal.setText("555 - 9431");
        jLabelEditPhoneOriginal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabelEditPhoneOriginal.setPreferredSize(new java.awt.Dimension(200, 20));

        jLabelEditCountryOriginal.setText("United States");
        jLabelEditCountryOriginal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabelEditCountryOriginal.setPreferredSize(new java.awt.Dimension(200, 20));

        jLabelEditLastNameOriginal.setText("Stallone");
        jLabelEditLastNameOriginal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabelEditLastNameOriginal.setPreferredSize(new java.awt.Dimension(200, 20));

        jLabelEditFirstNameOriginal.setText("Sylvester");
        jLabelEditFirstNameOriginal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabelEditFirstNameOriginal.setPreferredSize(new java.awt.Dimension(200, 20));

        jLabelEditDetailsNoChange3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelEditDetailsNoChange3.setText("First Name:");
        jLabelEditDetailsNoChange3.setPreferredSize(new java.awt.Dimension(44, 13));

        jLabelEditDetailsNoChange10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelEditDetailsNoChange10.setText("Last Name:");
        jLabelEditDetailsNoChange10.setPreferredSize(new java.awt.Dimension(44, 13));

        jLabelEditDetailsNoChange14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelEditDetailsNoChange14.setText("Country:");
        jLabelEditDetailsNoChange14.setPreferredSize(new java.awt.Dimension(44, 13));

        jLabelEditDetailsNoChange15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelEditDetailsNoChange15.setText("Phone-number:");
        jLabelEditDetailsNoChange15.setPreferredSize(new java.awt.Dimension(44, 13));

        jLabelEditDetailsNoChange16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelEditDetailsNoChange16.setText("E-mail address:");
        jLabelEditDetailsNoChange16.setPreferredSize(new java.awt.Dimension(44, 13));

        jLabelEditGuestIDOriginal.setText("R4MB0");
        jLabelEditGuestIDOriginal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabelEditGuestIDOriginal.setPreferredSize(new java.awt.Dimension(200, 20));

        jLabelEditDetailsNoChange17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelEditDetailsNoChange17.setText("Guest ID:");
        jLabelEditDetailsNoChange17.setPreferredSize(new java.awt.Dimension(44, 13));

        jLabelEditDetailsNoChange5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEditDetailsNoChange5.setText("Customer Details");

        jLabelEditDetailsNoChange4.setText("<html>Change a specific customer-detail by typing the desired data in the white fields.<br>Leave a cell blank to keep the original data of the specific detail.</html>");

        jLabelDetailsResultNotifier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDetailsResultNotifier.setText("No guest-information found...");

        javax.swing.GroupLayout jPanelEditBookingCustomerLayout = new javax.swing.GroupLayout(jPanelEditBookingCustomer);
        jPanelEditBookingCustomer.setLayout(jPanelEditBookingCustomerLayout);
        jPanelEditBookingCustomerLayout.setHorizontalGroup(
            jPanelEditBookingCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditBookingCustomerLayout.createSequentialGroup()
                .addGroup(jPanelEditBookingCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEditBookingCustomerLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelEditBookingCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEditBookingCustomerLayout.createSequentialGroup()
                                .addGroup(jPanelEditBookingCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEditFirstNameOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelEditDetailsNoChange1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanelEditBookingCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEditDetailsNoChange3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEditFirstNameNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelEditBookingCustomerLayout.createSequentialGroup()
                                .addGroup(jPanelEditBookingCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEditLastNameOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelEditDetailsNoChange2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanelEditBookingCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldEditLastNameNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelEditDetailsNoChange10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelEditBookingCustomerLayout.createSequentialGroup()
                                .addGroup(jPanelEditBookingCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEditCountryOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelEditDetailsNoChange6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanelEditBookingCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEditDetailsNoChange14, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEditCountryNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelEditBookingCustomerLayout.createSequentialGroup()
                                .addGroup(jPanelEditBookingCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEditPhoneOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelEditDetailsNoChange7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanelEditBookingCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEditDetailsNoChange15, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEditPhoneNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelEditBookingCustomerLayout.createSequentialGroup()
                                .addGroup(jPanelEditBookingCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEditEmailOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelEditDetailsNoChange8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanelEditBookingCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEditDetailsNoChange16, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEditEmailNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelEditBookingCustomerLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelEditDetailsNoChange5))
                    .addGroup(jPanelEditBookingCustomerLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelEditDetailsNoChange4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEditBookingCustomerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelEditBookingCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEditBookingCustomerLayout.createSequentialGroup()
                                .addComponent(jLabelEditDetailsNoChange17, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanelEditBookingCustomerLayout.createSequentialGroup()
                                .addComponent(jLabelEditGuestIDOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelDetailsResultNotifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(10, 10, 10))
        );
        jPanelEditBookingCustomerLayout.setVerticalGroup(
            jPanelEditBookingCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditBookingCustomerLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelEditDetailsNoChange5)
                .addGap(15, 15, 15)
                .addComponent(jLabelEditDetailsNoChange4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabelEditDetailsNoChange17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanelEditBookingCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelDetailsResultNotifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEditGuestIDOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(jPanelEditBookingCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEditDetailsNoChange1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditDetailsNoChange3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelEditBookingCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEditFirstNameOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEditFirstNameNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanelEditBookingCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEditDetailsNoChange2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditDetailsNoChange10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelEditBookingCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEditLastNameOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEditLastNameNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanelEditBookingCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEditDetailsNoChange6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditDetailsNoChange14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelEditBookingCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEditCountryOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEditCountryNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanelEditBookingCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEditDetailsNoChange7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditDetailsNoChange15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelEditBookingCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEditPhoneOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEditPhoneNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanelEditBookingCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEditDetailsNoChange8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditDetailsNoChange16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelEditBookingCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEditEmailOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEditEmailNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        jButtonDetailsSaveChanges.setText("Save customer changes");
        jButtonDetailsSaveChanges.setPreferredSize(new java.awt.Dimension(200, 35));
        jButtonDetailsSaveChanges.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonDetailsSaveChangesActionPerformed(evt);
            }
        });

        jButtonDetailsExit.setText("Exit");
        jButtonDetailsExit.setPreferredSize(new java.awt.Dimension(200, 35));
        jButtonDetailsExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonDetailsExitActionPerformed(evt);
            }
        });

        jButtonDetailsChangeBooking.setText("Change booking");
        jButtonDetailsChangeBooking.setPreferredSize(new java.awt.Dimension(200, 35));
        jButtonDetailsChangeBooking.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonDetailsChangeBookingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButtonDetailsSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButtonDetailsChangeBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonDetailsExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonDetailsChangeBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDetailsExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDetailsSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Future bookings of current customer:");

        jScrollPane3.setViewportView(jListDetailsFutureBookings);

        jButtonDetailsShowBooking.setText("Show booking details");
        jButtonDetailsShowBooking.setPreferredSize(new java.awt.Dimension(230, 35));
        jButtonDetailsShowBooking.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonDetailsShowBookingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane3)
                    .addComponent(jButtonDetailsShowBooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButtonDetailsShowBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jDialogEditDetailsLayout = new javax.swing.GroupLayout(jDialogEditDetails.getContentPane());
        jDialogEditDetails.getContentPane().setLayout(jDialogEditDetailsLayout);
        jDialogEditDetailsLayout.setHorizontalGroup(
            jDialogEditDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogEditDetailsLayout.createSequentialGroup()
                .addGroup(jDialogEditDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDialogEditDetailsLayout.createSequentialGroup()
                        .addComponent(jPanelEditBookingCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(jDialogEditDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelEditBookingRoom, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))))
                .addGap(0, 0, 0))
        );
        jDialogEditDetailsLayout.setVerticalGroup(
            jDialogEditDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogEditDetailsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jDialogEditDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDialogEditDetailsLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jPanelEditBookingRoom, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                    .addComponent(jPanelEditBookingCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jDialogDetails.setTitle("Details");
        jDialogDetails.setAlwaysOnTop(true);
        jDialogDetails.setMinimumSize(new java.awt.Dimension(414, 467));
        jDialogDetails.setResizable(false);

        jPanelDetailsRoom.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanelDetailsRoom.setPreferredSize(new java.awt.Dimension(250, 450));

        jLabelDetailsRoomID1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelDetailsRoomID1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelDetailsRoomID1.setText("001");
        jLabelDetailsRoomID1.setPreferredSize(new java.awt.Dimension(50, 30));

        jLabelDetailsRoomType1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDetailsRoomType1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDetailsRoomType1.setText("(Double Room)");
        jLabelDetailsRoomType1.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabelDetailsStartDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDetailsStartDate.setText("January 5th - 2014");
        jLabelDetailsStartDate.setPreferredSize(new java.awt.Dimension(160, 20));

        jLabelNoChange12.setText("Date of booking:");

        jLabelDetailsBookingDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDetailsBookingDate.setText("2014 - 01 - 02");
        jLabelDetailsBookingDate.setPreferredSize(new java.awt.Dimension(160, 20));

        jLabelDetailsEndDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDetailsEndDate.setText("2014 - 04 - 16");
        jLabelDetailsEndDate.setPreferredSize(new java.awt.Dimension(160, 20));

        jLabelNoChange10.setText("Start date:");

        jLabelNoChange11.setText("End date:");

        javax.swing.GroupLayout jPanelDetailsRoomLayout = new javax.swing.GroupLayout(jPanelDetailsRoom);
        jPanelDetailsRoom.setLayout(jPanelDetailsRoomLayout);
        jPanelDetailsRoomLayout.setHorizontalGroup(
            jPanelDetailsRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetailsRoomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDetailsRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDetailsBookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDetailsEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDetailsStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDetailsRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelDetailsRoomLayout.createSequentialGroup()
                            .addComponent(jLabelDetailsRoomID1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelDetailsRoomType1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabelNoChange10)
                        .addComponent(jLabelNoChange11)
                        .addComponent(jLabelNoChange12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDetailsRoomLayout.setVerticalGroup(
            jPanelDetailsRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetailsRoomLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelDetailsRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDetailsRoomType1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDetailsRoomID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabelNoChange10)
                .addGap(0, 0, 0)
                .addComponent(jLabelDetailsStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNoChange11)
                .addGap(0, 0, 0)
                .addComponent(jLabelDetailsEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNoChange12)
                .addGap(0, 0, 0)
                .addComponent(jLabelDetailsBookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDetailsCustomer.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabelEditDetailsNoChange18.setText("First Name:");
        jLabelEditDetailsNoChange18.setPreferredSize(new java.awt.Dimension(44, 13));

        jLabelDetailsFirstName.setText("Sylvester");
        jLabelDetailsFirstName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabelDetailsFirstName.setPreferredSize(new java.awt.Dimension(200, 20));

        jLabelEditDetailsNoChange19.setText("Last Name:");
        jLabelEditDetailsNoChange19.setPreferredSize(new java.awt.Dimension(44, 13));

        jLabelDetailsLastName.setText("Stallone");
        jLabelDetailsLastName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabelDetailsLastName.setPreferredSize(new java.awt.Dimension(200, 20));

        jLabelEditDetailsNoChange23.setText("Country:");
        jLabelEditDetailsNoChange23.setPreferredSize(new java.awt.Dimension(44, 13));

        jLabelDetailsCountry.setText("United States");
        jLabelDetailsCountry.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabelDetailsCountry.setPreferredSize(new java.awt.Dimension(200, 20));

        jLabelEditDetailsNoChange24.setText("Phone-number:");
        jLabelEditDetailsNoChange24.setPreferredSize(new java.awt.Dimension(44, 13));

        jLabelDetailsPhone.setText("555 - 9431");
        jLabelDetailsPhone.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabelDetailsPhone.setPreferredSize(new java.awt.Dimension(200, 20));

        jLabelEditDetailsNoChange25.setText("E-mail address:");
        jLabelEditDetailsNoChange25.setPreferredSize(new java.awt.Dimension(44, 13));

        jLabelDetailsEmail.setText("ItalianStallion@ActorsMails.net");
        jLabelDetailsEmail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabelDetailsEmail.setPreferredSize(new java.awt.Dimension(200, 20));

        jLabelEditDetailsNoChange26.setText("Guest ID:");
        jLabelEditDetailsNoChange26.setPreferredSize(new java.awt.Dimension(44, 13));

        jLabelDetailsGuestID.setText("R4MB0");
        jLabelDetailsGuestID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabelDetailsGuestID.setPreferredSize(new java.awt.Dimension(200, 20));

        javax.swing.GroupLayout jPanelDetailsCustomerLayout = new javax.swing.GroupLayout(jPanelDetailsCustomer);
        jPanelDetailsCustomer.setLayout(jPanelDetailsCustomerLayout);
        jPanelDetailsCustomerLayout.setHorizontalGroup(
            jPanelDetailsCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetailsCustomerLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelDetailsCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDetailsFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditDetailsNoChange18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDetailsLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditDetailsNoChange19, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDetailsCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditDetailsNoChange23, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDetailsPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditDetailsNoChange24, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDetailsEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditDetailsNoChange25, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDetailsGuestID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditDetailsNoChange26, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanelDetailsCustomerLayout.setVerticalGroup(
            jPanelDetailsCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetailsCustomerLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelEditDetailsNoChange18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelDetailsFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabelEditDetailsNoChange19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelDetailsLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabelEditDetailsNoChange23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelDetailsCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabelEditDetailsNoChange24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelDetailsPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabelEditDetailsNoChange25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelDetailsEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabelEditDetailsNoChange26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabelDetailsGuestID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jButtonExitDetails.setText("Exit");
        jButtonExitDetails.setPreferredSize(new java.awt.Dimension(164, 35));
        jButtonExitDetails.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonExitDetailsActionPerformed(evt);
            }
        });

        jButtonChangeDetails.setText("Edit Details");
        jButtonChangeDetails.setPreferredSize(new java.awt.Dimension(164, 35));
        jButtonChangeDetails.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonChangeDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonExitDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonChangeDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonChangeDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButtonExitDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialogDetailsLayout = new javax.swing.GroupLayout(jDialogDetails.getContentPane());
        jDialogDetails.getContentPane().setLayout(jDialogDetailsLayout);
        jDialogDetailsLayout.setHorizontalGroup(
            jDialogDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogDetailsLayout.createSequentialGroup()
                .addComponent(jPanelDetailsCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jDialogDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelDetailsRoom, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jDialogDetailsLayout.setVerticalGroup(
            jDialogDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogDetailsLayout.createSequentialGroup()
                .addGroup(jDialogDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelDetailsCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDialogDetailsLayout.createSequentialGroup()
                        .addComponent(jPanelDetailsRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );

        jDialogSetupOverview.setTitle("Setup Overview");
        jDialogSetupOverview.setAlwaysOnTop(true);
        jDialogSetupOverview.setMinimumSize(new java.awt.Dimension(419, 437));
        jDialogSetupOverview.setResizable(false);

        jPanelSetupOverviewSelectRoomsAtRows.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelSetupOverviewNoChange1.setText("<html>Select up to 8 specific rooms to be <br>shown in Overview-window:</html>");
        jLabelSetupOverviewNoChange1.setPreferredSize(new java.awt.Dimension(170, 30));

        jLabelSetupOverviewNoChange2.setText("Row 1:");
        jLabelSetupOverviewNoChange2.setPreferredSize(new java.awt.Dimension(40, 20));

        jLabelSetupOverviewNoChange3.setText("Row 2:");
        jLabelSetupOverviewNoChange3.setPreferredSize(new java.awt.Dimension(40, 20));

        jLabelSetupOverviewNoChange4.setText("Row 3:");
        jLabelSetupOverviewNoChange4.setPreferredSize(new java.awt.Dimension(40, 20));

        jLabelSetupOverviewNoChange5.setText("Row 4:");
        jLabelSetupOverviewNoChange5.setPreferredSize(new java.awt.Dimension(40, 20));

        jLabelSetupOverviewNoChange6.setText("Row 5:");
        jLabelSetupOverviewNoChange6.setPreferredSize(new java.awt.Dimension(40, 20));

        jLabelSetupOverviewNoChange7.setText("Row 6:");
        jLabelSetupOverviewNoChange7.setPreferredSize(new java.awt.Dimension(40, 20));

        jLabelSetupOverviewNoChange8.setText("Row 7:");
        jLabelSetupOverviewNoChange8.setPreferredSize(new java.awt.Dimension(40, 20));

        jLabelSetupOverviewNoChange9.setText("Row 8:");
        jLabelSetupOverviewNoChange9.setPreferredSize(new java.awt.Dimension(40, 20));

        jLabelSetupOverviewNoChange10.setText("<html>Leave a cell blank to generate an<br>empty row in Overview-window.</html>");

        jTextFieldRow1.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jTextFieldRow1.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldRow1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldRow1.setText("1");
        jTextFieldRow1.setPreferredSize(new java.awt.Dimension(30, 20));
        jTextFieldRow1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jTextFieldRow1MouseClicked(evt);
            }
        });
        jTextFieldRow1.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                jTextFieldRow1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                jTextFieldRow1FocusLost(evt);
            }
        });

        jTextFieldRow2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jTextFieldRow2.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldRow2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldRow2.setText("2");
        jTextFieldRow2.setPreferredSize(new java.awt.Dimension(30, 20));
        jTextFieldRow2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jTextFieldRow2MouseClicked(evt);
            }
        });
        jTextFieldRow2.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                jTextFieldRow2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                jTextFieldRow2FocusLost(evt);
            }
        });

        jTextFieldRow3.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jTextFieldRow3.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldRow3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldRow3.setText("3");
        jTextFieldRow3.setPreferredSize(new java.awt.Dimension(30, 20));
        jTextFieldRow3.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jTextFieldRow3MouseClicked(evt);
            }
        });
        jTextFieldRow3.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                jTextFieldRow3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                jTextFieldRow3FocusLost(evt);
            }
        });

        jTextFieldRow4.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jTextFieldRow4.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldRow4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldRow4.setText("4");
        jTextFieldRow4.setPreferredSize(new java.awt.Dimension(30, 20));
        jTextFieldRow4.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jTextFieldRow4MouseClicked(evt);
            }
        });
        jTextFieldRow4.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                jTextFieldRow4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                jTextFieldRow4FocusLost(evt);
            }
        });

        jTextFieldRow5.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jTextFieldRow5.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldRow5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldRow5.setText("5");
        jTextFieldRow5.setPreferredSize(new java.awt.Dimension(30, 20));
        jTextFieldRow5.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jTextFieldRow5MouseClicked(evt);
            }
        });
        jTextFieldRow5.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                jTextFieldRow5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                jTextFieldRow5FocusLost(evt);
            }
        });

        jTextFieldRow6.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jTextFieldRow6.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldRow6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldRow6.setText("6");
        jTextFieldRow6.setPreferredSize(new java.awt.Dimension(30, 20));
        jTextFieldRow6.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jTextFieldRow6MouseClicked(evt);
            }
        });
        jTextFieldRow6.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                jTextFieldRow6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                jTextFieldRow6FocusLost(evt);
            }
        });

        jTextFieldRow7.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jTextFieldRow7.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldRow7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldRow7.setText("7");
        jTextFieldRow7.setPreferredSize(new java.awt.Dimension(30, 20));
        jTextFieldRow7.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jTextFieldRow7MouseClicked(evt);
            }
        });
        jTextFieldRow7.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                jTextFieldRow7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                jTextFieldRow7FocusLost(evt);
            }
        });

        jTextFieldRow8.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jTextFieldRow8.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldRow8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldRow8.setText("8");
        jTextFieldRow8.setPreferredSize(new java.awt.Dimension(30, 20));
        jTextFieldRow8.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jTextFieldRow8MouseClicked(evt);
            }
        });
        jTextFieldRow8.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                jTextFieldRow8FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                jTextFieldRow8FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanelSetupOverviewSelectRoomsAtRowsLayout = new javax.swing.GroupLayout(jPanelSetupOverviewSelectRoomsAtRows);
        jPanelSetupOverviewSelectRoomsAtRows.setLayout(jPanelSetupOverviewSelectRoomsAtRowsLayout);
        jPanelSetupOverviewSelectRoomsAtRowsLayout.setHorizontalGroup(
            jPanelSetupOverviewSelectRoomsAtRowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSetupOverviewSelectRoomsAtRowsLayout.createSequentialGroup()
                .addGroup(jPanelSetupOverviewSelectRoomsAtRowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSetupOverviewSelectRoomsAtRowsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelSetupOverviewSelectRoomsAtRowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelSetupOverviewNoChange1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSetupOverviewNoChange10)))
                    .addGroup(jPanelSetupOverviewSelectRoomsAtRowsLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanelSetupOverviewSelectRoomsAtRowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelSetupOverviewNoChange9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSetupOverviewNoChange8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSetupOverviewNoChange7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSetupOverviewNoChange6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSetupOverviewNoChange5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSetupOverviewNoChange4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSetupOverviewNoChange3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSetupOverviewNoChange2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanelSetupOverviewSelectRoomsAtRowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldRow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRow4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRow5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRow6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRow7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRow8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
        );
        jPanelSetupOverviewSelectRoomsAtRowsLayout.setVerticalGroup(
            jPanelSetupOverviewSelectRoomsAtRowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSetupOverviewSelectRoomsAtRowsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelSetupOverviewNoChange1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelSetupOverviewSelectRoomsAtRowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSetupOverviewNoChange2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSetupOverviewSelectRoomsAtRowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSetupOverviewNoChange3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSetupOverviewSelectRoomsAtRowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSetupOverviewNoChange4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSetupOverviewSelectRoomsAtRowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSetupOverviewNoChange5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRow4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSetupOverviewSelectRoomsAtRowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSetupOverviewNoChange6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRow5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSetupOverviewSelectRoomsAtRowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSetupOverviewNoChange7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRow6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSetupOverviewSelectRoomsAtRowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSetupOverviewNoChange8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRow7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSetupOverviewSelectRoomsAtRowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSetupOverviewNoChange9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRow8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelSetupOverviewNoChange10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jPanelSetupOverviewSelect14DaysPeriod.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelSetupOverviewNoChange12.setText("<html>Select a specific period of 14 consecutive<br>days to be shown in Overview-window:</html>");
        jLabelSetupOverviewNoChange12.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabelSetupOverviewNoChange13.setText("Specify start date:");

        jComboBoxSetupOverviewStartMonth.setMaximumRowCount(13);
        jComboBoxSetupOverviewStartMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jComboBoxSetupOverviewStartMonth.setPreferredSize(new java.awt.Dimension(80, 22));
        jComboBoxSetupOverviewStartMonth.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxSetupOverviewStartMonthActionPerformed(evt);
            }
        });

        jComboBoxSetupOverviewStartDate.setMaximumRowCount(13);
        jComboBoxSetupOverviewStartDate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBoxSetupOverviewStartDate.setPreferredSize(new java.awt.Dimension(40, 22));
        jComboBoxSetupOverviewStartDate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxSetupOverviewStartDateActionPerformed(evt);
            }
        });

        jComboBoxSetupOverviewStartYear.setMaximumRowCount(13);
        jComboBoxSetupOverviewStartYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        jComboBoxSetupOverviewStartYear.setMinimumSize(new java.awt.Dimension(47, 22));
        jComboBoxSetupOverviewStartYear.setPreferredSize(new java.awt.Dimension(55, 22));
        jComboBoxSetupOverviewStartYear.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxSetupOverviewStartYearActionPerformed(evt);
            }
        });

        jLabel13.setText("End date:");

        jTextFieldSetupOverviewEndMonth.setEditable(false);
        jTextFieldSetupOverviewEndMonth.setPreferredSize(new java.awt.Dimension(59, 22));

        jTextFieldSetupOverviewEndDate.setEditable(false);

        jTextFieldSetupOverviewEndYear.setEditable(false);
        jTextFieldSetupOverviewEndYear.setPreferredSize(new java.awt.Dimension(65, 22));

        jLabel2.setText("(Both days included)");

        javax.swing.GroupLayout jPanelSetupOverviewSelect14DaysPeriodLayout = new javax.swing.GroupLayout(jPanelSetupOverviewSelect14DaysPeriod);
        jPanelSetupOverviewSelect14DaysPeriod.setLayout(jPanelSetupOverviewSelect14DaysPeriodLayout);
        jPanelSetupOverviewSelect14DaysPeriodLayout.setHorizontalGroup(
            jPanelSetupOverviewSelect14DaysPeriodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSetupOverviewSelect14DaysPeriodLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelSetupOverviewSelect14DaysPeriodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSetupOverviewNoChange12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSetupOverviewNoChange13)
                    .addComponent(jLabel13)
                    .addGroup(jPanelSetupOverviewSelect14DaysPeriodLayout.createSequentialGroup()
                        .addGroup(jPanelSetupOverviewSelect14DaysPeriodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxSetupOverviewStartMonth, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldSetupOverviewEndMonth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanelSetupOverviewSelect14DaysPeriodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxSetupOverviewStartDate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldSetupOverviewEndDate))
                        .addGap(10, 10, 10)
                        .addGroup(jPanelSetupOverviewSelect14DaysPeriodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxSetupOverviewStartYear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldSetupOverviewEndYear, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                    .addComponent(jLabel2))
                .addGap(5, 5, 5))
        );
        jPanelSetupOverviewSelect14DaysPeriodLayout.setVerticalGroup(
            jPanelSetupOverviewSelect14DaysPeriodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSetupOverviewSelect14DaysPeriodLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelSetupOverviewNoChange12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelSetupOverviewNoChange13)
                .addGap(0, 0, 0)
                .addGroup(jPanelSetupOverviewSelect14DaysPeriodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSetupOverviewStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSetupOverviewStartMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSetupOverviewStartYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(0, 0, 0)
                .addGroup(jPanelSetupOverviewSelect14DaysPeriodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSetupOverviewEndMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSetupOverviewEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSetupOverviewEndYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(12, 12, 12))
        );

        jButtonSetupOverviewShowRooms.setText("Show Rooms");
        jButtonSetupOverviewShowRooms.setPreferredSize(new java.awt.Dimension(199, 35));
        jButtonSetupOverviewShowRooms.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSetupOverviewShowRoomsActionPerformed(evt);
            }
        });

        jButtonSetupOverviewExit.setText("Cancel and Exit");
        jButtonSetupOverviewExit.setPreferredSize(new java.awt.Dimension(199, 35));
        jButtonSetupOverviewExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSetupOverviewExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButtonSetupOverviewExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSetupOverviewShowRooms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jButtonSetupOverviewShowRooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButtonSetupOverviewExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jDialogSetupOverviewLayout = new javax.swing.GroupLayout(jDialogSetupOverview.getContentPane());
        jDialogSetupOverview.getContentPane().setLayout(jDialogSetupOverviewLayout);
        jDialogSetupOverviewLayout.setHorizontalGroup(
            jDialogSetupOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogSetupOverviewLayout.createSequentialGroup()
                .addComponent(jPanelSetupOverviewSelectRoomsAtRows, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jDialogSetupOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelSetupOverviewSelect14DaysPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        jDialogSetupOverviewLayout.setVerticalGroup(
            jDialogSetupOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogSetupOverviewLayout.createSequentialGroup()
                .addGroup(jDialogSetupOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDialogSetupOverviewLayout.createSequentialGroup()
                        .addComponent(jPanelSetupOverviewSelect14DaysPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelSetupOverviewSelectRoomsAtRows, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabelRequestDeleteBooking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRequestDeleteBooking.setText("<html>To change this booking, the booking will be deleted and the Booking-window will open in order for you change roomtype and the bookings start- or end dates.</html>");

        jButtonRequestContinue.setText("Continue?");
        jButtonRequestContinue.setPreferredSize(new java.awt.Dimension(115, 30));
        jButtonRequestContinue.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonRequestContinueActionPerformed(evt);
            }
        });

        jButtonRequestCancel.setText("Cancel");
        jButtonRequestCancel.setPreferredSize(new java.awt.Dimension(115, 30));
        jButtonRequestCancel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonRequestCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jButtonRequestContinue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRequestCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelRequestDeleteBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelRequestDeleteBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRequestContinue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRequestCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jDialogRequestDeleteBookingLayout = new javax.swing.GroupLayout(jDialogRequestDeleteBooking.getContentPane());
        jDialogRequestDeleteBooking.getContentPane().setLayout(jDialogRequestDeleteBookingLayout);
        jDialogRequestDeleteBookingLayout.setHorizontalGroup(
            jDialogRequestDeleteBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogRequestDeleteBookingLayout.setVerticalGroup(
            jDialogRequestDeleteBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Overview");
        setMinimumSize(new java.awt.Dimension(967, 662));
        setResizable(false);

        jButtonRoomArrowUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/ArrowUp.png"))); // NOI18N
        jButtonRoomArrowUp.setBorderPainted(false);
        jButtonRoomArrowUp.setPreferredSize(new java.awt.Dimension(51, 36));
        jButtonRoomArrowUp.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                jButtonRoomArrowUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                jButtonRoomArrowUpMouseExited(evt);
            }
        });
        jButtonRoomArrowUp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonRoomArrowUpActionPerformed(evt);
            }
        });

        jButtonRoomArrowDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/ArrowDown.png"))); // NOI18N
        jButtonRoomArrowDown.setBorderPainted(false);
        jButtonRoomArrowDown.setPreferredSize(new java.awt.Dimension(51, 36));
        jButtonRoomArrowDown.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                jButtonRoomArrowDownMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                jButtonRoomArrowDownMouseExited(evt);
            }
        });
        jButtonRoomArrowDown.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonRoomArrowDownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOverviewCellsButtons2Layout = new javax.swing.GroupLayout(jPanelOverviewCellsButtons2);
        jPanelOverviewCellsButtons2.setLayout(jPanelOverviewCellsButtons2Layout);
        jPanelOverviewCellsButtons2Layout.setHorizontalGroup(
            jPanelOverviewCellsButtons2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOverviewCellsButtons2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanelOverviewCellsButtons2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonRoomArrowDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRoomArrowUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        jPanelOverviewCellsButtons2Layout.setVerticalGroup(
            jPanelOverviewCellsButtons2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOverviewCellsButtons2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButtonRoomArrowUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(407, 407, 407)
                .addComponent(jButtonRoomArrowDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jPanelMainBookingButtons.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanelMainBookingButtons.setPreferredSize(new java.awt.Dimension(144, 59));

        jButtonBooking.setText("New Booking");
        jButtonBooking.setPreferredSize(new java.awt.Dimension(120, 35));
        jButtonBooking.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBookingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMainBookingButtonsLayout = new javax.swing.GroupLayout(jPanelMainBookingButtons);
        jPanelMainBookingButtons.setLayout(jPanelMainBookingButtonsLayout);
        jPanelMainBookingButtonsLayout.setHorizontalGroup(
            jPanelMainBookingButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainBookingButtonsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButtonBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMainBookingButtonsLayout.setVerticalGroup(
            jPanelMainBookingButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainBookingButtonsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButtonBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jPanelMainInfoNotifier.setPreferredSize(new java.awt.Dimension(0, 25));

        jLabelOverviewInfoMessage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelOverviewInfoMessage.setPreferredSize(new java.awt.Dimension(630, 24));

        javax.swing.GroupLayout jPanelMainInfoNotifierLayout = new javax.swing.GroupLayout(jPanelMainInfoNotifier);
        jPanelMainInfoNotifier.setLayout(jPanelMainInfoNotifierLayout);
        jPanelMainInfoNotifierLayout.setHorizontalGroup(
            jPanelMainInfoNotifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainInfoNotifierLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabelOverviewInfoMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMainInfoNotifierLayout.setVerticalGroup(
            jPanelMainInfoNotifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainInfoNotifierLayout.createSequentialGroup()
                .addComponent(jLabelOverviewInfoMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        jPanelOverviewCellsButtons1.setPreferredSize(new java.awt.Dimension(841, 24));

        jButtonSetupOverview.setText("Setup Overview");
        jButtonSetupOverview.setPreferredSize(new java.awt.Dimension(115, 22));
        jButtonSetupOverview.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSetupOverviewActionPerformed(evt);
            }
        });

        jButtonResetOveriew.setText("Normal View");
        jButtonResetOveriew.setPreferredSize(new java.awt.Dimension(115, 22));
        jButtonResetOveriew.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonResetOveriewActionPerformed(evt);
            }
        });

        jButtonPrevious7Days.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/ArrowLeft.png"))); // NOI18N
        jButtonPrevious7Days.setText("Previous 7 days");
        jButtonPrevious7Days.setBorderPainted(false);
        jButtonPrevious7Days.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonPrevious7Days.setMargin(new java.awt.Insets(3, 0, 2, 0));
        jButtonPrevious7Days.setPreferredSize(new java.awt.Dimension(115, 22));
        jButtonPrevious7Days.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                jButtonPrevious7DaysMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                jButtonPrevious7DaysMouseExited(evt);
            }
        });
        jButtonPrevious7Days.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonPrevious7DaysActionPerformed(evt);
            }
        });

        jButtonPrevious14Days.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/ArrowDoubleLeft.png"))); // NOI18N
        jButtonPrevious14Days.setText("Previous 14 days");
        jButtonPrevious14Days.setBorderPainted(false);
        jButtonPrevious14Days.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonPrevious14Days.setMargin(new java.awt.Insets(3, 0, 2, 0));
        jButtonPrevious14Days.setPreferredSize(new java.awt.Dimension(115, 22));
        jButtonPrevious14Days.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                jButtonPrevious14DaysMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                jButtonPrevious14DaysMouseExited(evt);
            }
        });
        jButtonPrevious14Days.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonPrevious14DaysActionPerformed(evt);
            }
        });

        jButtonNext7Days.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/ArrowRight.png"))); // NOI18N
        jButtonNext7Days.setText("Next 7 days");
        jButtonNext7Days.setBorderPainted(false);
        jButtonNext7Days.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButtonNext7Days.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonNext7Days.setMargin(new java.awt.Insets(3, 0, 2, 0));
        jButtonNext7Days.setPreferredSize(new java.awt.Dimension(115, 22));
        jButtonNext7Days.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                jButtonNext7DaysMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                jButtonNext7DaysMouseExited(evt);
            }
        });
        jButtonNext7Days.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonNext7DaysActionPerformed(evt);
            }
        });

        jButtonNext14Days.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/ArrowDoubleRight.png"))); // NOI18N
        jButtonNext14Days.setText("Next 14 days");
        jButtonNext14Days.setBorderPainted(false);
        jButtonNext14Days.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButtonNext14Days.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonNext14Days.setIconTextGap(0);
        jButtonNext14Days.setMargin(new java.awt.Insets(3, 0, 2, 0));
        jButtonNext14Days.setPreferredSize(new java.awt.Dimension(115, 22));
        jButtonNext14Days.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                jButtonNext14DaysMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                jButtonNext14DaysMouseExited(evt);
            }
        });
        jButtonNext14Days.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonNext14DaysActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOverviewCellsButtons1Layout = new javax.swing.GroupLayout(jPanelOverviewCellsButtons1);
        jPanelOverviewCellsButtons1.setLayout(jPanelOverviewCellsButtons1Layout);
        jPanelOverviewCellsButtons1Layout.setHorizontalGroup(
            jPanelOverviewCellsButtons1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOverviewCellsButtons1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jButtonPrevious14Days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jButtonPrevious7Days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jButtonSetupOverview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jButtonResetOveriew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jButtonNext7Days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jButtonNext14Days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelOverviewCellsButtons1Layout.setVerticalGroup(
            jPanelOverviewCellsButtons1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOverviewCellsButtons1Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addGroup(jPanelOverviewCellsButtons1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSetupOverview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonResetOveriew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPrevious7Days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPrevious14Days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNext7Days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNext14Days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelMainSearchButtons.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonSearchCustomer.setText("Search Customer");
        jButtonSearchCustomer.setPreferredSize(new java.awt.Dimension(120, 35));
        jButtonSearchCustomer.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSearchCustomerActionPerformed(evt);
            }
        });

        jButtonSearchRoom.setText("Search Room");
        jButtonSearchRoom.setPreferredSize(new java.awt.Dimension(120, 35));
        jButtonSearchRoom.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSearchRoomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMainSearchButtonsLayout = new javax.swing.GroupLayout(jPanelMainSearchButtons);
        jPanelMainSearchButtons.setLayout(jPanelMainSearchButtonsLayout);
        jPanelMainSearchButtonsLayout.setHorizontalGroup(
            jPanelMainSearchButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainSearchButtonsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButtonSearchRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButtonSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        jPanelMainSearchButtonsLayout.setVerticalGroup(
            jPanelMainSearchButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainSearchButtonsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelMainSearchButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearchRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanelMainCheckInOutButtons.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelMainCheckInOutButtons.setPreferredSize(new java.awt.Dimension(144, 59));

        jButtonCheckIn.setText("Check - In/Out");
        jButtonCheckIn.setPreferredSize(new java.awt.Dimension(120, 35));
        jButtonCheckIn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonCheckInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMainCheckInOutButtonsLayout = new javax.swing.GroupLayout(jPanelMainCheckInOutButtons);
        jPanelMainCheckInOutButtons.setLayout(jPanelMainCheckInOutButtonsLayout);
        jPanelMainCheckInOutButtonsLayout.setHorizontalGroup(
            jPanelMainCheckInOutButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainCheckInOutButtonsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButtonCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        jPanelMainCheckInOutButtonsLayout.setVerticalGroup(
            jPanelMainCheckInOutButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainCheckInOutButtonsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButtonCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jPanelDay01.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelDay01.setPreferredSize(new java.awt.Dimension(60, 60));

        jLabelDate01Day.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelDate01Day.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate01Day.setText("Saturday");
        jLabelDate01Day.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate01.setText("24.March");
        jLabelDate01.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate01Year.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate01Year.setText("01");
        jLabelDate01Year.setPreferredSize(new java.awt.Dimension(56, 14));

        javax.swing.GroupLayout jPanelDay01Layout = new javax.swing.GroupLayout(jPanelDay01);
        jPanelDay01.setLayout(jPanelDay01Layout);
        jPanelDay01Layout.setHorizontalGroup(
            jPanelDay01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay01Layout.createSequentialGroup()
                .addGroup(jPanelDay01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDate01Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate01, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate01Year, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanelDay01Layout.setVerticalGroup(
            jPanelDay01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay01Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabelDate01Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate01Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelDay02.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelDay02.setPreferredSize(new java.awt.Dimension(60, 60));

        jLabelDate02Day.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelDate02Day.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate02Day.setText("Wednesday");
        jLabelDate02Day.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate02.setText("24.March");
        jLabelDate02.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate02Year.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate02Year.setText("02");
        jLabelDate02Year.setPreferredSize(new java.awt.Dimension(56, 14));

        javax.swing.GroupLayout jPanelDay02Layout = new javax.swing.GroupLayout(jPanelDay02);
        jPanelDay02.setLayout(jPanelDay02Layout);
        jPanelDay02Layout.setHorizontalGroup(
            jPanelDay02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay02Layout.createSequentialGroup()
                .addGroup(jPanelDay02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDate02Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate02, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate02Year, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanelDay02Layout.setVerticalGroup(
            jPanelDay02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay02Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabelDate02Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate02Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelDay03.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelDay03.setPreferredSize(new java.awt.Dimension(60, 60));

        jLabelDate03Day.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelDate03Day.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate03Day.setText("Monday");
        jLabelDate03Day.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate03.setText("24.March");
        jLabelDate03.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate03Year.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate03Year.setText("03");
        jLabelDate03Year.setPreferredSize(new java.awt.Dimension(56, 14));

        javax.swing.GroupLayout jPanelDay03Layout = new javax.swing.GroupLayout(jPanelDay03);
        jPanelDay03.setLayout(jPanelDay03Layout);
        jPanelDay03Layout.setHorizontalGroup(
            jPanelDay03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay03Layout.createSequentialGroup()
                .addGroup(jPanelDay03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDate03Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate03, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate03Year, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanelDay03Layout.setVerticalGroup(
            jPanelDay03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay03Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabelDate03Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate03Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelDay04.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelDay04.setPreferredSize(new java.awt.Dimension(60, 60));

        jLabelDate04Day.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelDate04Day.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate04Day.setText("Monday");
        jLabelDate04Day.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate04.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate04.setText("24.March");
        jLabelDate04.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate04Year.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate04Year.setText("04");
        jLabelDate04Year.setPreferredSize(new java.awt.Dimension(56, 14));

        javax.swing.GroupLayout jPanelDay04Layout = new javax.swing.GroupLayout(jPanelDay04);
        jPanelDay04.setLayout(jPanelDay04Layout);
        jPanelDay04Layout.setHorizontalGroup(
            jPanelDay04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay04Layout.createSequentialGroup()
                .addGroup(jPanelDay04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDate04Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate04, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate04Year, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanelDay04Layout.setVerticalGroup(
            jPanelDay04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay04Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabelDate04Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate04Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelDay05.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelDay05.setPreferredSize(new java.awt.Dimension(60, 60));

        jLabelDate05Day.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelDate05Day.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate05Day.setText("Monday");
        jLabelDate05Day.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate05.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate05.setText("24.March");
        jLabelDate05.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate05Year.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate05Year.setText("05");
        jLabelDate05Year.setPreferredSize(new java.awt.Dimension(56, 14));

        javax.swing.GroupLayout jPanelDay05Layout = new javax.swing.GroupLayout(jPanelDay05);
        jPanelDay05.setLayout(jPanelDay05Layout);
        jPanelDay05Layout.setHorizontalGroup(
            jPanelDay05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay05Layout.createSequentialGroup()
                .addGroup(jPanelDay05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDate05Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate05, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate05Year, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanelDay05Layout.setVerticalGroup(
            jPanelDay05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay05Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabelDate05Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate05Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelDay06.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelDay06.setPreferredSize(new java.awt.Dimension(60, 60));

        jLabelDate06Day.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelDate06Day.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate06Day.setText("Monday");
        jLabelDate06Day.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate06.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate06.setText("24.March");
        jLabelDate06.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate06Year.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate06Year.setText("06");
        jLabelDate06Year.setPreferredSize(new java.awt.Dimension(56, 14));

        javax.swing.GroupLayout jPanelDay06Layout = new javax.swing.GroupLayout(jPanelDay06);
        jPanelDay06.setLayout(jPanelDay06Layout);
        jPanelDay06Layout.setHorizontalGroup(
            jPanelDay06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay06Layout.createSequentialGroup()
                .addGroup(jPanelDay06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDate06Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate06, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate06Year, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanelDay06Layout.setVerticalGroup(
            jPanelDay06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay06Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabelDate06Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate06Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelDay07.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelDay07.setPreferredSize(new java.awt.Dimension(60, 60));

        jLabelDate07Day.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelDate07Day.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate07Day.setText("Monday");
        jLabelDate07Day.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate07.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate07.setText("24.March");
        jLabelDate07.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate07Year.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate07Year.setText("07");
        jLabelDate07Year.setPreferredSize(new java.awt.Dimension(56, 14));

        javax.swing.GroupLayout jPanelDay07Layout = new javax.swing.GroupLayout(jPanelDay07);
        jPanelDay07.setLayout(jPanelDay07Layout);
        jPanelDay07Layout.setHorizontalGroup(
            jPanelDay07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay07Layout.createSequentialGroup()
                .addGroup(jPanelDay07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDate07Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate07, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate07Year, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanelDay07Layout.setVerticalGroup(
            jPanelDay07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay07Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabelDate07Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate07Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelDay08.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelDay08.setPreferredSize(new java.awt.Dimension(60, 60));

        jLabelDate08Day.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelDate08Day.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate08Day.setText("Monday");
        jLabelDate08Day.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate08.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate08.setText("24.March");
        jLabelDate08.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate08Year.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate08Year.setText("08");
        jLabelDate08Year.setPreferredSize(new java.awt.Dimension(56, 14));

        javax.swing.GroupLayout jPanelDay08Layout = new javax.swing.GroupLayout(jPanelDay08);
        jPanelDay08.setLayout(jPanelDay08Layout);
        jPanelDay08Layout.setHorizontalGroup(
            jPanelDay08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay08Layout.createSequentialGroup()
                .addGroup(jPanelDay08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDate08Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate08, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate08Year, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanelDay08Layout.setVerticalGroup(
            jPanelDay08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay08Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabelDate08Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate08Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelDay09.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelDay09.setPreferredSize(new java.awt.Dimension(60, 60));

        jLabelDate09Day.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelDate09Day.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate09Day.setText("Monday");
        jLabelDate09Day.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate09.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate09.setText("24.March");
        jLabelDate09.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate09Year.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate09Year.setText("09");
        jLabelDate09Year.setPreferredSize(new java.awt.Dimension(56, 14));

        javax.swing.GroupLayout jPanelDay09Layout = new javax.swing.GroupLayout(jPanelDay09);
        jPanelDay09.setLayout(jPanelDay09Layout);
        jPanelDay09Layout.setHorizontalGroup(
            jPanelDay09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay09Layout.createSequentialGroup()
                .addGroup(jPanelDay09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDate09Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate09, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate09Year, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanelDay09Layout.setVerticalGroup(
            jPanelDay09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay09Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabelDate09Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate09Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelDay10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelDay10.setPreferredSize(new java.awt.Dimension(60, 60));

        jLabelDate10Day.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelDate10Day.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate10Day.setText("Monday");
        jLabelDate10Day.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate10.setText("24.March");
        jLabelDate10.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate10Year.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate10Year.setText("10");
        jLabelDate10Year.setPreferredSize(new java.awt.Dimension(56, 14));

        javax.swing.GroupLayout jPanelDay10Layout = new javax.swing.GroupLayout(jPanelDay10);
        jPanelDay10.setLayout(jPanelDay10Layout);
        jPanelDay10Layout.setHorizontalGroup(
            jPanelDay10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay10Layout.createSequentialGroup()
                .addGroup(jPanelDay10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDate10Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate10Year, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanelDay10Layout.setVerticalGroup(
            jPanelDay10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay10Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabelDate10Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate10Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelDay11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelDay11.setPreferredSize(new java.awt.Dimension(60, 60));

        jLabelDate11Day.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelDate11Day.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate11Day.setText("Monday");
        jLabelDate11Day.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate11.setText("24.March");
        jLabelDate11.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate11Year.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate11Year.setText("11");
        jLabelDate11Year.setPreferredSize(new java.awt.Dimension(56, 14));

        javax.swing.GroupLayout jPanelDay11Layout = new javax.swing.GroupLayout(jPanelDay11);
        jPanelDay11.setLayout(jPanelDay11Layout);
        jPanelDay11Layout.setHorizontalGroup(
            jPanelDay11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay11Layout.createSequentialGroup()
                .addGroup(jPanelDay11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDate11Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate11Year, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanelDay11Layout.setVerticalGroup(
            jPanelDay11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay11Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabelDate11Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate11Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelDay12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelDay12.setPreferredSize(new java.awt.Dimension(60, 60));

        jLabelDate12Day.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelDate12Day.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate12Day.setText("Monday");
        jLabelDate12Day.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate12.setText("24.March");
        jLabelDate12.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate12Year.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate12Year.setText("12");
        jLabelDate12Year.setPreferredSize(new java.awt.Dimension(56, 14));

        javax.swing.GroupLayout jPanelDay12Layout = new javax.swing.GroupLayout(jPanelDay12);
        jPanelDay12.setLayout(jPanelDay12Layout);
        jPanelDay12Layout.setHorizontalGroup(
            jPanelDay12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay12Layout.createSequentialGroup()
                .addGroup(jPanelDay12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDate12Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate12Year, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanelDay12Layout.setVerticalGroup(
            jPanelDay12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay12Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabelDate12Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate12Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelDay13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelDay13.setPreferredSize(new java.awt.Dimension(60, 60));

        jLabelDate13Day.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelDate13Day.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate13Day.setText("Monday");
        jLabelDate13Day.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate13.setText("24.March");
        jLabelDate13.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate13Year.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate13Year.setText("13");
        jLabelDate13Year.setPreferredSize(new java.awt.Dimension(56, 14));

        javax.swing.GroupLayout jPanelDay13Layout = new javax.swing.GroupLayout(jPanelDay13);
        jPanelDay13.setLayout(jPanelDay13Layout);
        jPanelDay13Layout.setHorizontalGroup(
            jPanelDay13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay13Layout.createSequentialGroup()
                .addGroup(jPanelDay13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDate13Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate13Year, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanelDay13Layout.setVerticalGroup(
            jPanelDay13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay13Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabelDate13Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate13Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelDay14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelDay14.setPreferredSize(new java.awt.Dimension(60, 60));

        jLabelDate14Day.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelDate14Day.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate14Day.setText("Monday");
        jLabelDate14Day.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate14.setText("24.March");
        jLabelDate14.setPreferredSize(new java.awt.Dimension(56, 14));

        jLabelDate14Year.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDate14Year.setText("14");
        jLabelDate14Year.setPreferredSize(new java.awt.Dimension(56, 14));

        javax.swing.GroupLayout jPanelDay14Layout = new javax.swing.GroupLayout(jPanelDay14);
        jPanelDay14.setLayout(jPanelDay14Layout);
        jPanelDay14Layout.setHorizontalGroup(
            jPanelDay14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay14Layout.createSequentialGroup()
                .addGroup(jPanelDay14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDate14Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate14Year, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanelDay14Layout.setVerticalGroup(
            jPanelDay14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDay14Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabelDate14Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelDate14Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelRoom1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelRoom1.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanelRoom1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jPanelRoom1MousePressed(evt);
            }
        });

        jLabelRoom1RoomID.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabelRoom1RoomID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRoom1RoomID.setText("4");
        jLabelRoom1RoomID.setPreferredSize(new java.awt.Dimension(56, 28));

        jLabelRoom1RoomType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRoom1RoomType.setText("(Single)");
        jLabelRoom1RoomType.setPreferredSize(new java.awt.Dimension(52, 14));

        javax.swing.GroupLayout jPanelRoom1Layout = new javax.swing.GroupLayout(jPanelRoom1);
        jPanelRoom1.setLayout(jPanelRoom1Layout);
        jPanelRoom1Layout.setHorizontalGroup(
            jPanelRoom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRoom1Layout.createSequentialGroup()
                .addComponent(jLabelRoom1RoomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelRoom1Layout.createSequentialGroup()
                .addComponent(jLabelRoom1RoomType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelRoom1Layout.setVerticalGroup(
            jPanelRoom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRoom1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelRoom1RoomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelRoom1RoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelRoom2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelRoom2.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanelRoom2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jPanelRoom2MousePressed(evt);
            }
        });

        jLabelRoom2RoomID.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabelRoom2RoomID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRoom2RoomID.setText("32");
        jLabelRoom2RoomID.setPreferredSize(new java.awt.Dimension(56, 28));

        jLabelRoom2RoomType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRoom2RoomType.setText("(Single)");
        jLabelRoom2RoomType.setPreferredSize(new java.awt.Dimension(56, 14));

        javax.swing.GroupLayout jPanelRoom2Layout = new javax.swing.GroupLayout(jPanelRoom2);
        jPanelRoom2.setLayout(jPanelRoom2Layout);
        jPanelRoom2Layout.setHorizontalGroup(
            jPanelRoom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRoom2Layout.createSequentialGroup()
                .addGroup(jPanelRoom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRoom2RoomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRoom2RoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );
        jPanelRoom2Layout.setVerticalGroup(
            jPanelRoom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRoom2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelRoom2RoomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelRoom2RoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelRoom3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelRoom3.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanelRoom3.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jPanelRoom3MousePressed(evt);
            }
        });

        jLabelRoom3RoomID.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabelRoom3RoomID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRoom3RoomID.setText("35");
        jLabelRoom3RoomID.setPreferredSize(new java.awt.Dimension(56, 28));

        jLabelRoom3RoomType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRoom3RoomType.setText("(Single)");
        jLabelRoom3RoomType.setPreferredSize(new java.awt.Dimension(56, 14));

        javax.swing.GroupLayout jPanelRoom3Layout = new javax.swing.GroupLayout(jPanelRoom3);
        jPanelRoom3.setLayout(jPanelRoom3Layout);
        jPanelRoom3Layout.setHorizontalGroup(
            jPanelRoom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRoom3Layout.createSequentialGroup()
                .addGroup(jPanelRoom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRoom3RoomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRoom3RoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );
        jPanelRoom3Layout.setVerticalGroup(
            jPanelRoom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRoom3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelRoom3RoomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelRoom3RoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelRoom4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelRoom4.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanelRoom4.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jPanelRoom4MousePressed(evt);
            }
        });

        jLabelRoom4RoomID.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabelRoom4RoomID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRoom4RoomID.setText("60");
        jLabelRoom4RoomID.setPreferredSize(new java.awt.Dimension(56, 28));

        jLabelRoom4RoomType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRoom4RoomType.setText("(Single)");
        jLabelRoom4RoomType.setPreferredSize(new java.awt.Dimension(56, 14));

        javax.swing.GroupLayout jPanelRoom4Layout = new javax.swing.GroupLayout(jPanelRoom4);
        jPanelRoom4.setLayout(jPanelRoom4Layout);
        jPanelRoom4Layout.setHorizontalGroup(
            jPanelRoom4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRoom4Layout.createSequentialGroup()
                .addGroup(jPanelRoom4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRoom4RoomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRoom4RoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );
        jPanelRoom4Layout.setVerticalGroup(
            jPanelRoom4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRoom4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelRoom4RoomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelRoom4RoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelRoom5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelRoom5.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanelRoom5.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jPanelRoom5MousePressed(evt);
            }
        });

        jLabelRoom5RoomID.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabelRoom5RoomID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRoom5RoomID.setText("76");
        jLabelRoom5RoomID.setPreferredSize(new java.awt.Dimension(56, 28));

        jLabelRoom5RoomType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRoom5RoomType.setText("(Single)");
        jLabelRoom5RoomType.setPreferredSize(new java.awt.Dimension(56, 14));

        javax.swing.GroupLayout jPanelRoom5Layout = new javax.swing.GroupLayout(jPanelRoom5);
        jPanelRoom5.setLayout(jPanelRoom5Layout);
        jPanelRoom5Layout.setHorizontalGroup(
            jPanelRoom5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRoom5Layout.createSequentialGroup()
                .addGroup(jPanelRoom5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRoom5RoomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRoom5RoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );
        jPanelRoom5Layout.setVerticalGroup(
            jPanelRoom5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRoom5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelRoom5RoomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelRoom5RoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelRoom6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelRoom6.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanelRoom6.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jPanelRoom6MousePressed(evt);
            }
        });

        jLabelRoom6RoomID.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabelRoom6RoomID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRoom6RoomID.setText("78");
        jLabelRoom6RoomID.setPreferredSize(new java.awt.Dimension(56, 28));

        jLabelRoom6RoomType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRoom6RoomType.setText("(Single)");
        jLabelRoom6RoomType.setPreferredSize(new java.awt.Dimension(56, 14));

        javax.swing.GroupLayout jPanelRoom6Layout = new javax.swing.GroupLayout(jPanelRoom6);
        jPanelRoom6.setLayout(jPanelRoom6Layout);
        jPanelRoom6Layout.setHorizontalGroup(
            jPanelRoom6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRoom6Layout.createSequentialGroup()
                .addGroup(jPanelRoom6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRoom6RoomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRoom6RoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );
        jPanelRoom6Layout.setVerticalGroup(
            jPanelRoom6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRoom6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelRoom6RoomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelRoom6RoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelRoom7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelRoom7.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanelRoom7.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jPanelRoom7MousePressed(evt);
            }
        });

        jLabelRoom7RoomID.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabelRoom7RoomID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRoom7RoomID.setText("103");
        jLabelRoom7RoomID.setPreferredSize(new java.awt.Dimension(56, 28));

        jLabelRoom7RoomType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRoom7RoomType.setText("(Single)");
        jLabelRoom7RoomType.setPreferredSize(new java.awt.Dimension(56, 14));

        javax.swing.GroupLayout jPanelRoom7Layout = new javax.swing.GroupLayout(jPanelRoom7);
        jPanelRoom7.setLayout(jPanelRoom7Layout);
        jPanelRoom7Layout.setHorizontalGroup(
            jPanelRoom7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRoom7Layout.createSequentialGroup()
                .addGroup(jPanelRoom7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRoom7RoomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRoom7RoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );
        jPanelRoom7Layout.setVerticalGroup(
            jPanelRoom7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRoom7Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelRoom7RoomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelRoom7RoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelRoom8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelRoom8.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanelRoom8.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jPanelRoom8MousePressed(evt);
            }
        });

        jLabelRoom8RoomID.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabelRoom8RoomID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRoom8RoomID.setText("104");
        jLabelRoom8RoomID.setPreferredSize(new java.awt.Dimension(56, 28));

        jLabelRoom8RoomType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRoom8RoomType.setText("(Single)");
        jLabelRoom8RoomType.setPreferredSize(new java.awt.Dimension(56, 14));

        javax.swing.GroupLayout jPanelRoom8Layout = new javax.swing.GroupLayout(jPanelRoom8);
        jPanelRoom8.setLayout(jPanelRoom8Layout);
        jPanelRoom8Layout.setHorizontalGroup(
            jPanelRoom8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRoom8Layout.createSequentialGroup()
                .addGroup(jPanelRoom8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRoom8RoomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRoom8RoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );
        jPanelRoom8Layout.setVerticalGroup(
            jPanelRoom8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRoom8Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelRoom8RoomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelRoom8RoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelOverviewCells.setPreferredSize(new java.awt.Dimension(840, 480));

        jLabelOC101.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC101.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC101.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC101MousePressed(evt);
            }
        });

        jLabelOC102.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC102.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC102.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC102MousePressed(evt);
            }
        });

        jLabelOC103.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC103.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC103.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC103MousePressed(evt);
            }
        });

        jLabelOC104.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC104.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC104.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC104MousePressed(evt);
            }
        });

        jLabelOC105.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC105.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC105.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC105MousePressed(evt);
            }
        });

        jLabelOC106.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC106.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC106.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC106MousePressed(evt);
            }
        });

        jLabelOC107.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC107.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC107.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC107MousePressed(evt);
            }
        });

        jLabelOC108.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC108.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC108.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC108MousePressed(evt);
            }
        });

        jLabelOC109.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC109.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC109.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC109MousePressed(evt);
            }
        });

        jLabelOC110.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC110.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC110.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC110MousePressed(evt);
            }
        });

        jLabelOC111.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC111.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC111.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC111MousePressed(evt);
            }
        });

        jLabelOC112.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC112.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC112.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC112MousePressed(evt);
            }
        });

        jLabelOC113.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC113.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC113.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC113MousePressed(evt);
            }
        });

        jLabelOC114.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC114.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC114.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC114MousePressed(evt);
            }
        });

        jLabelOC201.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC201.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC201.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC201MousePressed(evt);
            }
        });

        jLabelOC202.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC202.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC202.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC202MousePressed(evt);
            }
        });

        jLabelOC203.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC203.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC203.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC203MousePressed(evt);
            }
        });

        jLabelOC204.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC204.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC204.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC204MousePressed(evt);
            }
        });

        jLabelOC205.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC205.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC205.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC205MousePressed(evt);
            }
        });

        jLabelOC206.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC206.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC206.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC206MousePressed(evt);
            }
        });

        jLabelOC207.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC207.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC207.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC207MousePressed(evt);
            }
        });

        jLabelOC208.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC208.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC208.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC208MousePressed(evt);
            }
        });

        jLabelOC209.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC209.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC209.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC209MousePressed(evt);
            }
        });

        jLabelOC210.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC210.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC210.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC210MousePressed(evt);
            }
        });

        jLabelOC211.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC211.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC211.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC211MousePressed(evt);
            }
        });

        jLabelOC212.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC212.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC212.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC212MousePressed(evt);
            }
        });

        jLabelOC213.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC213.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC213.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC213MousePressed(evt);
            }
        });

        jLabelOC214.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC214.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC214.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC214MousePressed(evt);
            }
        });

        jLabelOC301.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC301.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC301.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC301MousePressed(evt);
            }
        });

        jLabelOC302.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC302.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC302.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC302MousePressed(evt);
            }
        });

        jLabelOC303.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC303.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC303.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC303MousePressed(evt);
            }
        });

        jLabelOC304.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC304.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC304.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC304MousePressed(evt);
            }
        });

        jLabelOC305.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC305.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC305.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC305MousePressed(evt);
            }
        });

        jLabelOC306.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC306.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC306.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC306MousePressed(evt);
            }
        });

        jLabelOC307.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC307.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC307.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC307MousePressed(evt);
            }
        });

        jLabelOC308.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC308.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC308.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC308MousePressed(evt);
            }
        });

        jLabelOC309.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC309.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC309.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC309MousePressed(evt);
            }
        });

        jLabelOC310.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC310.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC310.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC310MousePressed(evt);
            }
        });

        jLabelOC311.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC311.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC311.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC311MousePressed(evt);
            }
        });

        jLabelOC312.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC312.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC312.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC312MousePressed(evt);
            }
        });

        jLabelOC313.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC313.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC313.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC313MousePressed(evt);
            }
        });

        jLabelOC314.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC314.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC314.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC314MousePressed(evt);
            }
        });

        jLabelOC401.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC401.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC401.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC401MousePressed(evt);
            }
        });

        jLabelOC402.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC402.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC402.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC402MousePressed(evt);
            }
        });

        jLabelOC403.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC403.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC403.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC403MousePressed(evt);
            }
        });

        jLabelOC404.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC404.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC404.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC404MousePressed(evt);
            }
        });

        jLabelOC405.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC405.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC405.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC405MousePressed(evt);
            }
        });

        jLabelOC406.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC406.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC406.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC406MousePressed(evt);
            }
        });

        jLabelOC407.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC407.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC407.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC407MousePressed(evt);
            }
        });

        jLabelOC408.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC408.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC408.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC408MousePressed(evt);
            }
        });

        jLabelOC409.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC409.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC409.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC409MousePressed(evt);
            }
        });

        jLabelOC410.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC410.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC410.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC410MousePressed(evt);
            }
        });

        jLabelOC411.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC411.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC411.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC411MousePressed(evt);
            }
        });

        jLabelOC412.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC412.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC412.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC412MousePressed(evt);
            }
        });

        jLabelOC413.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC413.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC413.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC413MousePressed(evt);
            }
        });

        jLabelOC414.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC414.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC414.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC414MousePressed(evt);
            }
        });

        jLabelOC501.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC501.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC501.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC501MousePressed(evt);
            }
        });

        jLabelOC502.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC502.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC502.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC502MousePressed(evt);
            }
        });

        jLabelOC503.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC503.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC503.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC503MousePressed(evt);
            }
        });

        jLabelOC504.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC504.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC504.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC504MousePressed(evt);
            }
        });

        jLabelOC505.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC505.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC505.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC505MousePressed(evt);
            }
        });

        jLabelOC506.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC506.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC506.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC506MousePressed(evt);
            }
        });

        jLabelOC507.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC507.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC507.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC507MousePressed(evt);
            }
        });

        jLabelOC508.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC508.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC508.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC508MousePressed(evt);
            }
        });

        jLabelOC509.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC509.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC509.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC509MousePressed(evt);
            }
        });

        jLabelOC510.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC510.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC510.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC510MousePressed(evt);
            }
        });

        jLabelOC511.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC511.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC511.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC511MousePressed(evt);
            }
        });

        jLabelOC512.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC512.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC512.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC512MousePressed(evt);
            }
        });

        jLabelOC513.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC513.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC513.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC513MousePressed(evt);
            }
        });

        jLabelOC514.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC514.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC514.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC514MousePressed(evt);
            }
        });

        jLabelOC601.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC601.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC601.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC601MousePressed(evt);
            }
        });

        jLabelOC602.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC602.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC602.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC602MousePressed(evt);
            }
        });

        jLabelOC603.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC603.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC603.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC603MousePressed(evt);
            }
        });

        jLabelOC604.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC604.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC604.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC604MousePressed(evt);
            }
        });

        jLabelOC605.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC605.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC605.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC605MousePressed(evt);
            }
        });

        jLabelOC606.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC606.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC606.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC606MousePressed(evt);
            }
        });

        jLabelOC607.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC607.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC607.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC607MousePressed(evt);
            }
        });

        jLabelOC608.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC608.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC608.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC608MousePressed(evt);
            }
        });

        jLabelOC609.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC609.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC609.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC609MousePressed(evt);
            }
        });

        jLabelOC610.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC610.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC610.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC610MousePressed(evt);
            }
        });

        jLabelOC611.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC611.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC611.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC611MousePressed(evt);
            }
        });

        jLabelOC612.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC612.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC612.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC612MousePressed(evt);
            }
        });

        jLabelOC613.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC613.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC613.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC613MousePressed(evt);
            }
        });

        jLabelOC614.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC614.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC614.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC614MousePressed(evt);
            }
        });

        jLabelOC701.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC701.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC701.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC701MousePressed(evt);
            }
        });

        jLabelOC702.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC702.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC702.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC702MousePressed(evt);
            }
        });

        jLabelOC703.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC703.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC703.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC703MousePressed(evt);
            }
        });

        jLabelOC704.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC704.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC704.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC704MousePressed(evt);
            }
        });

        jLabelOC705.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC705.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC705.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC705MousePressed(evt);
            }
        });

        jLabelOC706.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC706.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC706.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC706MousePressed(evt);
            }
        });

        jLabelOC707.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC707.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC707.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC707MousePressed(evt);
            }
        });

        jLabelOC708.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC708.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC708.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC708MousePressed(evt);
            }
        });

        jLabelOC709.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC709.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC709.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC709MousePressed(evt);
            }
        });

        jLabelOC710.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC710.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC710.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC710MousePressed(evt);
            }
        });

        jLabelOC711.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC711.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC711.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC711MousePressed(evt);
            }
        });

        jLabelOC712.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC712.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC712.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC712MousePressed(evt);
            }
        });

        jLabelOC713.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC713.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC713.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC713MousePressed(evt);
            }
        });

        jLabelOC714.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC714.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC714.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC714MousePressed(evt);
            }
        });

        jLabelOC801.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC801.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC801.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                jLabelOC801MouseReleased(evt);
            }
        });

        jLabelOC802.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC802.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC802.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC802MousePressed(evt);
            }
        });

        jLabelOC803.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC803.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC803.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC803MousePressed(evt);
            }
        });

        jLabelOC804.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC804.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC804.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC804MousePressed(evt);
            }
        });

        jLabelOC805.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC805.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC805.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC805MousePressed(evt);
            }
        });

        jLabelOC806.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC806.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC806.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC806MousePressed(evt);
            }
        });

        jLabelOC807.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC807.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC807.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC807MousePressed(evt);
            }
        });

        jLabelOC808.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC808.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC808.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC808MousePressed(evt);
            }
        });

        jLabelOC809.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC809.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC809.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC809MousePressed(evt);
            }
        });

        jLabelOC810.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC810.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC810.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC810MousePressed(evt);
            }
        });

        jLabelOC811.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC811.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC811.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC811MousePressed(evt);
            }
        });

        jLabelOC812.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC812.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC812.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC812MousePressed(evt);
            }
        });

        jLabelOC813.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC813.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC813.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC813MousePressed(evt);
            }
        });

        jLabelOC814.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelOC814.setPreferredSize(new java.awt.Dimension(60, 60));
        jLabelOC814.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabelOC814MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOverviewCellsLayout = new javax.swing.GroupLayout(jPanelOverviewCells);
        jPanelOverviewCells.setLayout(jPanelOverviewCellsLayout);
        jPanelOverviewCellsLayout.setHorizontalGroup(
            jPanelOverviewCellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOverviewCellsLayout.createSequentialGroup()
                .addGroup(jPanelOverviewCellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOverviewCellsLayout.createSequentialGroup()
                        .addComponent(jLabelOC101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC102, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelOverviewCellsLayout.createSequentialGroup()
                        .addComponent(jLabelOC201, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC202, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC203, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC204, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC205, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC206, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC207, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC208, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC209, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC210, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC211, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC213, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC214, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelOverviewCellsLayout.createSequentialGroup()
                        .addComponent(jLabelOC301, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC302, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC303, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC304, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC305, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC306, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC307, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC308, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC309, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC310, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC311, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC312, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC313, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC314, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelOverviewCellsLayout.createSequentialGroup()
                        .addComponent(jLabelOC401, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC402, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC403, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC404, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC405, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC406, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC407, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC408, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC409, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC410, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC411, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC412, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC413, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC414, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelOverviewCellsLayout.createSequentialGroup()
                        .addComponent(jLabelOC501, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC502, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC503, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC504, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC505, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC506, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC507, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC508, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC509, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC510, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC511, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC512, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC513, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC514, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelOverviewCellsLayout.createSequentialGroup()
                        .addComponent(jLabelOC601, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC602, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC603, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC604, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC605, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC606, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC607, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC608, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC609, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC610, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC611, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC612, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC613, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC614, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelOverviewCellsLayout.createSequentialGroup()
                        .addComponent(jLabelOC701, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC702, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC703, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC704, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC705, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC706, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC707, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC708, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC709, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC710, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC711, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC712, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC713, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC714, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelOverviewCellsLayout.createSequentialGroup()
                        .addComponent(jLabelOC801, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC802, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC803, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC804, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC805, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC806, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC807, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC808, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC809, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC810, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC811, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC812, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC813, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabelOC814, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        jPanelOverviewCellsLayout.setVerticalGroup(
            jPanelOverviewCellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOverviewCellsLayout.createSequentialGroup()
                .addGroup(jPanelOverviewCellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelOC101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC102, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC104, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanelOverviewCellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelOC201, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC202, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC203, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC204, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC205, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC206, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC207, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC208, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC209, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC210, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC211, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC213, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC214, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanelOverviewCellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelOC301, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC302, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC303, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC304, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC305, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC306, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC307, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC308, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC309, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC310, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC311, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC312, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC313, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC314, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanelOverviewCellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelOC401, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC402, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC403, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC404, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC405, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC406, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC407, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC408, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC409, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC410, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC411, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC412, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC413, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC414, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanelOverviewCellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelOC501, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC502, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC503, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC504, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC505, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC506, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC507, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC508, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC509, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC510, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC511, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC512, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC513, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC514, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanelOverviewCellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelOC601, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC602, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC603, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC604, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC605, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC606, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC607, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC608, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC609, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC610, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC611, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC612, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC613, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC614, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanelOverviewCellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelOC701, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC702, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC703, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC704, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC705, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC706, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC707, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC708, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC709, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC710, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC711, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC712, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC713, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC714, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanelOverviewCellsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelOC801, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC802, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC803, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC804, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC805, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC806, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC807, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC808, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC809, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC810, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC811, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC812, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC813, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOC814, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jLabel63.setText("Rooms");

        jLabelMainShowDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelMainShowDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelMainShowDate.setText("Wednesday, 21. September - 2014");
        jLabelMainShowDate.setPreferredSize(new java.awt.Dimension(250, 24));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMainInfoNotifier, javax.swing.GroupLayout.DEFAULT_SIZE, 963, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jPanelOverviewCellsButtons1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelOverviewCellsButtons2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPanelRoom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanelRoom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanelRoom4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanelRoom6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanelRoom5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanelRoom7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanelRoom8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanelRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel63)
                                        .addGap(14, 14, 14)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanelDay01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jPanelDay02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jPanelDay03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jPanelDay04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jPanelDay05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jPanelDay06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jPanelDay07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jPanelDay08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jPanelDay09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jPanelDay10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jPanelDay11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jPanelDay12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jPanelDay13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jPanelDay14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanelOverviewCells, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelMainBookingButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jPanelMainSearchButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jPanelMainCheckInOutButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelMainShowDate, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMainBookingButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelMainSearchButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelMainCheckInOutButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelMainShowDate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jPanelMainInfoNotifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelOverviewCellsButtons1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPanelDay01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanelDay02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanelDay03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanelDay04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanelDay05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanelDay06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanelDay07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanelDay08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanelDay09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanelDay10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanelDay11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanelDay12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanelDay13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanelDay14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanelRoom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanelRoom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanelRoom4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanelRoom5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanelRoom6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanelRoom7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanelRoom8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanelOverviewCells, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanelOverviewCellsButtons2, javax.swing.GroupLayout.PREFERRED_SIZE, 546, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBookingActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBookingActionPerformed
    {//GEN-HEADEREND:event_jButtonBookingActionPerformed
        //Opens Dialog-window "New Booking"
        setupDialogBooking();
    }//GEN-LAST:event_jButtonBookingActionPerformed

    private void jButtonSearchCustomerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonSearchCustomerActionPerformed
    {//GEN-HEADEREND:event_jButtonSearchCustomerActionPerformed
        //Opens Dialog-window "Search Customer"
        setupDialogSearchCustomer(false);
    }//GEN-LAST:event_jButtonSearchCustomerActionPerformed

    private void jButtonSearchRoomActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonSearchRoomActionPerformed
    {//GEN-HEADEREND:event_jButtonSearchRoomActionPerformed
        //Opens Dialog-window "Search Room"
        setupDialogSearchRoom();
    }//GEN-LAST:event_jButtonSearchRoomActionPerformed

    private void jButtonRoomArrowUpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonRoomArrowUpActionPerformed
    {//GEN-HEADEREND:event_jButtonRoomArrowUpActionPerformed
        //Show the 8 rooms below what is shown at Room1. If below 0 (zero) show RoomID's 001-008.
        ovcListIndex = ovcListIndex - 8;
        setupOverviewList();
    }//GEN-LAST:event_jButtonRoomArrowUpActionPerformed

    private void jButtonRoomArrowDownActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonRoomArrowDownActionPerformed
    {//GEN-HEADEREND:event_jButtonRoomArrowDownActionPerformed
        //Show the next 8 rooms higher than what is shown at Room8. If higher than maximum room (RoomID 104) then show RoomID's 097-104.
        ovcListIndex = ovcListIndex + 8;
        setupOverviewList();
    }//GEN-LAST:event_jButtonRoomArrowDownActionPerformed

    private void jButtonSetupOverviewActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonSetupOverviewActionPerformed
    {//GEN-HEADEREND:event_jButtonSetupOverviewActionPerformed
        //Opens Dialog-window "Setup Overview"
        setupDialogSetupOverview(ovcRoom1, ovcRoom2, ovcRoom3, ovcRoom4, ovcRoom5, ovcRoom6, ovcRoom7, ovcRoom8);
    }//GEN-LAST:event_jButtonSetupOverviewActionPerformed

    private void jButtonResetOveriewActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonResetOveriewActionPerformed
    {//GEN-HEADEREND:event_jButtonResetOveriewActionPerformed
        //Shows rooms 1 to 8, starting from today in the cells in main-window
        cal = Calendar.getInstance();
        spc.setOVCdate(cal);
        resetMainScreen("001", "002", "003", "004", "005", "006", "007", "008");
    }//GEN-LAST:event_jButtonResetOveriewActionPerformed

    private void jButtonSearchCustomerDetailsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonSearchCustomerDetailsActionPerformed
    {//GEN-HEADEREND:event_jButtonSearchCustomerDetailsActionPerformed
        //Searching for customers that matches or contains the entered search parameters in dialog-window "Search Customer"
        boolean booleanList = true;
        int searchParameter = 0;
        String scGuestID = jTextFieldSearchCustomerGuestID.getText().toUpperCase();
        String scFirstName = jTextFieldSearchCustomerFirstName.getText();
        String scLastName = jTextFieldSearchCustomerLastName.getText();
        String scCountry = jTextFieldSearchCustomerCountry.getText();
        String scPhone = jTextFieldSearchCustomerPhoneNumber.getText();
        String scEmail = jTextFieldSearchCustomerEmail.getText();
        ArrayList<String> tempListGuestID = new ArrayList<>();
        jLabelSearchCustomerGuestID.setText("");
        jLabelSearchCustomerFirstName.setText("");
        jLabelSearchCustomerLastName.setText("");
        jLabelSearchCustomerCountry.setText("");
        jLabelSearchCustomerPhone.setText("");
        jLabelSearchCustomerEmail.setText("");
        writeList.clear();
        writeList1.clear();
        guestList.clear();
        
        //Finds one of the entered data and searches database for customers that matches fully or partially the entered.
        //(Searches database for only one of the entered data in following priority: GuestID, FirstName, LastName, Country, Phone, Email)
        if(scGuestID.equals(""))
        {
            if(scFirstName.equals(""))
            {
                if(scLastName.equals(""))
                {
                    if(scCountry.equals(""))
                    {
                        if(scPhone.equals(""))
                        {
                            if(scEmail.equals(""))
                            {
                                booleanList = false;
                                writeList.addElement("Missing search parameter...");
                                jListSearchCustomerResult.setModel(writeList);
                            } else
                            {
                                searchParameter = 6;
                                guestList = (jdcbselect.getInfoFromMail(scEmail));
                            }
                        } else
                        {
                            searchParameter = 5;
                            guestList = (jdcbselect.getInfoFromPhone(scPhone));
                        }
                    } else
                    {
                        searchParameter = 4;
                        guestList = (jdcbselect.getInfoFromCountry(scCountry));
                    }
                } else
                {
                    searchParameter = 3;
                    guestList = (jdcbselect.getInfoFromLastName(scLastName));
                }
            } else
            {
                searchParameter = 2;
                guestList = (jdcbselect.getInfoFromFirstName(scFirstName));
            }
        } else
        {
            searchParameter = 1;
            guestList.addAll(jdcbselect.getInfoFromGuestID(scGuestID));
        }
        
        //Continues to remove objects that does not match any other entered search parameters
        if(booleanList == true)
        {
            if(guestList.size() > 0)
            {
                int i = 0;
//                switch (searchParameter)
//                {
//                    case 1:
//                        i = 0;
//                        while(i < guestList.size())
//                        {
//                            if (guestList.get(i).getGuestFirstname().toLowerCase().contains(scFirstName.toLowerCase()))
//                            {
//                                if(tempListGuestID.contains(guestList.get(i).getGuestID()))
//                                {
//                                    guestList.remove(i);
//                                } else
//                                {
//                                    tempListGuestID.add(guestList.get(i).getGuestID());
//                                    i++;
//                                }
//                            } else
//                            {
//                                guestList.remove(i);
//                            }
//                        }
//                    case 2:
//                        i = 0;
//                        while(i < guestList.size())
//                        {
//                            if (guestList.get(i).getGuestLastName().toLowerCase().contains(scLastName.toLowerCase()))
//                            {
//                                if(tempListGuestID.contains(guestList.get(i).getGuestID()))
//                                {
//                                    guestList.remove(i);
//                                } else
//                                {
//                                    tempListGuestID.add(guestList.get(i).getGuestID());
//                                    i++;
//                                }
//                            } else
//                            {
//                                guestList.remove(i);
//                            }
//                        }
//                    case 3:
//                        i = 0;
//                        while(i < guestList.size())
//                        {
//                            if (guestList.get(i).getCountry().toLowerCase().contains(scCountry.toLowerCase()))
//                            {
//                                if(tempListGuestID.contains(guestList.get(i).getGuestID()))
//                                {
//                                    guestList.remove(i);
//                                } else
//                                {
//                                    tempListGuestID.add(guestList.get(i).getGuestID());
//                                    i++;
//                                }
//                            } else
//                            {
//                                guestList.remove(i);
//                            }
//                        }
//                    case 4:
//                        i = 0;
//                        while(i < guestList.size())
//                        {
//                            if (guestList.get(i).getContanctPhone().toLowerCase().contains(scPhone.toLowerCase()))
//                            {
//                                if(tempListGuestID.contains(guestList.get(i).getGuestID()))
//                                {
//                                    guestList.remove(i);
//                                } else
//                                {
//                                    tempListGuestID.add(guestList.get(i).getGuestID());
//                                    i++;
//                                }
//                            } else
//                            {
//                                guestList.remove(i);
//                            }
//                        }
//                    case 5:
//                        i = 0;
//                        while(i < guestList.size())
//                        {
//                            if (guestList.get(i).getEmail().toLowerCase().contains(scEmail.toLowerCase()))
//                            {
//                                if(tempListGuestID.contains(guestList.get(i).getGuestID()))
//                                {
//                                    guestList.remove(i);
//                                } else
//                                {
//                                    tempListGuestID.add(guestList.get(i).getGuestID());
//                                    i++;
//                                }
//                            } else
//                            {
//                                guestList.remove(i);
//                            }
//                        }
//                    default:
//                        break;
//                }
                
                //Copies the remaining list with search-results from the entered data to a defaultlist and writes the list in GUI.
                for (int k = 0; k < guestList.size(); ++k)
                {
                    String searchFirstName = guestList.get(k).getGuestFirstname();
                    String searchLastName = guestList.get(k).getGuestLastName();
                    String searchCountry = guestList.get(k).getCountry();
                    String searchPhoneNumber = guestList.get(k).getContanctPhone();
                    String searchEmail = guestList.get(k).getEmail();
                    String searchGuestID = guestList.get(k).getGuestID();
                    writeList.addElement(searchGuestID + " - " + searchLastName + ", " + searchFirstName + " - " + searchCountry + " - " + searchPhoneNumber + " - " + searchEmail);
                }
                jListSearchCustomerResult.setModel(writeList);
            }
            if(guestList.size() < 1)
            {
                writeList.addElement("No results found...");
                jListSearchCustomerResult.setModel(writeList);
            }
        }
    }//GEN-LAST:event_jButtonSearchCustomerDetailsActionPerformed

    private void jComboBoxBookingStartMonthActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxBookingStartMonthActionPerformed
    {//GEN-HEADEREND:event_jComboBoxBookingStartMonthActionPerformed
        setupBookingStartDate();
        setupBookingNightsNotifier();
    }//GEN-LAST:event_jComboBoxBookingStartMonthActionPerformed

    private void jComboBoxBookingStartYearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxBookingStartYearActionPerformed
    {//GEN-HEADEREND:event_jComboBoxBookingStartYearActionPerformed
        setupBookingStartDate();
        setupBookingNightsNotifier();
    }//GEN-LAST:event_jComboBoxBookingStartYearActionPerformed

    private void jComboBoxBookingEndMonthActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxBookingEndMonthActionPerformed
    {//GEN-HEADEREND:event_jComboBoxBookingEndMonthActionPerformed
        setupBookingEndDate();
        setupBookingNightsNotifier();
    }//GEN-LAST:event_jComboBoxBookingEndMonthActionPerformed

    private void jComboBoxBookingEndYearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxBookingEndYearActionPerformed
    {//GEN-HEADEREND:event_jComboBoxBookingEndYearActionPerformed
        setupBookingEndDate();
        setupBookingNightsNotifier();
    }//GEN-LAST:event_jComboBoxBookingEndYearActionPerformed

    private void jButtonBookingBookActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBookingBookActionPerformed
    {//GEN-HEADEREND:event_jButtonBookingBookActionPerformed
        String returnGuest;
        ArrayList guestListBooking = jdcbselect.checkIdAva();
        String bookingFirstName = jTextFieldBookingFirstName.getText();
        String bookingLastName = jTextFieldBookingLastName.getText();
        String bookingCountry = jTextFieldBookingCountry.getText();
        String bookingPhone = jTextFieldBookingPhoneNumber.getText();
        String bookingEmail = jTextFieldBookingEmail.getText();
        if(guestListBooking.contains(jTextFieldBookingGuestID.getText()))
        {
            returnGuest = "Y";
        } else
        {
            returnGuest = "N";
        }
        try
        {
            jdcbinsert.JDBCInsertRoom(jTextFieldBookingGuestID.getText(), bookingRoomID, "E05", bookingDateFrom, bookingNumberNights,
                    bookingDateTo, "Y", bookingFirstName, bookingLastName, bookingCountry,
                    bookingPhone, bookingEmail, returnGuest);
        } catch (SQLException ex)
        {
            Logger.getLogger(CasablancaGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        setupDialogBooking();
        jLabelBookingRoomNotifier.setText("Room has been booked...");
        bookingRoomID = "";
        bookingNumberNights = "";
        bookingDateFrom = "";
        bookingDateTo = "";
    }//GEN-LAST:event_jButtonBookingBookActionPerformed

    private void jButtonPrevious14DaysActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonPrevious14DaysActionPerformed
    {//GEN-HEADEREND:event_jButtonPrevious14DaysActionPerformed
        // Show the selected rooms, but 14 days previous the current period
        ovcStartDate.setTime(spc.getOVCdate().getTime());
        ovcStartDate.add(Calendar.DAY_OF_MONTH, -14);
        spc.setOVCdate(ovcStartDate);
        updateCells();
    }//GEN-LAST:event_jButtonPrevious14DaysActionPerformed

    private void jButtonPrevious7DaysActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonPrevious7DaysActionPerformed
    {//GEN-HEADEREND:event_jButtonPrevious7DaysActionPerformed
        // Show the selected rooms, but 7 days previous the current period
        ovcStartDate.setTime(spc.getOVCdate().getTime());
        ovcStartDate.add(Calendar.DAY_OF_MONTH, -7);
        spc.setOVCdate(ovcStartDate);
        updateCells();
    }//GEN-LAST:event_jButtonPrevious7DaysActionPerformed

    private void jButtonNext7DaysActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonNext7DaysActionPerformed
    {//GEN-HEADEREND:event_jButtonNext7DaysActionPerformed
        // Show the selected rooms, but 7 days after the current period
        ovcStartDate.setTime(spc.getOVCdate().getTime());
        ovcStartDate.add(Calendar.DAY_OF_MONTH, 7);
        spc.setOVCdate(ovcStartDate);
        updateCells();
    }//GEN-LAST:event_jButtonNext7DaysActionPerformed

    private void jButtonNext14DaysActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonNext14DaysActionPerformed
    {//GEN-HEADEREND:event_jButtonNext14DaysActionPerformed
        // Show the selected rooms, but 14 days after the current period
        ovcStartDate.setTime(spc.getOVCdate().getTime());
        ovcStartDate.add(Calendar.DAY_OF_MONTH, 14);
        spc.setOVCdate(ovcStartDate);
        updateCells();
        System.out.println(sdf.format(ovcStartDate.getTime()));
    }//GEN-LAST:event_jButtonNext14DaysActionPerformed

    private void jButtonNext14DaysMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonNext14DaysMouseEntered
    {//GEN-HEADEREND:event_jButtonNext14DaysMouseEntered
        jButtonNext14Days.setBorderPainted(true);
    }//GEN-LAST:event_jButtonNext14DaysMouseEntered

    private void jButtonNext14DaysMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonNext14DaysMouseExited
    {//GEN-HEADEREND:event_jButtonNext14DaysMouseExited
        jButtonNext14Days.setBorderPainted(false);
    }//GEN-LAST:event_jButtonNext14DaysMouseExited

    private void jButtonNext7DaysMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonNext7DaysMouseEntered
    {//GEN-HEADEREND:event_jButtonNext7DaysMouseEntered
        jButtonNext7Days.setBorderPainted(true);
    }//GEN-LAST:event_jButtonNext7DaysMouseEntered

    private void jButtonNext7DaysMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonNext7DaysMouseExited
    {//GEN-HEADEREND:event_jButtonNext7DaysMouseExited
        jButtonNext7Days.setBorderPainted(false);
    }//GEN-LAST:event_jButtonNext7DaysMouseExited

    private void jButtonPrevious14DaysMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonPrevious14DaysMouseEntered
    {//GEN-HEADEREND:event_jButtonPrevious14DaysMouseEntered
        jButtonPrevious14Days.setBorderPainted(true);
    }//GEN-LAST:event_jButtonPrevious14DaysMouseEntered

    private void jButtonPrevious14DaysMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonPrevious14DaysMouseExited
    {//GEN-HEADEREND:event_jButtonPrevious14DaysMouseExited
        jButtonPrevious14Days.setBorderPainted(false);
    }//GEN-LAST:event_jButtonPrevious14DaysMouseExited

    private void jButtonPrevious7DaysMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonPrevious7DaysMouseEntered
    {//GEN-HEADEREND:event_jButtonPrevious7DaysMouseEntered
        jButtonPrevious7Days.setBorderPainted(true);
    }//GEN-LAST:event_jButtonPrevious7DaysMouseEntered

    private void jButtonPrevious7DaysMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonPrevious7DaysMouseExited
    {//GEN-HEADEREND:event_jButtonPrevious7DaysMouseExited
        jButtonPrevious7Days.setBorderPainted(false);
    }//GEN-LAST:event_jButtonPrevious7DaysMouseExited

    private void jButtonBookingCreateIDActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBookingCreateIDActionPerformed
    {//GEN-HEADEREND:event_jButtonBookingCreateIDActionPerformed
        //Creates a new random guestID and makes sure that it does not exist already
        boolean IDcreated = false;
        String IDtemp = "";
        ArrayList<String> GuestIDtemp = new ArrayList<>();
        GuestIDtemp = jdcbselect.checkIdAva();
        while (IDcreated == false)
        {
            String characters = "123456789ABCDEFGHIJKLMNPQRSTUVWXYZ";
            int i1 = r.nextInt(34);
            int i2 = r.nextInt(34);
            int i3 = r.nextInt(34);
            int i4 = r.nextInt(34);
            int i5 = r.nextInt(34);
            String s1 = characters.substring(i1, (i1 + 1));
            String s2 = characters.substring(i2, (i2 + 1));
            String s3 = characters.substring(i3, (i3 + 1));
            String s4 = characters.substring(i4, (i4 + 1));
            String s5 = characters.substring(i5, (i5 + 1));
            IDtemp = (s1 + s2 + s3 + s4 + s5).toString();
            if (!GuestIDtemp.contains(IDtemp))
            {
                IDcreated = true;
            }
        }
        jTextFieldBookingGuestID.setText(IDtemp);
    }//GEN-LAST:event_jButtonBookingCreateIDActionPerformed

    private void jComboBoxCheckInMonthActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxCheckInMonthActionPerformed
    {//GEN-HEADEREND:event_jComboBoxCheckInMonthActionPerformed
        int year = (jComboBoxCheckInYear.getSelectedIndex()+2014);
        int month = jComboBoxCheckInMonth.getSelectedIndex();
        int dim = getDaysInMonth(month, year);
        String[] list = getComboBoxList(dim);
        jComboBoxCheckInDate.setModel(new javax.swing.DefaultComboBoxModel(list));
    }//GEN-LAST:event_jComboBoxCheckInMonthActionPerformed

    private void jComboBoxCheckInYearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxCheckInYearActionPerformed
    {//GEN-HEADEREND:event_jComboBoxCheckInYearActionPerformed
        int year = (jComboBoxCheckInYear.getSelectedIndex()+2014);
        int month = jComboBoxCheckInMonth.getSelectedIndex();
        int dim = getDaysInMonth(month, year);
        String[] list = getComboBoxList(dim);
        jComboBoxCheckInDate.setModel(new javax.swing.DefaultComboBoxModel(list));
    }//GEN-LAST:event_jComboBoxCheckInYearActionPerformed

    private void jButtonCheckInActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonCheckInActionPerformed
    {//GEN-HEADEREND:event_jButtonCheckInActionPerformed
        //Opens Dialog-window "Check In"
        setupDialogCheckIn();
    }//GEN-LAST:event_jButtonCheckInActionPerformed

    private void jComboBoxBookingRoomTypeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxBookingRoomTypeActionPerformed
    {//GEN-HEADEREND:event_jComboBoxBookingRoomTypeActionPerformed
        int SearchRoomType = jComboBoxBookingRoomType.getSelectedIndex();
        switch (SearchRoomType)
        {
            case 0:
                jLabelBookingRoomTypePersonsNotifier.setText("(1 person)");
                break;
            case 1:
                jLabelBookingRoomTypePersonsNotifier.setText("(2 persons)");
                break;
            case 2:
                jLabelBookingRoomTypePersonsNotifier.setText("(5 persons)");
                break;
        }
    }//GEN-LAST:event_jComboBoxBookingRoomTypeActionPerformed

    private void jTextFieldBookingFirstNameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldBookingFirstNameActionPerformed
    {//GEN-HEADEREND:event_jTextFieldBookingFirstNameActionPerformed
    }//GEN-LAST:event_jTextFieldBookingFirstNameActionPerformed

    private void jButtonShowSelectedCustomerDetailsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonShowSelectedCustomerDetailsActionPerformed
    {//GEN-HEADEREND:event_jButtonShowSelectedCustomerDetailsActionPerformed
        int selectedCustomer = jListSearchCustomerResult.getSelectedIndex();
        writeList1.clear();
        if(selectedCustomer >= 0 && guestList.size() > 0)
        {
            jLabelSearchCustomerGuestID.setText(guestList.get(selectedCustomer).getGuestID());
            jLabelSearchCustomerFirstName.setText(guestList.get(selectedCustomer).getGuestFirstname());
            jLabelSearchCustomerLastName.setText(guestList.get(selectedCustomer).getGuestLastName());
            jLabelSearchCustomerCountry.setText(guestList.get(selectedCustomer).getCountry());
            jLabelSearchCustomerPhone.setText(guestList.get(selectedCustomer).getContanctPhone());
            jLabelSearchCustomerEmail.setText(guestList.get(selectedCustomer).getEmail());
            
            //Search Database for all bookings attached to the selected guests GuestID and prints them in GUI
            ArrayList<InfoObjectConstructor> guestInfo = jdcbselect.getInfoFromGuestID(guestList.get(selectedCustomer).getGuestID());
            for(int a = 0; a<guestInfo.size(); a++)
            {
                RoomTypeIDConstructor rt = jdcbselect.getRoomInfoFromRoomID(guestInfo.get(a).getRoomID());
                String rType = rt.getRoomType();
                String rID = guestInfo.get(a).getRoomID();
                String dFrom = guestInfo.get(a).getDateFrom();
                String dTo = guestInfo.get(a).getDateTo();
                writeList1.addElement(dFrom + " to " + dTo + ",   " + rType + " Room");
            }
            jListSearchCustomerBookingsHistory.setModel(writeList1);
        }
    }//GEN-LAST:event_jButtonShowSelectedCustomerDetailsActionPerformed

    private void jButtonEditSelectedCustomerDetailsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonEditSelectedCustomerDetailsActionPerformed
    {//GEN-HEADEREND:event_jButtonEditSelectedCustomerDetailsActionPerformed
        String gID = jLabelSearchCustomerGuestID.getText();
        if (gID.equalsIgnoreCase(""))
        {
        } else
        {
            jDialogSearchCustomer.setVisible(false);
            setupDialogEditDetails(gID);
        }
    }//GEN-LAST:event_jButtonEditSelectedCustomerDetailsActionPerformed

    private void jButtonSearchForAvailableRoomActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonSearchForAvailableRoomActionPerformed
    {//GEN-HEADEREND:event_jButtonSearchForAvailableRoomActionPerformed
        Calendar dFrom = Calendar.getInstance();
        Calendar dTo = Calendar.getInstance();
        dFrom.set((jComboBoxBookingStartYear.getSelectedIndex()+2014), jComboBoxBookingStartMonth.getSelectedIndex(), (jComboBoxBookingStartDate.getSelectedIndex()+1));
        dTo.set((jComboBoxBookingEndYear.getSelectedIndex()+2014), jComboBoxBookingEndMonth.getSelectedIndex(), (jComboBoxBookingEndDate.getSelectedIndex()+1));
        ArrayList<String> tempRoomsList = new ArrayList<>();
        
        if(dTo.after(dFrom))
        {
            //Searches Database for all rooms of the selected roomtype.
            int srt = jComboBoxBookingRoomType.getSelectedIndex();
            if (srt == 0)
            {
                tempRoomsList = jdcbselect.getRoomsFromType("Single");
            } else if (srt == 1)
            {
                tempRoomsList = jdcbselect.getRoomsFromType("Double");
            } else if (srt == 2)
            {
                tempRoomsList = jdcbselect.getRoomsFromType("Family");
            }
            ArrayList<String> roomToBeBooked = checkRoomAvailability(tempRoomsList, dFrom, dTo);
            if (roomToBeBooked.size() < 1)
            {
                jLabelBookingRoomNotifier.setText("<html>There are no available rooms of the selected type in the specified period...</html>");
                jButtonBookingBook.setVisible(false);
            } else
            {
                jButtonBookingBook.setEnabled(true);
                jLabelBookingRoomNotifier.setText("Found room: " + roomToBeBooked.get(0));
                bookingRoomID = roomToBeBooked.get(0);
                Date df = dFrom.getTime();
                Date dt = dTo.getTime();
                bookingDateFrom = sdf.format(df);
                bookingDateTo = sdf.format(dt);
                int nights = getNumberOfNights(dFrom, dTo);
                bookingNumberNights = "" + nights;
                System.out.println(bookingNumberNights);
            }
        } else
        {
            jLabelBookingNumberNights.setText("Enter a valid start/end date...");
        }
    }//GEN-LAST:event_jButtonSearchForAvailableRoomActionPerformed

    private void jButtonExitDetailsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonExitDetailsActionPerformed
    {//GEN-HEADEREND:event_jButtonExitDetailsActionPerformed
        jDialogDetails.setVisible(false);
    }//GEN-LAST:event_jButtonExitDetailsActionPerformed

    private void jButtonChangeDetailsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonChangeDetailsActionPerformed
    {//GEN-HEADEREND:event_jButtonChangeDetailsActionPerformed
        setupDialogEditDetails(detailsGuestID);
    }//GEN-LAST:event_jButtonChangeDetailsActionPerformed

    private void jComboBoxSetupOverviewStartMonthActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxSetupOverviewStartMonthActionPerformed
    {//GEN-HEADEREND:event_jComboBoxSetupOverviewStartMonthActionPerformed
        int ocYear = jComboBoxSetupOverviewStartYear.getSelectedIndex()+2014;
        int ocMonth = jComboBoxSetupOverviewStartMonth.getSelectedIndex();
        int dim = getDaysInMonth(ocMonth, ocYear);
        String[] list = getComboBoxList(dim);
        jComboBoxSetupOverviewStartDate.setModel(new javax.swing.DefaultComboBoxModel(list));
        setupOverviewEndDate();
    }//GEN-LAST:event_jComboBoxSetupOverviewStartMonthActionPerformed

    private void jComboBoxSetupOverviewStartYearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxSetupOverviewStartYearActionPerformed
    {//GEN-HEADEREND:event_jComboBoxSetupOverviewStartYearActionPerformed
        int ocYear = jComboBoxSetupOverviewStartYear.getSelectedIndex()+2014;
        int ocMonth = jComboBoxSetupOverviewStartMonth.getSelectedIndex();
        int dim = getDaysInMonth(ocMonth, ocYear);
        String[] list = getComboBoxList(dim);
        jComboBoxSetupOverviewStartDate.setModel(new javax.swing.DefaultComboBoxModel(list));
        setupOverviewEndDate();
    }//GEN-LAST:event_jComboBoxSetupOverviewStartYearActionPerformed

    private void jButtonSetupOverviewShowRoomsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonSetupOverviewShowRoomsActionPerformed
    {//GEN-HEADEREND:event_jButtonSetupOverviewShowRoomsActionPerformed
        int ocYear = jComboBoxSetupOverviewStartYear.getSelectedIndex()+2014;
        int ocMonth = jComboBoxSetupOverviewStartMonth.getSelectedIndex();
        int ocDate = jComboBoxSetupOverviewStartDate.getSelectedIndex()+1;
        ovcStartDate.set(ocYear, ocMonth, ocDate);
        spc.setOVCdate(ovcStartDate);
        String r1 = jTextFieldRow1.getText();
        String row1 = fixRoomID(r1);
        String r2 = jTextFieldRow2.getText();
        String row2 = fixRoomID(r2);
        String r3 = jTextFieldRow3.getText();
        String row3 = fixRoomID(r3);
        String r4 = jTextFieldRow4.getText();
        String row4 = fixRoomID(r4);
        String r5 = jTextFieldRow5.getText();
        String row5 = fixRoomID(r5);
        String r6 = jTextFieldRow6.getText();
        String row6 = fixRoomID(r6);
        String r7 = jTextFieldRow7.getText();
        String row7 = fixRoomID(r7);
        String r8 = jTextFieldRow8.getText();
        String row8 = fixRoomID(r8);
        ovcShowRoomsList.clear();
        ovcListIndex = 0;
        jButtonRoomArrowUp.setEnabled(false);
        jButtonRoomArrowDown.setEnabled(false);
        fillRoomCells(row1, 1, ovcStartDate);
        fillRoomCells(row2, 2, ovcStartDate);
        fillRoomCells(row3, 3, ovcStartDate);
        fillRoomCells(row4, 4, ovcStartDate);
        fillRoomCells(row5, 5, ovcStartDate);
        fillRoomCells(row6, 6, ovcStartDate);
        fillRoomCells(row7, 7, ovcStartDate);
        fillRoomCells(row8, 8, ovcStartDate);
        jDialogSetupOverview.setVisible(false);
    }//GEN-LAST:event_jButtonSetupOverviewShowRoomsActionPerformed

    private void jButtonSetupOverviewExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonSetupOverviewExitActionPerformed
    {//GEN-HEADEREND:event_jButtonSetupOverviewExitActionPerformed
        jDialogSetupOverview.setVisible(false);
    }//GEN-LAST:event_jButtonSetupOverviewExitActionPerformed

    private void jPanelRoom1MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPanelRoom1MousePressed
    {//GEN-HEADEREND:event_jPanelRoom1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelRoom1MousePressed

    private void jPanelRoom2MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPanelRoom2MousePressed
    {//GEN-HEADEREND:event_jPanelRoom2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelRoom2MousePressed

    private void jPanelRoom3MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPanelRoom3MousePressed
    {//GEN-HEADEREND:event_jPanelRoom3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelRoom3MousePressed

    private void jPanelRoom4MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPanelRoom4MousePressed
    {//GEN-HEADEREND:event_jPanelRoom4MousePressed

    }//GEN-LAST:event_jPanelRoom4MousePressed

    private void jPanelRoom5MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPanelRoom5MousePressed
    {//GEN-HEADEREND:event_jPanelRoom5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelRoom5MousePressed

    private void jPanelRoom6MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPanelRoom6MousePressed
    {//GEN-HEADEREND:event_jPanelRoom6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelRoom6MousePressed

    private void jPanelRoom7MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPanelRoom7MousePressed
    {//GEN-HEADEREND:event_jPanelRoom7MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelRoom7MousePressed

    private void jPanelRoom8MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jPanelRoom8MousePressed
    {//GEN-HEADEREND:event_jPanelRoom8MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelRoom8MousePressed

    private void jButtonRoomArrowUpMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonRoomArrowUpMouseEntered
    {//GEN-HEADEREND:event_jButtonRoomArrowUpMouseEntered
        jButtonRoomArrowUp.setBorderPainted(true);
    }//GEN-LAST:event_jButtonRoomArrowUpMouseEntered

    private void jButtonRoomArrowUpMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonRoomArrowUpMouseExited
    {//GEN-HEADEREND:event_jButtonRoomArrowUpMouseExited
        jButtonRoomArrowUp.setBorderPainted(false);
    }//GEN-LAST:event_jButtonRoomArrowUpMouseExited

    private void jButtonRoomArrowDownMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonRoomArrowDownMouseEntered
    {//GEN-HEADEREND:event_jButtonRoomArrowDownMouseEntered
        jButtonRoomArrowDown.setBorderPainted(true);
    }//GEN-LAST:event_jButtonRoomArrowDownMouseEntered

    private void jButtonRoomArrowDownMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jButtonRoomArrowDownMouseExited
    {//GEN-HEADEREND:event_jButtonRoomArrowDownMouseExited
        jButtonRoomArrowDown.setBorderPainted(false);
    }//GEN-LAST:event_jButtonRoomArrowDownMouseExited

    private void jButtonSearchCustomerExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonSearchCustomerExitActionPerformed
    {//GEN-HEADEREND:event_jButtonSearchCustomerExitActionPerformed
        jDialogSearchCustomer.setVisible(false);
    }//GEN-LAST:event_jButtonSearchCustomerExitActionPerformed

    private void jButtonRoomSearchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonRoomSearchActionPerformed
    {//GEN-HEADEREND:event_jButtonRoomSearchActionPerformed
        //Gets the specified startDate and endDate
        Calendar sDate = Calendar.getInstance();
        Calendar eDate = Calendar.getInstance();
        sDate.set((jComboBoxSearchStartYear.getSelectedIndex()+2014), jComboBoxSearchStartMonth.getSelectedIndex(), (jComboBoxSearchStartDate.getSelectedIndex()+1));
        eDate.set((jComboBoxSearchEndYear.getSelectedIndex()+2014), jComboBoxSearchEndMonth.getSelectedIndex(), (jComboBoxSearchEndDate.getSelectedIndex()+1));
        SearchRoomSpecifiedDate.set((jComboBoxSearchStartYear.getSelectedIndex()+2014), jComboBoxSearchStartMonth.getSelectedIndex(), (jComboBoxSearchStartDate.getSelectedIndex()+1));
        ArrayList<String> roomsList = new ArrayList<>();
        ArrayList<String> roomsListResult = new ArrayList<>();
        ArrayList<RoomAvaBookConstructor> tempList = new ArrayList<>();
        writeList.clear();
        
        //Searches Database for all rooms of the selected room type
        int srt = jComboBoxSearchRoomType.getSelectedIndex();
        if (srt == 0)
        {
            //Gets a list of ALL rooms
            roomsList.addAll(jdcbselect.getRoomsFromType("Single"));
            roomsList.addAll(jdcbselect.getRoomsFromType("Double"));
            roomsList.addAll(jdcbselect.getRoomsFromType("Family"));
        } else if (srt == 1)
        {
            //Gets a list of SINGLE rooms
            roomsList = jdcbselect.getRoomsFromType("Single");
        } else if (srt == 2)
        {
            //Gets a list of DOUBLE rooms
            roomsList = jdcbselect.getRoomsFromType("Double");
        } else
        {
            //Gets a list of FAMILY rooms
            roomsList = jdcbselect.getRoomsFromType("Family");
        }
        
        //Searches for rooms after the selected parameter
        if (jRadioButtonSearchRoom0.isSelected())
        {
            //Searches for all rooms
            roomsListResult = roomsList;
            jButtonSearchRoomBookRoom.setEnabled(false);
        } else if (jRadioButtonSearchRoom1.isSelected())
        {
            //Searches and finds all rooms of specified type, that is available from specified start-date to specified end-date
            if (eDate.after(sDate))
            {
                roomsListResult = checkRoomAvailability(roomsList, sDate, eDate);
                jButtonSearchRoomBookRoom.setEnabled(true);
                bookRoomStartDate.setTime(sDate.getTime());
                bookRoomEndDate.setTime(eDate.getTime());
            }
        } else if (jRadioButtonSearchRoom2.isSelected())
        {
            //Searches Database for all rooms of selected type, that have check-in on the specified start-date.
            jButtonSearchRoomBookRoom.setEnabled(false);
            String sd = sdf.format(sDate.getTime());
            for(int i = 0; i<roomsList.size(); i++)
            {
                tempList = jdcbselect.getCheckAvaRoom(roomsList.get(i));
                for(int j = 0; j<tempList.size(); j++)
                {
                    if(tempList.get(j).getDateFrom().equals(sd));
                    {
                        roomsListResult.add(tempList.get(j).getRoomID());
                    }
                }
            }
        } else if (jRadioButtonSearchRoom3.isSelected())
        {
            //Searches Database for all rooms of selected type, that have check-out on the specified start-date.
            jButtonSearchRoomBookRoom.setEnabled(false);
            String ed = sdf.format(sDate.getTime());
            for(int i = 0; i<roomsList.size(); i++)
            {
                tempList = jdcbselect.getCheckAvaRoom(roomsList.get(i));
                for(int j = 0; j<tempList.size(); j++)
                {
                    if(tempList.get(j).getDateTo().equals(ed));
                    {
                        roomsListResult.add(tempList.get(j).getRoomID());
                    }
                }
            }
        }
        
        //Gets the corresponding RoomType of all rooms in list
        for (int j = 0; j < roomsListResult.size(); j++)
        {
            String rID = roomsListResult.get(j);
            RoomTypeIDConstructor listTemp = jdcbselect.getRoomInfoFromRoomID(rID);
            roomListInfo.add(listTemp);
        }
        
        //Copies list to defaultlist which is then printed in GUI
        for (int i = 0; i < roomListInfo.size(); i++)
        {
            String rID = roomListInfo.get(i).getRoomID();
            String rType = roomListInfo.get(i).getRoomType();
            writeList.addElement("Room  " + rID + "  -  " + rType);
        }
        if(writeList.isEmpty())
        {
            writeList.addElement("No results found...");
            jLabelSearchRoomResultNotifier.setText("");
        } else
        {
            jLabelSearchRoomResultNotifier.setText(roomListInfo.size() + " rooms found");
        }
        jListSearchRoomResult.setModel(writeList);
    }//GEN-LAST:event_jButtonRoomSearchActionPerformed

    private void jComboBoxSearchEndYearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxSearchEndYearActionPerformed
    {//GEN-HEADEREND:event_jComboBoxSearchEndYearActionPerformed
        int year = (jComboBoxSearchEndYear.getSelectedIndex()+2014);
        int month = jComboBoxSearchEndMonth.getSelectedIndex();
        int dim = getDaysInMonth(month, year);
        String[] list = getComboBoxList(dim);
        jComboBoxSearchEndDate.setModel(new javax.swing.DefaultComboBoxModel(list));
        setupSearchRoomNightsNotifier();
    }//GEN-LAST:event_jComboBoxSearchEndYearActionPerformed

    private void jComboBoxSearchEndMonthActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxSearchEndMonthActionPerformed
    {//GEN-HEADEREND:event_jComboBoxSearchEndMonthActionPerformed
        int year = (jComboBoxSearchEndYear.getSelectedIndex()+2014);
        int month = jComboBoxSearchEndMonth.getSelectedIndex();
        int dim = getDaysInMonth(month, year);
        String[] list = getComboBoxList(dim);
        jComboBoxSearchEndDate.setModel(new javax.swing.DefaultComboBoxModel(list));
        setupSearchRoomNightsNotifier();
    }//GEN-LAST:event_jComboBoxSearchEndMonthActionPerformed

    private void jComboBoxSearchStartYearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxSearchStartYearActionPerformed
    {//GEN-HEADEREND:event_jComboBoxSearchStartYearActionPerformed
        int year = (jComboBoxSearchStartYear.getSelectedIndex()+2014);
        int month = jComboBoxSearchStartMonth.getSelectedIndex();
        int dim = getDaysInMonth(month, year);
        String[] list = getComboBoxList(dim);
        jComboBoxSearchStartDate.setModel(new javax.swing.DefaultComboBoxModel(list));
        setupSearchRoomNightsNotifier();
    }//GEN-LAST:event_jComboBoxSearchStartYearActionPerformed

    private void jComboBoxSearchStartMonthActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxSearchStartMonthActionPerformed
    {//GEN-HEADEREND:event_jComboBoxSearchStartMonthActionPerformed
        int year = (jComboBoxSearchStartYear.getSelectedIndex()+2014);
        int month = jComboBoxSearchStartMonth.getSelectedIndex();
        int dim = getDaysInMonth(month, year);
        String[] list = getComboBoxList(dim);
        jComboBoxSearchStartDate.setModel(new javax.swing.DefaultComboBoxModel(list));
        setupSearchRoomNightsNotifier();
    }//GEN-LAST:event_jComboBoxSearchStartMonthActionPerformed

    private void jButtonSearchRoomExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonSearchRoomExitActionPerformed
    {//GEN-HEADEREND:event_jButtonSearchRoomExitActionPerformed
        jDialogSearchRoom.setVisible(false);
    }//GEN-LAST:event_jButtonSearchRoomExitActionPerformed

    private void jButtonSearchRoomBookRoomActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonSearchRoomBookRoomActionPerformed
    {//GEN-HEADEREND:event_jButtonSearchRoomBookRoomActionPerformed
        if (!jListSearchRoomResult.isSelectionEmpty())
        {
            int book = jListSearchRoomResult.getSelectedIndex();
            String rID = roomListInfo.get(book).getRoomID();
            jDialogSearchRoom.setVisible(false);
            setupDialogBookingWithRoom(rID, bookRoomStartDate, bookRoomEndDate);
        }
    }//GEN-LAST:event_jButtonSearchRoomBookRoomActionPerformed

    private void jButtonSearchRoomRemoveFromListActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonSearchRoomRemoveFromListActionPerformed
    {//GEN-HEADEREND:event_jButtonSearchRoomRemoveFromListActionPerformed
        if (!jListSearchRoomResult.isSelectionEmpty())
        {
            int delete = jListSearchRoomResult.getSelectedIndex();
            writeList.remove(delete);
            jListSearchRoomResult.setModel(writeList);
        }
    }//GEN-LAST:event_jButtonSearchRoomRemoveFromListActionPerformed

    private void jButtonSearchRoomShowRoomsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonSearchRoomShowRoomsActionPerformed
    {//GEN-HEADEREND:event_jButtonSearchRoomShowRoomsActionPerformed
        if (roomListInfo.size() > 0)
        {
            ovcShowRoomsList.clear();
            ovcListIndex = 8;
            for (int i = 0; i < roomListInfo.size(); i++)
            {
                String roomID = roomList.get(i).getRoomID();
                ovcShowRoomsList.add(roomID);
            }
            jDialogSearchRoom.setVisible(false);
            spc.setOVCdate(SearchRoomSpecifiedDate);
            setupOverviewList();
        }
    }//GEN-LAST:event_jButtonSearchRoomShowRoomsActionPerformed

    private void jListSearchRoomResultMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jListSearchRoomResultMousePressed
    {//GEN-HEADEREND:event_jListSearchRoomResultMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jListSearchRoomResultMousePressed

    private void jComboBoxSearchRoomTypeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxSearchRoomTypeActionPerformed
    {//GEN-HEADEREND:event_jComboBoxSearchRoomTypeActionPerformed
        int SearchRoomType = jComboBoxSearchRoomType.getSelectedIndex();
        switch (SearchRoomType)
        {
            case 0:
                jLabelSearchRoomTypePersonsNotifier.setText("");
                break;
            case 1:
                jLabelSearchRoomTypePersonsNotifier.setText("(1 person)");
                break;
            case 2:
                jLabelSearchRoomTypePersonsNotifier.setText("(2 persons)");
                break;
            case 3:
                jLabelSearchRoomTypePersonsNotifier.setText("(5 persons)");
                break;
        }
    }//GEN-LAST:event_jComboBoxSearchRoomTypeActionPerformed

    private void jLabelOC101MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC101MousePressed
    {//GEN-HEADEREND:event_jLabelOC101MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC101MousePressed

    private void jLabelOC102MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC102MousePressed
    {//GEN-HEADEREND:event_jLabelOC102MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC102MousePressed

    private void jLabelOC103MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC103MousePressed
    {//GEN-HEADEREND:event_jLabelOC103MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC103MousePressed

    private void jLabelOC104MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC104MousePressed
    {//GEN-HEADEREND:event_jLabelOC104MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC104MousePressed

    private void jLabelOC105MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC105MousePressed
    {//GEN-HEADEREND:event_jLabelOC105MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC105MousePressed

    private void jLabelOC106MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC106MousePressed
    {//GEN-HEADEREND:event_jLabelOC106MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC106MousePressed

    private void jLabelOC107MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC107MousePressed
    {//GEN-HEADEREND:event_jLabelOC107MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC107MousePressed

    private void jLabelOC108MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC108MousePressed
    {//GEN-HEADEREND:event_jLabelOC108MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC108MousePressed

    private void jLabelOC109MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC109MousePressed
    {//GEN-HEADEREND:event_jLabelOC109MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC109MousePressed

    private void jLabelOC110MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC110MousePressed
    {//GEN-HEADEREND:event_jLabelOC110MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC110MousePressed

    private void jLabelOC111MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC111MousePressed
    {//GEN-HEADEREND:event_jLabelOC111MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC111MousePressed

    private void jLabelOC112MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC112MousePressed
    {//GEN-HEADEREND:event_jLabelOC112MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC112MousePressed

    private void jLabelOC113MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC113MousePressed
    {//GEN-HEADEREND:event_jLabelOC113MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC113MousePressed

    private void jLabelOC114MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC114MousePressed
    {//GEN-HEADEREND:event_jLabelOC114MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC114MousePressed

    private void jLabelOC201MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC201MousePressed
    {//GEN-HEADEREND:event_jLabelOC201MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC201MousePressed

    private void jLabelOC202MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC202MousePressed
    {//GEN-HEADEREND:event_jLabelOC202MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC202MousePressed

    private void jLabelOC203MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC203MousePressed
    {//GEN-HEADEREND:event_jLabelOC203MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC203MousePressed

    private void jLabelOC204MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC204MousePressed
    {//GEN-HEADEREND:event_jLabelOC204MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC204MousePressed

    private void jLabelOC205MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC205MousePressed
    {//GEN-HEADEREND:event_jLabelOC205MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC205MousePressed

    private void jLabelOC206MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC206MousePressed
    {//GEN-HEADEREND:event_jLabelOC206MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC206MousePressed

    private void jLabelOC207MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC207MousePressed
    {//GEN-HEADEREND:event_jLabelOC207MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC207MousePressed

    private void jLabelOC208MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC208MousePressed
    {//GEN-HEADEREND:event_jLabelOC208MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC208MousePressed

    private void jLabelOC209MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC209MousePressed
    {//GEN-HEADEREND:event_jLabelOC209MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC209MousePressed

    private void jLabelOC210MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC210MousePressed
    {//GEN-HEADEREND:event_jLabelOC210MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC210MousePressed

    private void jLabelOC211MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC211MousePressed
    {//GEN-HEADEREND:event_jLabelOC211MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC211MousePressed

    private void jLabelOC212MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC212MousePressed
    {//GEN-HEADEREND:event_jLabelOC212MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC212MousePressed

    private void jLabelOC213MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC213MousePressed
    {//GEN-HEADEREND:event_jLabelOC213MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC213MousePressed

    private void jLabelOC214MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC214MousePressed
    {//GEN-HEADEREND:event_jLabelOC214MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC214MousePressed

    private void jLabelOC301MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC301MousePressed
    {//GEN-HEADEREND:event_jLabelOC301MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC301MousePressed

    private void jLabelOC302MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC302MousePressed
    {//GEN-HEADEREND:event_jLabelOC302MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC302MousePressed

    private void jLabelOC303MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC303MousePressed
    {//GEN-HEADEREND:event_jLabelOC303MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC303MousePressed

    private void jLabelOC304MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC304MousePressed
    {//GEN-HEADEREND:event_jLabelOC304MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC304MousePressed

    private void jLabelOC305MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC305MousePressed
    {//GEN-HEADEREND:event_jLabelOC305MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC305MousePressed

    private void jLabelOC306MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC306MousePressed
    {//GEN-HEADEREND:event_jLabelOC306MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC306MousePressed

    private void jLabelOC307MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC307MousePressed
    {//GEN-HEADEREND:event_jLabelOC307MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC307MousePressed

    private void jLabelOC308MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC308MousePressed
    {//GEN-HEADEREND:event_jLabelOC308MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC308MousePressed

    private void jLabelOC309MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC309MousePressed
    {//GEN-HEADEREND:event_jLabelOC309MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC309MousePressed

    private void jLabelOC310MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC310MousePressed
    {//GEN-HEADEREND:event_jLabelOC310MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC310MousePressed

    private void jLabelOC311MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC311MousePressed
    {//GEN-HEADEREND:event_jLabelOC311MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC311MousePressed

    private void jLabelOC312MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC312MousePressed
    {//GEN-HEADEREND:event_jLabelOC312MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC312MousePressed

    private void jLabelOC313MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC313MousePressed
    {//GEN-HEADEREND:event_jLabelOC313MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC313MousePressed

    private void jLabelOC314MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC314MousePressed
    {//GEN-HEADEREND:event_jLabelOC314MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC314MousePressed

    private void jLabelOC401MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC401MousePressed
    {//GEN-HEADEREND:event_jLabelOC401MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC401MousePressed

    private void jLabelOC402MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC402MousePressed
    {//GEN-HEADEREND:event_jLabelOC402MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC402MousePressed

    private void jLabelOC403MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC403MousePressed
    {//GEN-HEADEREND:event_jLabelOC403MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC403MousePressed

    private void jLabelOC404MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC404MousePressed
    {//GEN-HEADEREND:event_jLabelOC404MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC404MousePressed

    private void jLabelOC405MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC405MousePressed
    {//GEN-HEADEREND:event_jLabelOC405MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC405MousePressed

    private void jLabelOC406MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC406MousePressed
    {//GEN-HEADEREND:event_jLabelOC406MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC406MousePressed

    private void jLabelOC407MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC407MousePressed
    {//GEN-HEADEREND:event_jLabelOC407MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC407MousePressed

    private void jLabelOC408MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC408MousePressed
    {//GEN-HEADEREND:event_jLabelOC408MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC408MousePressed

    private void jLabelOC409MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC409MousePressed
    {//GEN-HEADEREND:event_jLabelOC409MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC409MousePressed

    private void jLabelOC410MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC410MousePressed
    {//GEN-HEADEREND:event_jLabelOC410MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC410MousePressed

    private void jLabelOC411MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC411MousePressed
    {//GEN-HEADEREND:event_jLabelOC411MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC411MousePressed

    private void jLabelOC412MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC412MousePressed
    {//GEN-HEADEREND:event_jLabelOC412MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC412MousePressed

    private void jLabelOC413MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC413MousePressed
    {//GEN-HEADEREND:event_jLabelOC413MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC413MousePressed

    private void jLabelOC414MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC414MousePressed
    {//GEN-HEADEREND:event_jLabelOC414MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC414MousePressed

    private void jLabelOC501MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC501MousePressed
    {//GEN-HEADEREND:event_jLabelOC501MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC501MousePressed

    private void jLabelOC502MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC502MousePressed
    {//GEN-HEADEREND:event_jLabelOC502MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC502MousePressed

    private void jLabelOC503MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC503MousePressed
    {//GEN-HEADEREND:event_jLabelOC503MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC503MousePressed

    private void jLabelOC504MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC504MousePressed
    {//GEN-HEADEREND:event_jLabelOC504MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC504MousePressed

    private void jLabelOC505MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC505MousePressed
    {//GEN-HEADEREND:event_jLabelOC505MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC505MousePressed

    private void jLabelOC506MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC506MousePressed
    {//GEN-HEADEREND:event_jLabelOC506MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC506MousePressed

    private void jLabelOC507MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC507MousePressed
    {//GEN-HEADEREND:event_jLabelOC507MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC507MousePressed

    private void jLabelOC508MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC508MousePressed
    {//GEN-HEADEREND:event_jLabelOC508MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC508MousePressed

    private void jLabelOC509MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC509MousePressed
    {//GEN-HEADEREND:event_jLabelOC509MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC509MousePressed

    private void jLabelOC510MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC510MousePressed
    {//GEN-HEADEREND:event_jLabelOC510MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC510MousePressed

    private void jLabelOC511MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC511MousePressed
    {//GEN-HEADEREND:event_jLabelOC511MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC511MousePressed

    private void jLabelOC512MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC512MousePressed
    {//GEN-HEADEREND:event_jLabelOC512MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC512MousePressed

    private void jLabelOC513MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC513MousePressed
    {//GEN-HEADEREND:event_jLabelOC513MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC513MousePressed

    private void jLabelOC514MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC514MousePressed
    {//GEN-HEADEREND:event_jLabelOC514MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC514MousePressed

    private void jLabelOC601MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC601MousePressed
    {//GEN-HEADEREND:event_jLabelOC601MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC601MousePressed

    private void jLabelOC602MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC602MousePressed
    {//GEN-HEADEREND:event_jLabelOC602MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC602MousePressed

    private void jLabelOC603MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC603MousePressed
    {//GEN-HEADEREND:event_jLabelOC603MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC603MousePressed

    private void jLabelOC604MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC604MousePressed
    {//GEN-HEADEREND:event_jLabelOC604MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC604MousePressed

    private void jLabelOC605MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC605MousePressed
    {//GEN-HEADEREND:event_jLabelOC605MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC605MousePressed

    private void jLabelOC606MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC606MousePressed
    {//GEN-HEADEREND:event_jLabelOC606MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC606MousePressed

    private void jLabelOC607MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC607MousePressed
    {//GEN-HEADEREND:event_jLabelOC607MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC607MousePressed

    private void jLabelOC608MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC608MousePressed
    {//GEN-HEADEREND:event_jLabelOC608MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC608MousePressed

    private void jLabelOC609MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC609MousePressed
    {//GEN-HEADEREND:event_jLabelOC609MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC609MousePressed

    private void jLabelOC610MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC610MousePressed
    {//GEN-HEADEREND:event_jLabelOC610MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC610MousePressed

    private void jLabelOC611MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC611MousePressed
    {//GEN-HEADEREND:event_jLabelOC611MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC611MousePressed

    private void jLabelOC612MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC612MousePressed
    {//GEN-HEADEREND:event_jLabelOC612MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC612MousePressed

    private void jLabelOC613MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC613MousePressed
    {//GEN-HEADEREND:event_jLabelOC613MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC613MousePressed

    private void jLabelOC614MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC614MousePressed
    {//GEN-HEADEREND:event_jLabelOC614MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC614MousePressed

    private void jLabelOC701MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC701MousePressed
    {//GEN-HEADEREND:event_jLabelOC701MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC701MousePressed

    private void jLabelOC702MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC702MousePressed
    {//GEN-HEADEREND:event_jLabelOC702MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC702MousePressed

    private void jLabelOC703MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC703MousePressed
    {//GEN-HEADEREND:event_jLabelOC703MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC703MousePressed

    private void jLabelOC704MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC704MousePressed
    {//GEN-HEADEREND:event_jLabelOC704MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC704MousePressed

    private void jLabelOC705MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC705MousePressed
    {//GEN-HEADEREND:event_jLabelOC705MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC705MousePressed

    private void jLabelOC706MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC706MousePressed
    {//GEN-HEADEREND:event_jLabelOC706MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC706MousePressed

    private void jLabelOC707MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC707MousePressed
    {//GEN-HEADEREND:event_jLabelOC707MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC707MousePressed

    private void jLabelOC708MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC708MousePressed
    {//GEN-HEADEREND:event_jLabelOC708MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC708MousePressed

    private void jLabelOC709MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC709MousePressed
    {//GEN-HEADEREND:event_jLabelOC709MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC709MousePressed

    private void jLabelOC710MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC710MousePressed
    {//GEN-HEADEREND:event_jLabelOC710MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC710MousePressed

    private void jLabelOC711MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC711MousePressed
    {//GEN-HEADEREND:event_jLabelOC711MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC711MousePressed

    private void jLabelOC712MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC712MousePressed
    {//GEN-HEADEREND:event_jLabelOC712MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC712MousePressed

    private void jLabelOC713MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC713MousePressed
    {//GEN-HEADEREND:event_jLabelOC713MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC713MousePressed

    private void jLabelOC714MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC714MousePressed
    {//GEN-HEADEREND:event_jLabelOC714MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC714MousePressed

    private void jLabelOC801MouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC801MouseReleased
    {//GEN-HEADEREND:event_jLabelOC801MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC801MouseReleased

    private void jLabelOC802MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC802MousePressed
    {//GEN-HEADEREND:event_jLabelOC802MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC802MousePressed

    private void jLabelOC803MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC803MousePressed
    {//GEN-HEADEREND:event_jLabelOC803MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC803MousePressed

    private void jLabelOC804MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC804MousePressed
    {//GEN-HEADEREND:event_jLabelOC804MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC804MousePressed

    private void jLabelOC805MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC805MousePressed
    {//GEN-HEADEREND:event_jLabelOC805MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC805MousePressed

    private void jLabelOC806MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC806MousePressed
    {//GEN-HEADEREND:event_jLabelOC806MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC806MousePressed

    private void jLabelOC807MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC807MousePressed
    {//GEN-HEADEREND:event_jLabelOC807MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC807MousePressed

    private void jLabelOC808MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC808MousePressed
    {//GEN-HEADEREND:event_jLabelOC808MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC808MousePressed

    private void jLabelOC809MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC809MousePressed
    {//GEN-HEADEREND:event_jLabelOC809MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC809MousePressed

    private void jLabelOC810MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC810MousePressed
    {//GEN-HEADEREND:event_jLabelOC810MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC810MousePressed

    private void jLabelOC811MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC811MousePressed
    {//GEN-HEADEREND:event_jLabelOC811MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC811MousePressed

    private void jLabelOC812MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC812MousePressed
    {//GEN-HEADEREND:event_jLabelOC812MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC812MousePressed

    private void jLabelOC813MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC813MousePressed
    {//GEN-HEADEREND:event_jLabelOC813MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC813MousePressed

    private void jLabelOC814MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabelOC814MousePressed
    {//GEN-HEADEREND:event_jLabelOC814MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelOC814MousePressed

    private void jButtonSearchCustomerReturnToBookingActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonSearchCustomerReturnToBookingActionPerformed
    {//GEN-HEADEREND:event_jButtonSearchCustomerReturnToBookingActionPerformed
        String gID = jLabelSearchCustomerGuestID.getText();
        String firstName = jLabelSearchCustomerFirstName.getText();
        String lastName = jLabelSearchCustomerFirstName.getText();
        String country = jLabelSearchCustomerFirstName.getText();
        String phone = jLabelSearchCustomerFirstName.getText();
        String email = jLabelSearchCustomerFirstName.getText();
        jDialogSearchCustomer.setVisible(false);
        jButtonBookingCreateID.setEnabled(false);
        jTextFieldBookingGuestID.setText(gID);
        jTextFieldBookingFirstName.setText(firstName);
        jTextFieldBookingLastName.setText(lastName);
        jTextFieldBookingCountry.setText(country);
        jTextFieldBookingPhoneNumber.setText(phone);
        jTextFieldBookingEmail.setText(email);
    }//GEN-LAST:event_jButtonSearchCustomerReturnToBookingActionPerformed

    private void jButtonBookingSearchCustomerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBookingSearchCustomerActionPerformed
    {//GEN-HEADEREND:event_jButtonBookingSearchCustomerActionPerformed
        setupDialogSearchCustomer(true);
    }//GEN-LAST:event_jButtonBookingSearchCustomerActionPerformed

    private void jComboBoxSetupOverviewStartDateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxSetupOverviewStartDateActionPerformed
    {//GEN-HEADEREND:event_jComboBoxSetupOverviewStartDateActionPerformed
        setupOverviewEndDate();
    }//GEN-LAST:event_jComboBoxSetupOverviewStartDateActionPerformed

    private void jButtonCheckInLoadActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonCheckInLoadActionPerformed
    {//GEN-HEADEREND:event_jButtonCheckInLoadActionPerformed
        Calendar specifiedDate = Calendar.getInstance();
        specifiedDate.set((jComboBoxCheckInYear.getSelectedIndex()+2014), jComboBoxCheckInMonth.getSelectedIndex(), (jComboBoxCheckInDate.getSelectedIndex()+1));
        String sd = sdf.format(specifiedDate.getTime());
        ArrayList<InfoObjectConstructor> tempList = new ArrayList<>();
        writeList.clear();
        tempList = jdcbselect.getInfoFromDateFrom(sd);
        for (int i = 0; i < tempList.size(); i++)
        {
            String rID = tempList.get(i).getRoomID();
            String gID = tempList.get(i).getGuestID();
            String fName = tempList.get(i).getGuestFirstname();
            String lName = tempList.get(i).getGuestLastName();
            String Phone = tempList.get(i).getContanctPhone();
            String Email = tempList.get(i).getEmail();
            writeList.addElement("Room " + rID + "  -  " + gID + "  -  " + lName + ", " + fName + "  -  " + Email + "  -  " + Phone);
        }
        jLabelCheckInOutNotifier.setText("Check-ins on the specified date:");
        if(writeList.isEmpty())
        {
            writeList.addElement("No results found...");
        }
        jListCheckInOut.setModel(writeList);
    }//GEN-LAST:event_jButtonCheckInLoadActionPerformed

    private void jTextFieldRow1FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTextFieldRow1FocusLost
    {//GEN-HEADEREND:event_jTextFieldRow1FocusLost
        String text = jTextFieldRow1.getText();
        jTextFieldRow1.setText(checkInputSetupOverview(text));
    }//GEN-LAST:event_jTextFieldRow1FocusLost

    private void jTextFieldRow1FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTextFieldRow1FocusGained
    {//GEN-HEADEREND:event_jTextFieldRow1FocusGained
    }//GEN-LAST:event_jTextFieldRow1FocusGained

    private void jTextFieldRow2FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTextFieldRow2FocusGained
    {//GEN-HEADEREND:event_jTextFieldRow2FocusGained
    }//GEN-LAST:event_jTextFieldRow2FocusGained

    private void jTextFieldRow2FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTextFieldRow2FocusLost
    {//GEN-HEADEREND:event_jTextFieldRow2FocusLost
        String text = jTextFieldRow2.getText();
        jTextFieldRow2.setText(checkInputSetupOverview(text));
    }//GEN-LAST:event_jTextFieldRow2FocusLost

    private void jTextFieldRow3FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTextFieldRow3FocusGained
    {//GEN-HEADEREND:event_jTextFieldRow3FocusGained
    }//GEN-LAST:event_jTextFieldRow3FocusGained

    private void jTextFieldRow3FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTextFieldRow3FocusLost
    {//GEN-HEADEREND:event_jTextFieldRow3FocusLost
        String text = jTextFieldRow3.getText();
        jTextFieldRow3.setText(checkInputSetupOverview(text));
    }//GEN-LAST:event_jTextFieldRow3FocusLost

    private void jTextFieldRow4FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTextFieldRow4FocusGained
    {//GEN-HEADEREND:event_jTextFieldRow4FocusGained
    }//GEN-LAST:event_jTextFieldRow4FocusGained

    private void jTextFieldRow4FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTextFieldRow4FocusLost
    {//GEN-HEADEREND:event_jTextFieldRow4FocusLost
        String text = jTextFieldRow4.getText();
        jTextFieldRow4.setText(checkInputSetupOverview(text));
    }//GEN-LAST:event_jTextFieldRow4FocusLost

    private void jTextFieldRow5FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTextFieldRow5FocusGained
    {//GEN-HEADEREND:event_jTextFieldRow5FocusGained
    }//GEN-LAST:event_jTextFieldRow5FocusGained

    private void jTextFieldRow5FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTextFieldRow5FocusLost
    {//GEN-HEADEREND:event_jTextFieldRow5FocusLost
        String text = jTextFieldRow5.getText();
        jTextFieldRow5.setText(checkInputSetupOverview(text));
    }//GEN-LAST:event_jTextFieldRow5FocusLost

    private void jTextFieldRow6FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTextFieldRow6FocusGained
    {//GEN-HEADEREND:event_jTextFieldRow6FocusGained
    }//GEN-LAST:event_jTextFieldRow6FocusGained

    private void jTextFieldRow6FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTextFieldRow6FocusLost
    {//GEN-HEADEREND:event_jTextFieldRow6FocusLost
        String text = jTextFieldRow6.getText();
        jTextFieldRow6.setText(checkInputSetupOverview(text));
    }//GEN-LAST:event_jTextFieldRow6FocusLost

    private void jTextFieldRow7FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTextFieldRow7FocusGained
    {//GEN-HEADEREND:event_jTextFieldRow7FocusGained
    }//GEN-LAST:event_jTextFieldRow7FocusGained

    private void jTextFieldRow7FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTextFieldRow7FocusLost
    {//GEN-HEADEREND:event_jTextFieldRow7FocusLost
        String text = jTextFieldRow7.getText();
        jTextFieldRow7.setText(checkInputSetupOverview(text));
    }//GEN-LAST:event_jTextFieldRow7FocusLost

    private void jTextFieldRow8FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTextFieldRow8FocusGained
    {//GEN-HEADEREND:event_jTextFieldRow8FocusGained
    }//GEN-LAST:event_jTextFieldRow8FocusGained

    private void jTextFieldRow8FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_jTextFieldRow8FocusLost
    {//GEN-HEADEREND:event_jTextFieldRow8FocusLost
        String text = jTextFieldRow8.getText();
        jTextFieldRow8.setText(checkInputSetupOverview(text));
    }//GEN-LAST:event_jTextFieldRow8FocusLost

    private void jButtonBookingExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBookingExitActionPerformed
    {//GEN-HEADEREND:event_jButtonBookingExitActionPerformed
        jDialogBooking.setVisible(false);
    }//GEN-LAST:event_jButtonBookingExitActionPerformed

    private void jButtonCheckInExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonCheckInExitActionPerformed
    {//GEN-HEADEREND:event_jButtonCheckInExitActionPerformed
        jDialogCheckInOut.setVisible(false);
    }//GEN-LAST:event_jButtonCheckInExitActionPerformed

    private void jTextFieldRow1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jTextFieldRow1MouseClicked
    {//GEN-HEADEREND:event_jTextFieldRow1MouseClicked
        jTextFieldRow1.setText("");
        jTextFieldRow1.setFont(fontNormal);
        jTextFieldRow1.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextFieldRow1MouseClicked

    private void jTextFieldRow2MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jTextFieldRow2MouseClicked
    {//GEN-HEADEREND:event_jTextFieldRow2MouseClicked
        jTextFieldRow2.setText("");
        jTextFieldRow2.setFont(fontNormal);
        jTextFieldRow2.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextFieldRow2MouseClicked

    private void jTextFieldRow3MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jTextFieldRow3MouseClicked
    {//GEN-HEADEREND:event_jTextFieldRow3MouseClicked
        jTextFieldRow3.setText("");
        jTextFieldRow3.setFont(fontNormal);
        jTextFieldRow3.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextFieldRow3MouseClicked

    private void jTextFieldRow4MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jTextFieldRow4MouseClicked
    {//GEN-HEADEREND:event_jTextFieldRow4MouseClicked
        jTextFieldRow4.setText("");
        jTextFieldRow4.setFont(fontNormal);
        jTextFieldRow4.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextFieldRow4MouseClicked

    private void jTextFieldRow5MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jTextFieldRow5MouseClicked
    {//GEN-HEADEREND:event_jTextFieldRow5MouseClicked
        jTextFieldRow5.setText("");
        jTextFieldRow5.setFont(fontNormal);
        jTextFieldRow5.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextFieldRow5MouseClicked

    private void jTextFieldRow6MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jTextFieldRow6MouseClicked
    {//GEN-HEADEREND:event_jTextFieldRow6MouseClicked
        jTextFieldRow6.setText("");
        jTextFieldRow6.setFont(fontNormal);
        jTextFieldRow6.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextFieldRow6MouseClicked

    private void jTextFieldRow7MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jTextFieldRow7MouseClicked
    {//GEN-HEADEREND:event_jTextFieldRow7MouseClicked
        jTextFieldRow7.setText("");
        jTextFieldRow7.setFont(fontNormal);
        jTextFieldRow7.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextFieldRow7MouseClicked

    private void jTextFieldRow8MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jTextFieldRow8MouseClicked
    {//GEN-HEADEREND:event_jTextFieldRow8MouseClicked
        jTextFieldRow8.setText("");
        jTextFieldRow8.setFont(fontNormal);
        jTextFieldRow8.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextFieldRow8MouseClicked

    private void jComboBoxBookingStartDateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxBookingStartDateActionPerformed
    {//GEN-HEADEREND:event_jComboBoxBookingStartDateActionPerformed
        setupBookingNightsNotifier();
    }//GEN-LAST:event_jComboBoxBookingStartDateActionPerformed

    private void jComboBoxBookingEndDateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxBookingEndDateActionPerformed
    {//GEN-HEADEREND:event_jComboBoxBookingEndDateActionPerformed
        setupBookingNightsNotifier();
    }//GEN-LAST:event_jComboBoxBookingEndDateActionPerformed

    private void jComboBoxSearchStartDateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxSearchStartDateActionPerformed
    {//GEN-HEADEREND:event_jComboBoxSearchStartDateActionPerformed
        setupSearchRoomNightsNotifier();
    }//GEN-LAST:event_jComboBoxSearchStartDateActionPerformed

    private void jComboBoxSearchEndDateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxSearchEndDateActionPerformed
    {//GEN-HEADEREND:event_jComboBoxSearchEndDateActionPerformed
        setupSearchRoomNightsNotifier();
    }//GEN-LAST:event_jComboBoxSearchEndDateActionPerformed

    private void jRadioButtonSearchRoom2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButtonSearchRoom2ActionPerformed
    {//GEN-HEADEREND:event_jRadioButtonSearchRoom2ActionPerformed
        jComboBoxSearchEndMonth.setEnabled(false);
        jComboBoxSearchEndDate.setEnabled(false);
        jComboBoxSearchEndYear.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonSearchRoom2ActionPerformed

    private void jRadioButtonSearchRoom3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButtonSearchRoom3ActionPerformed
    {//GEN-HEADEREND:event_jRadioButtonSearchRoom3ActionPerformed
        jComboBoxSearchEndMonth.setEnabled(false);
        jComboBoxSearchEndDate.setEnabled(false);
        jComboBoxSearchEndYear.setEnabled(false);
    }//GEN-LAST:event_jRadioButtonSearchRoom3ActionPerformed

    private void jRadioButtonSearchRoom1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButtonSearchRoom1ActionPerformed
    {//GEN-HEADEREND:event_jRadioButtonSearchRoom1ActionPerformed
        jComboBoxSearchEndMonth.setEnabled(true);
        jComboBoxSearchEndDate.setEnabled(true);
        jComboBoxSearchEndYear.setEnabled(true);
    }//GEN-LAST:event_jRadioButtonSearchRoom1ActionPerformed

    private void jRadioButtonSearchRoom0ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButtonSearchRoom0ActionPerformed
    {//GEN-HEADEREND:event_jRadioButtonSearchRoom0ActionPerformed
        jComboBoxSearchEndMonth.setEnabled(true);
        jComboBoxSearchEndDate.setEnabled(true);
        jComboBoxSearchEndYear.setEnabled(true);
    }//GEN-LAST:event_jRadioButtonSearchRoom0ActionPerformed

    private void jButtonCheckInSearchCustomerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonCheckInSearchCustomerActionPerformed
    {//GEN-HEADEREND:event_jButtonCheckInSearchCustomerActionPerformed
        jDialogCheckInOut.setVisible(false);
        setupDialogSearchCustomer(false);
    }//GEN-LAST:event_jButtonCheckInSearchCustomerActionPerformed

    private void jButtonCheckInPrintActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonCheckInPrintActionPerformed
    {//GEN-HEADEREND:event_jButtonCheckInPrintActionPerformed
        Calendar specifiedDate = Calendar.getInstance();
        specifiedDate.set((jComboBoxCheckInYear.getSelectedIndex()+2014), jComboBoxCheckInMonth.getSelectedIndex(), (jComboBoxCheckInDate.getSelectedIndex()+1));
        String sd = sdf.format(specifiedDate.getTime());
        jdcbselect.printWriter(sd);
    }//GEN-LAST:event_jButtonCheckInPrintActionPerformed

    private void jButtonCheckOutLoadActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonCheckOutLoadActionPerformed
    {//GEN-HEADEREND:event_jButtonCheckOutLoadActionPerformed
        Calendar specifiedDate = Calendar.getInstance();
        specifiedDate.set((jComboBoxCheckInYear.getSelectedIndex()+2014), jComboBoxCheckInMonth.getSelectedIndex(), (jComboBoxCheckInDate.getSelectedIndex()+1));
        String sd = sdf.format(specifiedDate.getTime());
        ArrayList<InfoObjectConstructor> tempList = new ArrayList<>();
        writeList.clear();
        tempList = jdcbselect.getInfoFromDateTo(sd);
        for (int i = 0; i < tempList.size(); i++)
        {
            String rID = tempList.get(i).getRoomID();
            String gID = tempList.get(i).getGuestID();
            String fName = tempList.get(i).getGuestFirstname();
            String lName = tempList.get(i).getGuestLastName();
            String Phone = tempList.get(i).getContanctPhone();
            String Email = tempList.get(i).getEmail();
            writeList.addElement("Room " + rID + "  -  " + gID + "  -  " + lName + ", " + fName + "  -  " + Email + "  -  " + Phone);
        }
        jLabelCheckInOutNotifier.setText("Check-outs on the specified date:");
        if(writeList.isEmpty())
        {
            writeList.addElement("No results found...");
        }
        jListCheckInOut.setModel(writeList);
    }//GEN-LAST:event_jButtonCheckOutLoadActionPerformed

    private void jButtonDetailsSaveChangesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonDetailsSaveChangesActionPerformed
    {//GEN-HEADEREND:event_jButtonDetailsSaveChangesActionPerformed
        String newFN = jTextFieldEditFirstNameNew.getText();
        String newLN = jTextFieldEditLastNameNew.getText();
        String newC = jTextFieldEditCountryNew.getText();
        String newP = jTextFieldEditPhoneNew.getText();
        String newE = jTextFieldEditEmailNew.getText();
        String guestID = jLabelEditGuestIDOriginal.getText();
        if(newFN.equals(""))
        {
            newFN = jLabelEditFirstNameOriginal.getText();
        }
        if(newLN.equals(""))
        {
            newLN = jLabelEditFirstNameOriginal.getText();
        }
        if(newC.equals(""))
        {
            newC = jLabelEditFirstNameOriginal.getText();
        }
        if(newP.equals(""))
        {
            newP = jLabelEditFirstNameOriginal.getText();
        }
        if(newE.equals(""))
        {
            newE = jLabelEditFirstNameOriginal.getText();
        }
        try
        {
            jdcbUpdate.updateGuest(guestID, newFN, newLN, newC, newP, newE);
        } catch (SQLException ex)
        {
            Logger.getLogger(CasablancaGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonDetailsSaveChangesActionPerformed

    private void jButtonDetailsShowBookingActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonDetailsShowBookingActionPerformed
    {//GEN-HEADEREND:event_jButtonDetailsShowBookingActionPerformed
        Calendar df = Calendar.getInstance();
        Calendar dt = Calendar.getInstance();
        if (jListDetailsFutureBookings.isSelectionEmpty())
        {
            deleteBookingRoomID = "";
            deleteBookingGuestID = "";
            deleteBookingStartDate = "";
            deleteBookingEndDate = "";
        } else
        {
            int bookingIndex = jListDetailsFutureBookings.getSelectedIndex();
            String rID = guestList.get(bookingIndex).getRoomID();
            String dFrom = guestList.get(bookingIndex).getDateFrom();
            String dTo = guestList.get(bookingIndex).getDateTo();
            RoomTypeIDConstructor bList = jdcbselect.getRoomInfoFromRoomID(rID);
            String rType = bList.getRoomType();
            try
            {
                df.setTime(sdf.parse(dFrom));
                dt.setTime(sdf.parse(dTo));
            } catch (ParseException ex)
            {
                Logger.getLogger(CasablancaGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            String dateFrom = sdfMonthName.format(df.getTime()) + " " + sdfDateInt.format(df.getTime()) + ". - " + sdfYearLong.format(df.getTime());
            String dateTo = sdfMonthName.format(dt.getTime()) + " " + sdfDateInt.format(dt.getTime()) + ". - " + sdfYearLong.format(dt.getTime());
            jLabelDetailsRoomID.setText(rID);
            jLabelDetailsRoomType.setText(rType);
            jLabelDetailsDateFrom.setText(dateFrom);
            jLabelDetailsDateTo.setText(dateTo);
            deleteBookingRoomID = rID;
            deleteBookingGuestID = guestList.get(bookingIndex).getGuestID();
            deleteBookingStartDate = dFrom;
            deleteBookingEndDate = dTo;
        }
    }//GEN-LAST:event_jButtonDetailsShowBookingActionPerformed

    private void jButtonDetailsExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonDetailsExitActionPerformed
    {//GEN-HEADEREND:event_jButtonDetailsExitActionPerformed
        jDialogEditDetails.setVisible(false);
    }//GEN-LAST:event_jButtonDetailsExitActionPerformed

    private void jButtonDetailsChangeBookingActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonDetailsChangeBookingActionPerformed
    {//GEN-HEADEREND:event_jButtonDetailsChangeBookingActionPerformed
        if(deleteBookingRoomID.equals("") || deleteBookingGuestID.equals("") || deleteBookingStartDate.equals(""))
        {
        } else
        {
            jLabelRequestDeleteBooking.setText("<html>To change this booking, the booking will be deleted and the Booking-window will open in order for you change roomtype aswell as the bookings start- or end dates.</html>");
            jDialogRequestDeleteBooking.setVisible(true);
        }
    }//GEN-LAST:event_jButtonDetailsChangeBookingActionPerformed

    private void jButtonRequestContinueActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonRequestContinueActionPerformed
    {//GEN-HEADEREND:event_jButtonRequestContinueActionPerformed
        jdcbdelete.JDBCDeleteRoomBooking(deleteBookingGuestID, deleteBookingRoomID, deleteBookingStartDate);
        Calendar dFrom = Calendar.getInstance();
        Calendar dTo = Calendar.getInstance();
        try
        {
            dFrom.setTime(sdf.parse(deleteBookingStartDate));
            dTo.setTime(sdf.parse(deleteBookingEndDate));
        } catch (ParseException ex)
        {
            Logger.getLogger(CasablancaGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDialogRequestDeleteBooking.setVisible(false);
        jDialogEditDetails.setVisible(false);
        jDialogBooking.setVisible(true);
        jButtonBookingCreateID.setEnabled(false);
        jButtonBookingSearchCustomer.setEnabled(false);
        RoomTypeIDConstructor roomInfo = jdcbselect.getRoomInfoFromRoomID(deleteBookingRoomID);
        String rType = roomInfo.getRoomType();
        switch (rType)
        {
            case "Single":
                jComboBoxBookingRoomType.setSelectedIndex(0);
                break;
            case "Double":
                jComboBoxBookingRoomType.setSelectedIndex(1);
                break;
            case "Family":
                jComboBoxBookingRoomType.setSelectedIndex(2);
                break;
        }
        DateVar df = getDateSettings(dFrom);
        DateVar dt = getDateSettings(dTo);
        jComboBoxBookingStartMonth.setSelectedIndex(df.getMonth());
        jComboBoxBookingStartYear.setSelectedIndex(df.getYear());
        jComboBoxBookingStartDate.setSelectedIndex(df.getDate());
        jComboBoxBookingEndMonth.setSelectedIndex(dt.getMonth());
        jComboBoxBookingEndYear.setSelectedIndex(dt.getYear());
        jComboBoxBookingEndDate.setSelectedIndex(dt.getDate());
        jButtonBookingCreateID.setEnabled(true);
        jLabelBookingRoomNotifier.setText("Room: " + deleteBookingRoomID);
        jButtonBookingBook.setEnabled(false);
    }//GEN-LAST:event_jButtonRequestContinueActionPerformed

    private void jButtonRequestCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonRequestCancelActionPerformed
    {//GEN-HEADEREND:event_jButtonRequestCancelActionPerformed
        jDialogRequestDeleteBooking.setVisible(false);
    }//GEN-LAST:event_jButtonRequestCancelActionPerformed
    
    //Finds the date of today and sets an int for date, month and year respectively.
    private void setCurrentDate()
    {
        cal = Calendar.getInstance();
        currentDate = Integer.parseInt(sdfDateInt.format(cal.getTime()));
        currentMonth = Integer.parseInt(sdfMonthInt.format(cal.getTime()));
        currentYear = Integer.parseInt(sdfYearshort.format(cal.getTime()));
        String currentMonthName = sdfMonthName.format(cal.getTime());
        String currentWeekdayName = sdfWeekDayName.format(cal.getTime());
        int currentYearLong = Integer.parseInt(sdfYearLong.format(cal.getTime()));
        String showDate = (currentWeekdayName + ",  " + currentDate + ".  " + currentMonthName + "  -  " + currentYearLong);
        jLabelMainShowDate.setText(showDate);
    }
    
    //Search Calender for how many days the specified month contains, and returns the amount of days.
    private int getDaysInMonth(int month, int year)
    {
        cal.set(year, month, 1);
        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        return daysInMonth;
    }
    
    //Counts and returns the number of days between the given dates. Returns 0 if start-date does not come before end-date.
    private int getNumberOfNights(Calendar dFrom, Calendar dTo)
    {
        int daysBetween = 0;
        while (dFrom.before(dTo))
        {
            dFrom.add(Calendar.DAY_OF_MONTH, 1);
            daysBetween++;
        }
        return daysBetween;
    }
    
    //Converts a date into int's for day, month and year and returns them as an object
    private DateVar getDateSettings(Calendar dateIn)
    {
        SimpleDateFormat getD = new SimpleDateFormat("d");
        SimpleDateFormat getM = new SimpleDateFormat("M");
        SimpleDateFormat getY = new SimpleDateFormat("yy");
        int dayOut = (Integer.parseInt(getD.format(dateIn.getTime()))-1);
        int monthOut = (Integer.parseInt(getM.format(dateIn.getTime()))-1);
        int yearOut = (Integer.parseInt(getY.format(dateIn.getTime()))-14);
        DateVar dateOut = new DateVar(yearOut, monthOut, dayOut);
        return dateOut;
    }
    
    //Gets a list of rooms and checks the availability of each room one by one, using the "checkRoom" method.
    private ArrayList<String> checkRoomAvailability(ArrayList<String> listOfRooms, Calendar sDate, Calendar eDate)
    {
        int a = 0;
        while(a<listOfRooms.size())
        {
            String rID = listOfRooms.get(a);
            if(checkRoom(rID, sDate, eDate)==true)
            {
                a++;
            } else
            {
                listOfRooms.remove(a);
            }
        }
        if(listOfRooms.size()>0)
        {
            return listOfRooms;
        } else
        {
            return null;
        }
    }
    
    //Checks if a given room is free or occupied between the given dates and returns the answer.
    private boolean checkRoom(String rID, Calendar sDate, Calendar eDate)
    {
        ArrayList<RoomAvaBookConstructor> tempRoomBookings = jdcbselect.getCheckAvaRoom(rID);
        for (int a = 0; a < tempRoomBookings.size(); a++)
        {
            Calendar sBookDate = Calendar.getInstance();
            Calendar eBookDate = Calendar.getInstance();
            try
            {
                sBookDate.setTime(sdf.parse(tempRoomBookings.get(a).getDateFrom()));
                eBookDate.setTime(sdf.parse(tempRoomBookings.get(a).getDateTo()));
            } catch (ParseException ex)
            {
                Logger.getLogger(CasablancaGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (eBookDate.after(sDate))
            {
                if (sBookDate.before(eDate))
                {
                    return false;
                }
            }
        }
        return true;
    }
    
    //Returns the list that corresponds with the number of days in a given month
    private String[] getComboBoxList(int daysInMonth)
    {
        switch (daysInMonth)
        {
            case 28:
                return list28days;
            case 29:
                return list29days;
            case 30:
                return list30days;
            default:
                return list31days;
        }
    }
    
    //Finds the status of a specified room on a specified date and returns the corresponding ImageIcon
    private ImageIcon findRoomStatus(Calendar frsDate, ArrayList<RoomAvaBookConstructor> frsList)
    {
        Date frsD = frsDate.getTime();
        String frsDateString = sdf.format(frsD);
        Calendar sBookDate = Calendar.getInstance();
        Calendar eBookDate = Calendar.getInstance();
        for(int a = 0; a<frsList.size(); a++)
        {
            if(frsDateString.equals(frsList.get(a).getDateTo()))
            {
                for(int b = 0; b < frsList.size(); b++)
                {
                    if(frsDateString.equals(frsList.get(b).getDateFrom()))
                    {
                        return IconBookBook;
                    }
                }
                return IconBookFree;
            }
            if(frsDateString.equals(frsList.get(a).getDateFrom()))
            {
                for(int b = 0; b < frsList.size(); b++)
                {
                    if(frsDateString.equals(frsList.get(b).getDateTo()))
                    {
                        return IconBookBook;
                    }
                }
                return IconFreeBook;
            }
            try
            {
                sBookDate.setTime(sdf.parse(frsList.get(a).getDateFrom()));
                eBookDate.setTime(sdf.parse(frsList.get(a).getDateTo()));
            } catch (ParseException ex)
            {
                Logger.getLogger(CasablancaGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(sBookDate.before(frsDate))
            {
                if(eBookDate.after(frsDate))
                {
                    return IconBook;
                }
            }
        }
        return IconFree;
    }
    
    private String fixRoomID(String roomID)
    {
        if(roomID.length()==0)
        {
            return "000";
        } else if(roomID.length()==1)
        {
            String ret = "00" + roomID;
            return ret;
        } else if(roomID.length()==2)
        {
            String ret = "0" + roomID;
            return ret;
        } else
        {
            return roomID;
        }
    }
    
    private String checkInputSetupOverview(String text)
    {
        int textValue = 0;
        try
        {
            textValue = Integer.parseInt(text);
        } catch (NumberFormatException numberFormatException)
        {
            return "";
        }
        if(textValue <= 0)
        {
            if(text.length() > 0)
            {
                return "1";
            } else
            {
                return "";
            } 
        }
        if(textValue > 104)
        {
            return "104";
        }
        return "" + textValue;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Windows Classic".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(CasablancaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(CasablancaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(CasablancaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(CasablancaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new CasablancaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupSearchRoomChoice;
    private javax.swing.JButton jButtonBooking;
    private javax.swing.JButton jButtonBookingBook;
    private javax.swing.JButton jButtonBookingCreateID;
    private javax.swing.JButton jButtonBookingExit;
    private javax.swing.JButton jButtonBookingSearchCustomer;
    private javax.swing.JButton jButtonChangeDetails;
    private javax.swing.JButton jButtonCheckIn;
    private javax.swing.JButton jButtonCheckInExit;
    private javax.swing.JButton jButtonCheckInLoad;
    private javax.swing.JButton jButtonCheckInPrint;
    private javax.swing.JButton jButtonCheckInSearchCustomer;
    private javax.swing.JButton jButtonCheckOutLoad;
    private javax.swing.JButton jButtonDetailsChangeBooking;
    private javax.swing.JButton jButtonDetailsExit;
    private javax.swing.JButton jButtonDetailsSaveChanges;
    private javax.swing.JButton jButtonDetailsShowBooking;
    private javax.swing.JButton jButtonEditSelectedCustomerDetails;
    private javax.swing.JButton jButtonExitDetails;
    private javax.swing.JButton jButtonNext14Days;
    private javax.swing.JButton jButtonNext7Days;
    private javax.swing.JButton jButtonPrevious14Days;
    private javax.swing.JButton jButtonPrevious7Days;
    private javax.swing.JButton jButtonRequestCancel;
    private javax.swing.JButton jButtonRequestContinue;
    private javax.swing.JButton jButtonResetOveriew;
    private javax.swing.JButton jButtonRoomArrowDown;
    private javax.swing.JButton jButtonRoomArrowUp;
    private javax.swing.JButton jButtonRoomSearch;
    private javax.swing.JButton jButtonSearchCustomer;
    private javax.swing.JButton jButtonSearchCustomerDetails;
    private javax.swing.JButton jButtonSearchCustomerExit;
    private javax.swing.JButton jButtonSearchCustomerReturnToBooking;
    private javax.swing.JButton jButtonSearchForAvailableRoom;
    private javax.swing.JButton jButtonSearchRoom;
    private javax.swing.JButton jButtonSearchRoomBookRoom;
    private javax.swing.JButton jButtonSearchRoomExit;
    private javax.swing.JButton jButtonSearchRoomRemoveFromList;
    private javax.swing.JButton jButtonSearchRoomShowRooms;
    private javax.swing.JButton jButtonSetupOverview;
    private javax.swing.JButton jButtonSetupOverviewExit;
    private javax.swing.JButton jButtonSetupOverviewShowRooms;
    private javax.swing.JButton jButtonShowSelectedCustomerDetails;
    private javax.swing.JComboBox jComboBoxBookingEndDate;
    private javax.swing.JComboBox jComboBoxBookingEndMonth;
    private javax.swing.JComboBox jComboBoxBookingEndYear;
    private javax.swing.JComboBox jComboBoxBookingRoomType;
    private javax.swing.JComboBox jComboBoxBookingStartDate;
    private javax.swing.JComboBox jComboBoxBookingStartMonth;
    private javax.swing.JComboBox jComboBoxBookingStartYear;
    private javax.swing.JComboBox jComboBoxCheckInDate;
    private javax.swing.JComboBox jComboBoxCheckInMonth;
    private javax.swing.JComboBox jComboBoxCheckInYear;
    private javax.swing.JComboBox jComboBoxSearchEndDate;
    private javax.swing.JComboBox jComboBoxSearchEndMonth;
    private javax.swing.JComboBox jComboBoxSearchEndYear;
    private javax.swing.JComboBox jComboBoxSearchRoomType;
    private javax.swing.JComboBox jComboBoxSearchStartDate;
    private javax.swing.JComboBox jComboBoxSearchStartMonth;
    private javax.swing.JComboBox jComboBoxSearchStartYear;
    private javax.swing.JComboBox jComboBoxSetupOverviewStartDate;
    private javax.swing.JComboBox jComboBoxSetupOverviewStartMonth;
    private javax.swing.JComboBox jComboBoxSetupOverviewStartYear;
    private javax.swing.JDialog jDialogBooking;
    private javax.swing.JDialog jDialogCheckInOut;
    private javax.swing.JDialog jDialogDetails;
    private javax.swing.JDialog jDialogEditDetails;
    private javax.swing.JDialog jDialogRequestDeleteBooking;
    private javax.swing.JDialog jDialogSearchCustomer;
    private javax.swing.JDialog jDialogSearchRoom;
    private javax.swing.JDialog jDialogSetupOverview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabelBookingNoChange1;
    private javax.swing.JLabel jLabelBookingNoChange2;
    private javax.swing.JLabel jLabelBookingNoChange3;
    private javax.swing.JLabel jLabelBookingNoChange4;
    private javax.swing.JLabel jLabelBookingNoChange5;
    private javax.swing.JLabel jLabelBookingNoChange6;
    private javax.swing.JLabel jLabelBookingNoChange7;
    private javax.swing.JLabel jLabelBookingNoChange8;
    private javax.swing.JLabel jLabelBookingNoChange9;
    private javax.swing.JLabel jLabelBookingNumberNights;
    private javax.swing.JLabel jLabelBookingRoomNotifier;
    private javax.swing.JLabel jLabelBookingRoomTypePersonsNotifier;
    private javax.swing.JLabel jLabelCheckInNoChange2;
    private javax.swing.JLabel jLabelCheckInOutNotifier;
    private javax.swing.JLabel jLabelDate01;
    private javax.swing.JLabel jLabelDate01Day;
    private javax.swing.JLabel jLabelDate01Year;
    private javax.swing.JLabel jLabelDate02;
    private javax.swing.JLabel jLabelDate02Day;
    private javax.swing.JLabel jLabelDate02Year;
    private javax.swing.JLabel jLabelDate03;
    private javax.swing.JLabel jLabelDate03Day;
    private javax.swing.JLabel jLabelDate03Year;
    private javax.swing.JLabel jLabelDate04;
    private javax.swing.JLabel jLabelDate04Day;
    private javax.swing.JLabel jLabelDate04Year;
    private javax.swing.JLabel jLabelDate05;
    private javax.swing.JLabel jLabelDate05Day;
    private javax.swing.JLabel jLabelDate05Year;
    private javax.swing.JLabel jLabelDate06;
    private javax.swing.JLabel jLabelDate06Day;
    private javax.swing.JLabel jLabelDate06Year;
    private javax.swing.JLabel jLabelDate07;
    private javax.swing.JLabel jLabelDate07Day;
    private javax.swing.JLabel jLabelDate07Year;
    private javax.swing.JLabel jLabelDate08;
    private javax.swing.JLabel jLabelDate08Day;
    private javax.swing.JLabel jLabelDate08Year;
    private javax.swing.JLabel jLabelDate09;
    private javax.swing.JLabel jLabelDate09Day;
    private javax.swing.JLabel jLabelDate09Year;
    private javax.swing.JLabel jLabelDate10;
    private javax.swing.JLabel jLabelDate10Day;
    private javax.swing.JLabel jLabelDate10Year;
    private javax.swing.JLabel jLabelDate11;
    private javax.swing.JLabel jLabelDate11Day;
    private javax.swing.JLabel jLabelDate11Year;
    private javax.swing.JLabel jLabelDate12;
    private javax.swing.JLabel jLabelDate12Day;
    private javax.swing.JLabel jLabelDate12Year;
    private javax.swing.JLabel jLabelDate13;
    private javax.swing.JLabel jLabelDate13Day;
    private javax.swing.JLabel jLabelDate13Year;
    private javax.swing.JLabel jLabelDate14;
    private javax.swing.JLabel jLabelDate14Day;
    private javax.swing.JLabel jLabelDate14Year;
    private javax.swing.JLabel jLabelDetailsBookingDate;
    private javax.swing.JLabel jLabelDetailsCountry;
    private javax.swing.JLabel jLabelDetailsDateFrom;
    private javax.swing.JLabel jLabelDetailsDateTo;
    private javax.swing.JLabel jLabelDetailsEmail;
    private javax.swing.JLabel jLabelDetailsEndDate;
    private javax.swing.JLabel jLabelDetailsFirstName;
    private javax.swing.JLabel jLabelDetailsGuestID;
    private javax.swing.JLabel jLabelDetailsLastName;
    private javax.swing.JLabel jLabelDetailsPhone;
    private javax.swing.JLabel jLabelDetailsResultNotifier;
    private javax.swing.JLabel jLabelDetailsRoomID;
    private javax.swing.JLabel jLabelDetailsRoomID1;
    private javax.swing.JLabel jLabelDetailsRoomType;
    private javax.swing.JLabel jLabelDetailsRoomType1;
    private javax.swing.JLabel jLabelDetailsStartDate;
    private javax.swing.JLabel jLabelEditCountryOriginal;
    private javax.swing.JLabel jLabelEditDetailsNoChange1;
    private javax.swing.JLabel jLabelEditDetailsNoChange10;
    private javax.swing.JLabel jLabelEditDetailsNoChange14;
    private javax.swing.JLabel jLabelEditDetailsNoChange15;
    private javax.swing.JLabel jLabelEditDetailsNoChange16;
    private javax.swing.JLabel jLabelEditDetailsNoChange17;
    private javax.swing.JLabel jLabelEditDetailsNoChange18;
    private javax.swing.JLabel jLabelEditDetailsNoChange19;
    private javax.swing.JLabel jLabelEditDetailsNoChange2;
    private javax.swing.JLabel jLabelEditDetailsNoChange23;
    private javax.swing.JLabel jLabelEditDetailsNoChange24;
    private javax.swing.JLabel jLabelEditDetailsNoChange25;
    private javax.swing.JLabel jLabelEditDetailsNoChange26;
    private javax.swing.JLabel jLabelEditDetailsNoChange3;
    private javax.swing.JLabel jLabelEditDetailsNoChange4;
    private javax.swing.JLabel jLabelEditDetailsNoChange5;
    private javax.swing.JLabel jLabelEditDetailsNoChange6;
    private javax.swing.JLabel jLabelEditDetailsNoChange7;
    private javax.swing.JLabel jLabelEditDetailsNoChange8;
    private javax.swing.JLabel jLabelEditDetailsNoChange9;
    private javax.swing.JLabel jLabelEditEmailOriginal;
    private javax.swing.JLabel jLabelEditFirstNameOriginal;
    private javax.swing.JLabel jLabelEditGuestIDOriginal;
    private javax.swing.JLabel jLabelEditLastNameOriginal;
    private javax.swing.JLabel jLabelEditPhoneOriginal;
    private javax.swing.JLabel jLabelMainShowDate;
    private javax.swing.JLabel jLabelNoChange10;
    private javax.swing.JLabel jLabelNoChange11;
    private javax.swing.JLabel jLabelNoChange12;
    private javax.swing.JLabel jLabelOC101;
    private javax.swing.JLabel jLabelOC102;
    private javax.swing.JLabel jLabelOC103;
    private javax.swing.JLabel jLabelOC104;
    private javax.swing.JLabel jLabelOC105;
    private javax.swing.JLabel jLabelOC106;
    private javax.swing.JLabel jLabelOC107;
    private javax.swing.JLabel jLabelOC108;
    private javax.swing.JLabel jLabelOC109;
    private javax.swing.JLabel jLabelOC110;
    private javax.swing.JLabel jLabelOC111;
    private javax.swing.JLabel jLabelOC112;
    private javax.swing.JLabel jLabelOC113;
    private javax.swing.JLabel jLabelOC114;
    private javax.swing.JLabel jLabelOC201;
    private javax.swing.JLabel jLabelOC202;
    private javax.swing.JLabel jLabelOC203;
    private javax.swing.JLabel jLabelOC204;
    private javax.swing.JLabel jLabelOC205;
    private javax.swing.JLabel jLabelOC206;
    private javax.swing.JLabel jLabelOC207;
    private javax.swing.JLabel jLabelOC208;
    private javax.swing.JLabel jLabelOC209;
    private javax.swing.JLabel jLabelOC210;
    private javax.swing.JLabel jLabelOC211;
    private javax.swing.JLabel jLabelOC212;
    private javax.swing.JLabel jLabelOC213;
    private javax.swing.JLabel jLabelOC214;
    private javax.swing.JLabel jLabelOC301;
    private javax.swing.JLabel jLabelOC302;
    private javax.swing.JLabel jLabelOC303;
    private javax.swing.JLabel jLabelOC304;
    private javax.swing.JLabel jLabelOC305;
    private javax.swing.JLabel jLabelOC306;
    private javax.swing.JLabel jLabelOC307;
    private javax.swing.JLabel jLabelOC308;
    private javax.swing.JLabel jLabelOC309;
    private javax.swing.JLabel jLabelOC310;
    private javax.swing.JLabel jLabelOC311;
    private javax.swing.JLabel jLabelOC312;
    private javax.swing.JLabel jLabelOC313;
    private javax.swing.JLabel jLabelOC314;
    private javax.swing.JLabel jLabelOC401;
    private javax.swing.JLabel jLabelOC402;
    private javax.swing.JLabel jLabelOC403;
    private javax.swing.JLabel jLabelOC404;
    private javax.swing.JLabel jLabelOC405;
    private javax.swing.JLabel jLabelOC406;
    private javax.swing.JLabel jLabelOC407;
    private javax.swing.JLabel jLabelOC408;
    private javax.swing.JLabel jLabelOC409;
    private javax.swing.JLabel jLabelOC410;
    private javax.swing.JLabel jLabelOC411;
    private javax.swing.JLabel jLabelOC412;
    private javax.swing.JLabel jLabelOC413;
    private javax.swing.JLabel jLabelOC414;
    private javax.swing.JLabel jLabelOC501;
    private javax.swing.JLabel jLabelOC502;
    private javax.swing.JLabel jLabelOC503;
    private javax.swing.JLabel jLabelOC504;
    private javax.swing.JLabel jLabelOC505;
    private javax.swing.JLabel jLabelOC506;
    private javax.swing.JLabel jLabelOC507;
    private javax.swing.JLabel jLabelOC508;
    private javax.swing.JLabel jLabelOC509;
    private javax.swing.JLabel jLabelOC510;
    private javax.swing.JLabel jLabelOC511;
    private javax.swing.JLabel jLabelOC512;
    private javax.swing.JLabel jLabelOC513;
    private javax.swing.JLabel jLabelOC514;
    private javax.swing.JLabel jLabelOC601;
    private javax.swing.JLabel jLabelOC602;
    private javax.swing.JLabel jLabelOC603;
    private javax.swing.JLabel jLabelOC604;
    private javax.swing.JLabel jLabelOC605;
    private javax.swing.JLabel jLabelOC606;
    private javax.swing.JLabel jLabelOC607;
    private javax.swing.JLabel jLabelOC608;
    private javax.swing.JLabel jLabelOC609;
    private javax.swing.JLabel jLabelOC610;
    private javax.swing.JLabel jLabelOC611;
    private javax.swing.JLabel jLabelOC612;
    private javax.swing.JLabel jLabelOC613;
    private javax.swing.JLabel jLabelOC614;
    private javax.swing.JLabel jLabelOC701;
    private javax.swing.JLabel jLabelOC702;
    private javax.swing.JLabel jLabelOC703;
    private javax.swing.JLabel jLabelOC704;
    private javax.swing.JLabel jLabelOC705;
    private javax.swing.JLabel jLabelOC706;
    private javax.swing.JLabel jLabelOC707;
    private javax.swing.JLabel jLabelOC708;
    private javax.swing.JLabel jLabelOC709;
    private javax.swing.JLabel jLabelOC710;
    private javax.swing.JLabel jLabelOC711;
    private javax.swing.JLabel jLabelOC712;
    private javax.swing.JLabel jLabelOC713;
    private javax.swing.JLabel jLabelOC714;
    private javax.swing.JLabel jLabelOC801;
    private javax.swing.JLabel jLabelOC802;
    private javax.swing.JLabel jLabelOC803;
    private javax.swing.JLabel jLabelOC804;
    private javax.swing.JLabel jLabelOC805;
    private javax.swing.JLabel jLabelOC806;
    private javax.swing.JLabel jLabelOC807;
    private javax.swing.JLabel jLabelOC808;
    private javax.swing.JLabel jLabelOC809;
    private javax.swing.JLabel jLabelOC810;
    private javax.swing.JLabel jLabelOC811;
    private javax.swing.JLabel jLabelOC812;
    private javax.swing.JLabel jLabelOC813;
    private javax.swing.JLabel jLabelOC814;
    private javax.swing.JLabel jLabelOverviewInfoMessage;
    private javax.swing.JLabel jLabelRequestDeleteBooking;
    private javax.swing.JLabel jLabelRoom1RoomID;
    private javax.swing.JLabel jLabelRoom1RoomType;
    private javax.swing.JLabel jLabelRoom2RoomID;
    private javax.swing.JLabel jLabelRoom2RoomType;
    private javax.swing.JLabel jLabelRoom3RoomID;
    private javax.swing.JLabel jLabelRoom3RoomType;
    private javax.swing.JLabel jLabelRoom4RoomID;
    private javax.swing.JLabel jLabelRoom4RoomType;
    private javax.swing.JLabel jLabelRoom5RoomID;
    private javax.swing.JLabel jLabelRoom5RoomType;
    private javax.swing.JLabel jLabelRoom6RoomID;
    private javax.swing.JLabel jLabelRoom6RoomType;
    private javax.swing.JLabel jLabelRoom7RoomID;
    private javax.swing.JLabel jLabelRoom7RoomType;
    private javax.swing.JLabel jLabelRoom8RoomID;
    private javax.swing.JLabel jLabelRoom8RoomType;
    private javax.swing.JLabel jLabelSearchCustomerCountry;
    private javax.swing.JLabel jLabelSearchCustomerEmail;
    private javax.swing.JLabel jLabelSearchCustomerFirstName;
    private javax.swing.JLabel jLabelSearchCustomerGuestID;
    private javax.swing.JLabel jLabelSearchCustomerLastName;
    private javax.swing.JLabel jLabelSearchCustomerNoChange1;
    private javax.swing.JLabel jLabelSearchCustomerNoChange10;
    private javax.swing.JLabel jLabelSearchCustomerNoChange11;
    private javax.swing.JLabel jLabelSearchCustomerNoChange12;
    private javax.swing.JLabel jLabelSearchCustomerNoChange13;
    private javax.swing.JLabel jLabelSearchCustomerNoChange15;
    private javax.swing.JLabel jLabelSearchCustomerNoChange16;
    private javax.swing.JLabel jLabelSearchCustomerNoChange17;
    private javax.swing.JLabel jLabelSearchCustomerNoChange2;
    private javax.swing.JLabel jLabelSearchCustomerNoChange3;
    private javax.swing.JLabel jLabelSearchCustomerNoChange4;
    private javax.swing.JLabel jLabelSearchCustomerNoChange5;
    private javax.swing.JLabel jLabelSearchCustomerNoChange6;
    private javax.swing.JLabel jLabelSearchCustomerNoChange8;
    private javax.swing.JLabel jLabelSearchCustomerNoChange9;
    private javax.swing.JLabel jLabelSearchCustomerPhone;
    private javax.swing.JLabel jLabelSearchNoChange2;
    private javax.swing.JLabel jLabelSearchNoChange4;
    private javax.swing.JLabel jLabelSearchRoomNoChange1;
    private javax.swing.JLabel jLabelSearchRoomNumberNights;
    private javax.swing.JLabel jLabelSearchRoomResultNotifier;
    private javax.swing.JLabel jLabelSearchRoomTypePersonsNotifier;
    private javax.swing.JLabel jLabelSetupOverviewNoChange1;
    private javax.swing.JLabel jLabelSetupOverviewNoChange10;
    private javax.swing.JLabel jLabelSetupOverviewNoChange12;
    private javax.swing.JLabel jLabelSetupOverviewNoChange13;
    private javax.swing.JLabel jLabelSetupOverviewNoChange2;
    private javax.swing.JLabel jLabelSetupOverviewNoChange3;
    private javax.swing.JLabel jLabelSetupOverviewNoChange4;
    private javax.swing.JLabel jLabelSetupOverviewNoChange5;
    private javax.swing.JLabel jLabelSetupOverviewNoChange6;
    private javax.swing.JLabel jLabelSetupOverviewNoChange7;
    private javax.swing.JLabel jLabelSetupOverviewNoChange8;
    private javax.swing.JLabel jLabelSetupOverviewNoChange9;
    private javax.swing.JList jListCheckInOut;
    private javax.swing.JList jListDetailsFutureBookings;
    private javax.swing.JList jListSearchCustomerBookingsHistory;
    private javax.swing.JList jListSearchCustomerResult;
    private javax.swing.JList jListSearchRoomResult;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelCheckInButtons;
    private javax.swing.JPanel jPanelCheckInList;
    private javax.swing.JPanel jPanelDay01;
    private javax.swing.JPanel jPanelDay02;
    private javax.swing.JPanel jPanelDay03;
    private javax.swing.JPanel jPanelDay04;
    private javax.swing.JPanel jPanelDay05;
    private javax.swing.JPanel jPanelDay06;
    private javax.swing.JPanel jPanelDay07;
    private javax.swing.JPanel jPanelDay08;
    private javax.swing.JPanel jPanelDay09;
    private javax.swing.JPanel jPanelDay10;
    private javax.swing.JPanel jPanelDay11;
    private javax.swing.JPanel jPanelDay12;
    private javax.swing.JPanel jPanelDay13;
    private javax.swing.JPanel jPanelDay14;
    private javax.swing.JPanel jPanelDetailsCustomer;
    private javax.swing.JPanel jPanelDetailsRoom;
    private javax.swing.JPanel jPanelEditBookingCustomer;
    private javax.swing.JPanel jPanelEditBookingRoom;
    private javax.swing.JPanel jPanelMainBookingButtons;
    private javax.swing.JPanel jPanelMainCheckInOutButtons;
    private javax.swing.JPanel jPanelMainInfoNotifier;
    private javax.swing.JPanel jPanelMainSearchButtons;
    private javax.swing.JPanel jPanelOverviewCells;
    private javax.swing.JPanel jPanelOverviewCellsButtons1;
    private javax.swing.JPanel jPanelOverviewCellsButtons2;
    private javax.swing.JPanel jPanelRoom1;
    private javax.swing.JPanel jPanelRoom2;
    private javax.swing.JPanel jPanelRoom3;
    private javax.swing.JPanel jPanelRoom4;
    private javax.swing.JPanel jPanelRoom5;
    private javax.swing.JPanel jPanelRoom6;
    private javax.swing.JPanel jPanelRoom7;
    private javax.swing.JPanel jPanelRoom8;
    private javax.swing.JPanel jPanelSetupOverviewSelect14DaysPeriod;
    private javax.swing.JPanel jPanelSetupOverviewSelectRoomsAtRows;
    private javax.swing.JRadioButton jRadioButtonSearchRoom0;
    private javax.swing.JRadioButton jRadioButtonSearchRoom1;
    private javax.swing.JRadioButton jRadioButtonSearchRoom2;
    private javax.swing.JRadioButton jRadioButtonSearchRoom3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextFieldBookingCountry;
    private javax.swing.JTextField jTextFieldBookingEmail;
    private javax.swing.JTextField jTextFieldBookingFirstName;
    private javax.swing.JTextField jTextFieldBookingGuestID;
    private javax.swing.JTextField jTextFieldBookingLastName;
    private javax.swing.JTextField jTextFieldBookingPhoneNumber;
    private javax.swing.JTextField jTextFieldEditCountryNew;
    private javax.swing.JTextField jTextFieldEditEmailNew;
    private javax.swing.JTextField jTextFieldEditFirstNameNew;
    private javax.swing.JTextField jTextFieldEditLastNameNew;
    private javax.swing.JTextField jTextFieldEditPhoneNew;
    private javax.swing.JTextField jTextFieldRow1;
    private javax.swing.JTextField jTextFieldRow2;
    private javax.swing.JTextField jTextFieldRow3;
    private javax.swing.JTextField jTextFieldRow4;
    private javax.swing.JTextField jTextFieldRow5;
    private javax.swing.JTextField jTextFieldRow6;
    private javax.swing.JTextField jTextFieldRow7;
    private javax.swing.JTextField jTextFieldRow8;
    private javax.swing.JTextField jTextFieldSearchCustomerCountry;
    private javax.swing.JTextField jTextFieldSearchCustomerEmail;
    private javax.swing.JTextField jTextFieldSearchCustomerFirstName;
    private javax.swing.JTextField jTextFieldSearchCustomerGuestID;
    private javax.swing.JTextField jTextFieldSearchCustomerLastName;
    private javax.swing.JTextField jTextFieldSearchCustomerPhoneNumber;
    private javax.swing.JTextField jTextFieldSetupOverviewEndDate;
    private javax.swing.JTextField jTextFieldSetupOverviewEndMonth;
    private javax.swing.JTextField jTextFieldSetupOverviewEndYear;
    // End of variables declaration//GEN-END:variables
    
    private void setupBookingStartDate()
    {
        int year = (jComboBoxBookingStartYear.getSelectedIndex()+2014);
        int month = jComboBoxBookingStartMonth.getSelectedIndex();
        int dim = getDaysInMonth(month, year);
        String[] list = getComboBoxList(dim);
        jComboBoxBookingStartDate.setModel(new javax.swing.DefaultComboBoxModel(list));
    }
    
    private void setupBookingEndDate()
    {
        int year = (jComboBoxBookingEndYear.getSelectedIndex()+2014);
        int month = jComboBoxBookingEndMonth.getSelectedIndex();
        int dim = getDaysInMonth(month, year);
        String[] list = getComboBoxList(dim);
        jComboBoxBookingEndDate.setModel(new javax.swing.DefaultComboBoxModel(list));
    }
    
    private void setupBookingNightsNotifier()
    {
        Calendar dFrom = Calendar.getInstance();
        Calendar dTo = Calendar.getInstance();
        dFrom.set((jComboBoxBookingStartYear.getSelectedIndex()+2014), jComboBoxBookingStartMonth.getSelectedIndex(), (jComboBoxBookingStartDate.getSelectedIndex()+1));
        dTo.set((jComboBoxBookingEndYear.getSelectedIndex()+2014), jComboBoxBookingEndMonth.getSelectedIndex(), (jComboBoxBookingEndDate.getSelectedIndex()+1));
        int numberNights = getNumberOfNights(dFrom, dTo);
        if(numberNights<1)
        {
            jLabelBookingNumberNights.setText("");
        } else
        {
            jLabelBookingNumberNights.setText("(" + numberNights + " Nights)");
        }
    }
    
    private void setupSearchRoomNightsNotifier()
    {
        Calendar dFrom = Calendar.getInstance();
        Calendar dTo = Calendar.getInstance();
        dFrom.set((jComboBoxSearchStartYear.getSelectedIndex()+2014), jComboBoxSearchStartMonth.getSelectedIndex(), (jComboBoxSearchStartDate.getSelectedIndex()+1));
        dTo.set((jComboBoxSearchEndYear.getSelectedIndex()+2014), jComboBoxSearchEndMonth.getSelectedIndex(), (jComboBoxSearchEndDate.getSelectedIndex()+1));
        int numberNights = getNumberOfNights(dFrom, dTo);
        if(numberNights<1)
        {
            jLabelSearchRoomNumberNights.setText("");
        } else
        {
            jLabelSearchRoomNumberNights.setText("(" + numberNights + " Nights)");
        }
    }
    
    private void setupOverviewEndDate()
    {
        int ocYear = jComboBoxSetupOverviewStartYear.getSelectedIndex()+2014;
        int ocMonth = jComboBoxSetupOverviewStartMonth.getSelectedIndex();
        int ocDate = jComboBoxSetupOverviewStartDate.getSelectedIndex()+1;
        Calendar sDate = Calendar.getInstance();
        sDate.set(ocYear, ocMonth, ocDate);
        sDate.add(Calendar.DATE, 13);
        String monthName = sdfMonthName.format(sDate.getTime());
        int dateCount = Integer.parseInt(sdfDateInt.format(sDate.getTime()));
        int yearCount = Integer.parseInt(sdfYearLong.format(sDate.getTime()));
        jTextFieldSetupOverviewEndMonth.setText(monthName);
        jTextFieldSetupOverviewEndDate.setText("" + dateCount);
        jTextFieldSetupOverviewEndYear.setText("" + yearCount);
    }
    
    public void setupDialogBooking()
    {
        setCurrentDate();
        jTextFieldBookingFirstName.setText("");
        jTextFieldBookingLastName.setText("");
        jTextFieldBookingCountry.setText("");
        jTextFieldBookingPhoneNumber.setText("");
        jTextFieldBookingEmail.setText("");
        jTextFieldBookingGuestID.setText("");
        jButtonBookingSearchCustomer.setEnabled(true);
        jButtonBookingBook.setEnabled(false);
        jComboBoxBookingRoomType.setSelectedIndex(0);
        jComboBoxBookingStartMonth.setSelectedIndex(currentMonth-1);
        jComboBoxBookingStartYear.setSelectedIndex(currentYear-14);
        jComboBoxBookingStartDate.setSelectedIndex(currentDate-1);
        jComboBoxBookingEndMonth.setSelectedIndex(currentMonth-1);
        jComboBoxBookingEndYear.setSelectedIndex(currentYear-14);
        jComboBoxBookingEndDate.setSelectedIndex(currentDate-1);
        jLabelBookingNumberNights.setText("");
        jLabelBookingRoomNotifier.setText("");
        jLabelBookingRoomTypePersonsNotifier.setText("(1 person)");
        jButtonBookingCreateID.setEnabled(true);
        jDialogBooking.setVisible(true);
    }
    
    private void setupDialogBookingWithRoom(String roomID, Calendar sDate, Calendar eDate)
    {
        setCurrentDate();
        jButtonBookingSearchCustomer.setEnabled(true);
        RoomTypeIDConstructor roomInfo = jdcbselect.getRoomInfoFromRoomID(roomID);
        String rType = roomInfo.getRoomType();
        switch (rType)
        {
            case "Single":
                jComboBoxBookingRoomType.setSelectedIndex(0);
                break;
            case "Double":
                jComboBoxBookingRoomType.setSelectedIndex(1);
                break;
            case "Family":
                jComboBoxBookingRoomType.setSelectedIndex(2);
                break;
        }
        DateVar sd = getDateSettings(sDate);
        DateVar ed = getDateSettings(eDate);
        jComboBoxBookingStartMonth.setSelectedIndex(sd.getMonth());
        jComboBoxBookingStartYear.setSelectedIndex(sd.getYear());
        jComboBoxBookingStartDate.setSelectedIndex(sd.getDate());
        jComboBoxBookingEndMonth.setSelectedIndex(ed.getMonth());
        jComboBoxBookingEndYear.setSelectedIndex(ed.getYear());
        jComboBoxBookingEndDate.setSelectedIndex(ed.getDate());
        jButtonBookingCreateID.setEnabled(true);
        jDialogBooking.setVisible(true);
        if(checkRoom(roomID, sDate, eDate))
        {
            jButtonBookingBook.setEnabled(true);
            jLabelBookingRoomNotifier.setText("Found room: " + roomID);
            bookingRoomID = roomID;
            bookingDateFrom = sdf.format(sDate.getTime());
            bookingDateTo = sdf.format(eDate.getTime());
            int nights = getNumberOfNights(sDate, eDate);
            bookingNumberNights = "" + nights;
        } else
        {
            jLabelBookingRoomNotifier.setText("Room " + roomID + "<html> is not available in the specified period...</html>");
            jButtonBookingBook.setEnabled(false);
        }
    }
    
    private void setupDialogSearchCustomer(boolean returnButton)
    {
        setCurrentDate();
        jTextFieldSearchCustomerFirstName.setText("");
        jTextFieldSearchCustomerLastName.setText("");
        jTextFieldSearchCustomerCountry.setText("");
        jTextFieldSearchCustomerPhoneNumber.setText("");
        jTextFieldSearchCustomerEmail.setText("");
        jTextFieldSearchCustomerGuestID.setText("");
        jLabelSearchCustomerFirstName.setText("");
        jLabelSearchCustomerLastName.setText("");
        jLabelSearchCustomerCountry.setText("");
        jLabelSearchCustomerPhone.setText("");
        jLabelSearchCustomerEmail.setText("");
        jLabelSearchCustomerGuestID.setText("");
        jListSearchCustomerResult.setModel(EmptyList);
        jListSearchCustomerBookingsHistory.setModel(EmptyList);
        jButtonSearchCustomerReturnToBooking.setVisible(returnButton);
        jDialogSearchCustomer.setVisible(true);
    }
    
    private void setupDialogSearchRoom()
    {
        setCurrentDate();
        jListSearchRoomResult.setModel(EmptyList);
        jComboBoxSearchEndMonth.setEnabled(true);
        jComboBoxSearchEndDate.setEnabled(true);
        jComboBoxSearchEndYear.setEnabled(true);
        jComboBoxSearchRoomType.setSelectedIndex(0);
        jLabelSearchRoomTypePersonsNotifier.setText("");
        jLabelSearchRoomResultNotifier.setText("");
        jLabelSearchRoomNumberNights.setText("");
        jRadioButtonSearchRoom1.setSelected(true);
        jComboBoxSearchStartMonth.setSelectedIndex(currentMonth-1);
        jComboBoxSearchStartYear.setSelectedIndex(currentYear-14);
        jComboBoxSearchStartDate.setSelectedIndex(currentDate-1);
        jComboBoxSearchEndMonth.setSelectedIndex(currentMonth-1);
        jComboBoxSearchEndYear.setSelectedIndex(currentYear-14);
        jComboBoxSearchEndDate.setSelectedIndex(currentDate-1);
        jDialogSearchRoom.setVisible(true);
    }
    
    private void setupDialogEditDetails(String guestID)
    {
        setCurrentDate();
        deleteBookingRoomID = "";
        deleteBookingGuestID = "";
        deleteBookingStartDate = "";
        deleteBookingEndDate = "";
        jTextFieldEditFirstNameNew.setText("");
        jTextFieldEditLastNameNew.setText("");
        jTextFieldEditCountryNew.setText("");
        jTextFieldEditPhoneNew.setText("");
        jTextFieldEditEmailNew.setText("");
        jLabelDetailsResultNotifier.setText("");
        jLabelDetailsRoomID.setText("");
        jLabelDetailsRoomType.setText("");
        jLabelDetailsDateFrom.setText("");
        jLabelDetailsDateTo.setText("");
        RoomTypeIDConstructor bList;
        Calendar sBookDate = Calendar.getInstance();
        Calendar dateNow = Calendar.getInstance();
        guestList.clear();
        writeList.clear();
        guestList = jdcbselect.getInfoFromGuestID(guestID);
        bList = jdcbselect.getRoomInfoFromRoomID(guestID);
        if (guestList.size() > 0)
        {
            jButtonDetailsSaveChanges.setEnabled(true);
            jLabelEditGuestIDOriginal.setText(guestList.get(0).getGuestID());
            jLabelEditFirstNameOriginal.setText(guestList.get(0).getGuestFirstname());
            jLabelEditLastNameOriginal.setText(guestList.get(0).getGuestLastName());
            jLabelEditCountryOriginal.setText(guestList.get(0).getCountry());
            jLabelEditPhoneOriginal.setText(guestList.get(0).getContanctPhone());
            jLabelEditEmailOriginal.setText(guestList.get(0).getEmail());
            for(int i = 0; i < guestList.size(); i++)
            {
                try
                {
                    sBookDate.setTime(sdf.parse(guestList.get(i).getDateFrom()));
                } catch (ParseException ex)
                {
                    Logger.getLogger(CasablancaGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (sBookDate.after(dateNow))
                {
                    String rID = guestList.get(i).getRoomID();
                    String rType = bList.getRoomType();
                    String df = guestList.get(i).getDateFrom();
                    String dt = guestList.get(i).getDateTo();
                    writeList.addElement("Room " + rID + " (" + rType + "), From " + df + ", To " + dt);
                }
            }
            if(writeList.isEmpty())
            {
                writeList.addElement("No future bookings found...");
                jButtonDetailsChangeBooking.setEnabled(false);
                jButtonDetailsShowBooking.setEnabled(false);
            } else
            {
                jButtonDetailsChangeBooking.setEnabled(true);
                jButtonDetailsShowBooking.setEnabled(true);
            }
            jListDetailsFutureBookings.setModel(writeList);
        } else
        {
            jLabelDetailsResultNotifier.setText("No guest-information found...");
            jButtonDetailsSaveChanges.setEnabled(false);
        }
        jDialogEditDetails.setVisible(true);
    }
    
    private void setupDialogCheckIn()
    {
        setCurrentDate();
        jLabelCheckInOutNotifier.setText("");
        jListCheckInOut.setModel(EmptyList);
        jComboBoxCheckInMonth.setSelectedIndex(currentMonth-1);
        jComboBoxCheckInYear.setSelectedIndex(currentYear-14);
        jComboBoxCheckInDate.setSelectedIndex(currentDate-1);
        jDialogCheckInOut.setVisible(true);
    }
    
    public void setupDialogSetupOverview(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8)
    {
        setCurrentDate();
        jTextFieldRow1.setText(r1);
        jTextFieldRow1.setFont(fontSystem);
        jTextFieldRow1.setForeground(Color.DARK_GRAY);
        jTextFieldRow2.setText(r2);
        jTextFieldRow2.setFont(fontSystem);
        jTextFieldRow2.setForeground(Color.DARK_GRAY);
        jTextFieldRow3.setText(r3);
        jTextFieldRow3.setFont(fontSystem);
        jTextFieldRow3.setForeground(Color.DARK_GRAY);
        jTextFieldRow4.setText(r4);
        jTextFieldRow4.setFont(fontSystem);
        jTextFieldRow4.setForeground(Color.DARK_GRAY);
        jTextFieldRow5.setText(r5);
        jTextFieldRow5.setFont(fontSystem);
        jTextFieldRow5.setForeground(Color.DARK_GRAY);
        jTextFieldRow6.setText(r6);
        jTextFieldRow6.setFont(fontSystem);
        jTextFieldRow6.setForeground(Color.DARK_GRAY);
        jTextFieldRow7.setText(r7);
        jTextFieldRow7.setFont(fontSystem);
        jTextFieldRow7.setForeground(Color.DARK_GRAY);
        jTextFieldRow8.setText(r8);
        jTextFieldRow8.setFont(fontSystem);
        jTextFieldRow8.setForeground(Color.DARK_GRAY);
        ovcStartDate.setTime(spc.getOVCdate().getTime());
        DateVar dateObject = getDateSettings(ovcStartDate);
        jComboBoxSetupOverviewStartMonth.setSelectedIndex(dateObject.getMonth());
        jComboBoxSetupOverviewStartYear.setSelectedIndex(dateObject.getYear());
        jComboBoxSetupOverviewStartDate.setSelectedIndex(dateObject.getDate());
        jDialogSetupOverview.setVisible(true);
    }
    
    private void updateCells()
    {
        setCurrentDate();
        fillDateCells(spc.getOVCdate());
        fillRoomCells(ovcRoom1, 1, spc.getOVCdate());
        fillRoomCells(ovcRoom2, 2, spc.getOVCdate());
        fillRoomCells(ovcRoom3, 3, spc.getOVCdate());
        fillRoomCells(ovcRoom4, 4, spc.getOVCdate());
        fillRoomCells(ovcRoom5, 5, spc.getOVCdate());
        fillRoomCells(ovcRoom6, 6, spc.getOVCdate());
        fillRoomCells(ovcRoom7, 7, spc.getOVCdate());
        fillRoomCells(ovcRoom8, 8, spc.getOVCdate());
    }
    
    private void setupOverviewList()
    {
        setCurrentDate();
        if (ovcShowRoomsList.size() > 0)
        {
            if (ovcShowRoomsList.size() > 8)
            {
                if (ovcListIndex < 9)
                {
                    ovcListIndex = 8;
                    jButtonRoomArrowUp.setEnabled(false);
                } else
                {
                    jButtonRoomArrowUp.setEnabled(true);
                }
                if (ovcListIndex > ovcShowRoomsList.size())
                {
                    ovcListIndex = ovcShowRoomsList.size();
                    jButtonRoomArrowDown.setEnabled(false);
                } else
                {
                    jButtonRoomArrowDown.setEnabled(true);
                }
                ovcRoom1 = ovcShowRoomsList.get(ovcListIndex - 8);
                ovcRoom2 = ovcShowRoomsList.get(ovcListIndex - 7);
                ovcRoom3 = ovcShowRoomsList.get(ovcListIndex - 6);
                ovcRoom4 = ovcShowRoomsList.get(ovcListIndex - 5);
                ovcRoom5 = ovcShowRoomsList.get(ovcListIndex - 4);
                ovcRoom6 = ovcShowRoomsList.get(ovcListIndex - 3);
                ovcRoom7 = ovcShowRoomsList.get(ovcListIndex - 2);
                ovcRoom8 = ovcShowRoomsList.get(ovcListIndex - 1);
            } else
            {
                jButtonRoomArrowUp.setEnabled(false);
                jButtonRoomArrowDown.setEnabled(false);
                ovcListIndex = 0;
                if(ovcShowRoomsList.size()>7)
                {
                    ovcRoom8 = ovcShowRoomsList.get(7);
                } else
                {
                    ovcRoom8 = "000";
                }
                if(ovcShowRoomsList.size()>6)
                {
                    ovcRoom7 = ovcShowRoomsList.get(6);
                } else
                {
                    ovcRoom7 = "000";
                }
                if(ovcShowRoomsList.size()>5)
                {
                    ovcRoom6 = ovcShowRoomsList.get(5);
                } else
                {
                    ovcRoom6 = "000";
                }
                if(ovcShowRoomsList.size()>4)
                {
                    ovcRoom5 = ovcShowRoomsList.get(4);
                } else
                {
                    ovcRoom5 = "000";
                }
                if(ovcShowRoomsList.size()>3)
                {
                    ovcRoom4 = ovcShowRoomsList.get(3);
                } else
                {
                    ovcRoom4 = "000";
                }
                if(ovcShowRoomsList.size()>2)
                {
                    ovcRoom3 = ovcShowRoomsList.get(2);
                } else
                {
                    ovcRoom3 = "000";
                }
                if(ovcShowRoomsList.size()>1)
                {
                    ovcRoom2 = ovcShowRoomsList.get(1);
                } else
                {
                    ovcRoom2 = "000";
                }
                if(ovcShowRoomsList.size()>0)
                {
                    ovcRoom1 = ovcShowRoomsList.get(0);
                } else
                {
                    ovcRoom1 = "000";
                }
            }
        } else
        {
            ovcRoom1 = "000";
            ovcRoom2 = "000";
            ovcRoom3 = "000";
            ovcRoom4 = "000";
            ovcRoom5 = "000";
            ovcRoom6 = "000";
            ovcRoom7 = "000";
            ovcRoom8 = "000";
            jLabelOverviewInfoMessage.setText("No rooms to show...");
        }
        updateCells();
    }
    
    //Resets any lists of showing rooms and show all 104 rooms, starting from room 1-8
    private void resetMainScreen(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8)
    {
        setCurrentDate();
        ovcListIndex = 8;
        ovcShowRoomsList.clear();
        ovcShowRoomsList.addAll(Arrays.asList(normalView));
        fillDateCells(spc.getOVCdate());
        fillRoomCells(r1, 1, spc.getOVCdate());
        fillRoomCells(r2, 2, spc.getOVCdate());
        fillRoomCells(r3, 3, spc.getOVCdate());
        fillRoomCells(r4, 4, spc.getOVCdate());
        fillRoomCells(r5, 5, spc.getOVCdate());
        fillRoomCells(r6, 6, spc.getOVCdate());
        fillRoomCells(r7, 7, spc.getOVCdate());
        fillRoomCells(r8, 8, spc.getOVCdate());
    }
    
    //Fills the top cells in Overview-window with the dates and weekdays of each column.
    private void fillDateCells(Calendar sDate)
    {
        setCurrentDate();
        Calendar sD = Calendar.getInstance();
        sD.setTime(sDate.getTime());
        int ocD = 0;
        int ocY = 0;
        String ocM;
        String ocW;
        for(int a = 0; a<14; a++)
        {
            ocD = Integer.parseInt(sdfDateInt.format(sD.getTime()));
            ocY = Integer.parseInt(sdfYearLong.format(sD.getTime()));
            ocM = sdfMonthNameShort.format(sD.getTime());
            ocW = sdfWeekDayName.format(sD.getTime());
            switch (a)
            {
                case 0:
                    jLabelDate01Day.setText(ocW);
                    jLabelDate01.setText(ocD + ". " + ocM);
                    jLabelDate01Year.setText(ocY + "");
                    break;
                case 1:
                    jLabelDate02Day.setText(ocW);
                    jLabelDate02.setText(ocD + ". " + ocM);
                    jLabelDate02Year.setText(ocY + "");
                    break;
                case 2:
                    jLabelDate03Day.setText(ocW);
                    jLabelDate03.setText(ocD + ". " + ocM);
                    jLabelDate03Year.setText(ocY + "");
                    break;
                case 3:
                    jLabelDate04Day.setText(ocW);
                    jLabelDate04.setText(ocD + ". " + ocM);
                    jLabelDate04Year.setText(ocY + "");
                    break;
                case 4:
                    jLabelDate05Day.setText(ocW);
                    jLabelDate05.setText(ocD + ". " + ocM);
                    jLabelDate05Year.setText(ocY + "");
                    break;
                case 5:
                    jLabelDate06Day.setText(ocW);
                    jLabelDate06.setText(ocD + ". " + ocM);
                    jLabelDate06Year.setText(ocY + "");
                    break;
                case 6:
                    jLabelDate07Day.setText(ocW);
                    jLabelDate07.setText(ocD + ". " + ocM);
                    jLabelDate07Year.setText(ocY + "");
                    break;
                case 7:
                    jLabelDate08Day.setText(ocW);
                    jLabelDate08.setText(ocD + ". " + ocM);
                    jLabelDate08Year.setText(ocY + "");
                    break;
                case 8:
                    jLabelDate09Day.setText(ocW);
                    jLabelDate09.setText(ocD + ". " + ocM);
                    jLabelDate09Year.setText(ocY + "");
                    break;
                case 9:
                    jLabelDate10Day.setText(ocW);
                    jLabelDate10.setText(ocD + ". " + ocM);
                    jLabelDate10Year.setText(ocY + "");
                    break;
                case 10:
                    jLabelDate11Day.setText(ocW);
                    jLabelDate11.setText(ocD + ". " + ocM);
                    jLabelDate11Year.setText(ocY + "");
                    break;
                case 11:
                    jLabelDate12Day.setText(ocW);
                    jLabelDate12.setText(ocD + ". " + ocM);
                    jLabelDate12Year.setText(ocY + "");
                    break;
                case 12:
                    jLabelDate13Day.setText(ocW);
                    jLabelDate13.setText(ocD + ". " + ocM);
                    jLabelDate13Year.setText(ocY + "");
                    break;
                case 13:
                    jLabelDate14Day.setText(ocW);
                    jLabelDate14.setText(ocD + ". " + ocM);
                    jLabelDate14Year.setText(ocY + "");
                    break;
            }
            sD.add(Calendar.DATE, 1);
        }
    }
    
    //Filling all cells with a specific Icon, depending on its availability-status
    private void fillRoomCells(String roomID, int roomRow, Calendar firstDate)
    {
        Calendar fDate = Calendar.getInstance();
        fDate.setTime(firstDate.getTime());
        if (roomID.equals("000"))
        {
            switch (roomRow)
            {
                case 1:
                    fillRoom1Cells(100, "", "", null);
                    break;
                case 2:
                    fillRoom2Cells(200, "", "", null);
                    break;
                case 3:
                    fillRoom3Cells(300, "", "", null);
                    break;
                case 4:
                    fillRoom4Cells(400, "", "", null);
                    break;
                case 5:
                    fillRoom5Cells(500, "", "", null);
                    break;
                case 6:
                    fillRoom6Cells(600, "", "", null);
                    break;
                case 7:
                    fillRoom7Cells(700, "", "", null);
                    break;
                case 8:
                    fillRoom8Cells(800, "", "", null);
                    break;
            }
            for (int a = 0; a < 14; a++)
            {
                int day = 1 + a;
                switch (roomRow)
                {
                    case 1:
                        fillRoom1Cells(day, null, null, null);
                        break;
                    case 2:
                        fillRoom2Cells(day, null, null, null);
                        break;
                    case 3:
                        fillRoom3Cells(day, null, null, null);
                        break;
                    case 4:
                        fillRoom4Cells(day, null, null, null);
                        break;
                    case 5:
                        fillRoom5Cells(day, null, null, null);
                        break;
                    case 6:
                        fillRoom6Cells(day, null, null, null);
                        break;
                    case 7:
                        fillRoom7Cells(day, null, null, null);
                        break;
                    case 8:
                        fillRoom8Cells(day, null, null, null);
                        break;
                }
            }
        } else
        {
            RoomTypeIDConstructor rList;
            rList = jdcbselect.getRoomInfoFromRoomID(roomID);
            switch (roomRow)
            {
                case 1:
                    fillRoom1Cells(100, roomID, rList.getRoomType(), null);
                    break;
                case 2:
                    fillRoom2Cells(200, roomID, rList.getRoomType(), null);
                    break;
                case 3:
                    fillRoom3Cells(300, roomID, rList.getRoomType(), null);
                    break;
                case 4:
                    fillRoom4Cells(400, roomID, rList.getRoomType(), null);
                    break;
                case 5:
                    fillRoom5Cells(500, roomID, rList.getRoomType(), null);
                    break;
                case 6:
                    fillRoom6Cells(600, roomID, rList.getRoomType(), null);
                    break;
                case 7:
                    fillRoom7Cells(700, roomID, rList.getRoomType(), null);
                    break;
                case 8:
                    fillRoom8Cells(800, roomID, rList.getRoomType(), null);
                    break;
            }
            ArrayList<RoomAvaBookConstructor> frsList = new ArrayList<>();
            frsList = jdcbselect.getCheckAvaRoom(roomID);
            for (int a = 0; a < 14; a++)
            {
                ImageIcon icon = findRoomStatus(fDate, frsList);
                int day = 1 + a;
                switch (roomRow)
                {
                    case 1:
                        fillRoom1Cells(day, null, null, icon);
                        break;
                    case 2:
                        fillRoom2Cells(day, null, null, icon);
                        break;
                    case 3:
                        fillRoom3Cells(day, null, null, icon);
                        break;
                    case 4:
                        fillRoom4Cells(day, null, null, icon);
                        break;
                    case 5:
                        fillRoom5Cells(day, null, null, icon);
                        break;
                    case 6:
                        fillRoom6Cells(day, null, null, icon);
                        break;
                    case 7:
                        fillRoom7Cells(day, null, null, icon);
                        break;
                    case 8:
                        fillRoom8Cells(day, null, null, icon);
                        break;
                }
                fDate.add(Calendar.DAY_OF_MONTH, 1);
            }
        }
    }
    
    private void fillRoom1Cells(int day, String roomID, String roomType, ImageIcon icon)
    {
        switch (day)
        {
            case 100:
                jLabelRoom1RoomID.setText("" + roomID);
                jLabelRoom1RoomType.setText("" + roomType);
                break;
            case 1:
                jLabelOC101.setIcon(icon);
                break;
            case 2:
                jLabelOC102.setIcon(icon);
                break;
            case 3:
                jLabelOC103.setIcon(icon);
                break;
            case 4:
                jLabelOC104.setIcon(icon);
                break;
            case 5:
                jLabelOC105.setIcon(icon);
                break;
            case 6:
                jLabelOC106.setIcon(icon);
                break;
            case 7:
                jLabelOC107.setIcon(icon);
                break;
            case 8:
                jLabelOC108.setIcon(icon);
                break;
            case 9:
                jLabelOC109.setIcon(icon);
                break;
            case 10:
                jLabelOC110.setIcon(icon);
                break;
            case 11:
                jLabelOC111.setIcon(icon);
                break;
            case 12:
                jLabelOC112.setIcon(icon);
                break;
            case 13:
                jLabelOC113.setIcon(icon);
                break;
            case 14:
                jLabelOC114.setIcon(icon);
                break;
        }
    }
    
    private void fillRoom2Cells(int day, String roomID, String roomType, ImageIcon icon)
    {
        switch (day)
        {
            case 200:
                jLabelRoom2RoomID.setText("" + roomID);
                jLabelRoom2RoomType.setText(roomType);
                break;
            case 1:
                jLabelOC201.setIcon(icon);
                break;
            case 2:
                jLabelOC202.setIcon(icon);
                break;
            case 3:
                jLabelOC203.setIcon(icon);
                break;
            case 4:
                jLabelOC204.setIcon(icon);
                break;
            case 5:
                jLabelOC205.setIcon(icon);
                break;
            case 6:
                jLabelOC206.setIcon(icon);
                break;
            case 7:
                jLabelOC207.setIcon(icon);
                break;
            case 8:
                jLabelOC208.setIcon(icon);
                break;
            case 9:
                jLabelOC209.setIcon(icon);
                break;
            case 10:
                jLabelOC210.setIcon(icon);
                break;
            case 11:
                jLabelOC211.setIcon(icon);
                break;
            case 12:
                jLabelOC212.setIcon(icon);
                break;
            case 13:
                jLabelOC213.setIcon(icon);
                break;
            case 14:
                jLabelOC214.setIcon(icon);
                break;
        }
    }
    
    private void fillRoom3Cells(int day, String roomID, String roomType, ImageIcon icon)
    {
        switch (day)
        {
            case 300:
                jLabelRoom3RoomID.setText("" + roomID);
                jLabelRoom3RoomType.setText(roomType);
                break;
            case 1:
                jLabelOC301.setIcon(icon);
                break;
            case 2:
                jLabelOC302.setIcon(icon);
                break;
            case 3:
                jLabelOC303.setIcon(icon);
                break;
            case 4:
                jLabelOC304.setIcon(icon);
                break;
            case 5:
                jLabelOC305.setIcon(icon);
                break;
            case 6:
                jLabelOC306.setIcon(icon);
                break;
            case 7:
                jLabelOC307.setIcon(icon);
                break;
            case 8:
                jLabelOC308.setIcon(icon);
                break;
            case 9:
                jLabelOC309.setIcon(icon);
                break;
            case 10:
                jLabelOC310.setIcon(icon);
                break;
            case 11:
                jLabelOC311.setIcon(icon);
                break;
            case 12:
                jLabelOC312.setIcon(icon);
                break;
            case 13:
                jLabelOC313.setIcon(icon);
                break;
            case 14:
                jLabelOC314.setIcon(icon);
                break;
        }
    }
    
    private void fillRoom4Cells(int day, String roomID, String roomType, ImageIcon icon)
    {
        switch (day)
        {
            case 400:
                jLabelRoom4RoomID.setText("" + roomID);
                jLabelRoom4RoomType.setText(roomType);
                break;
            case 1:
                jLabelOC401.setIcon(icon);
                break;
            case 2:
                jLabelOC402.setIcon(icon);
                break;
            case 3:
                jLabelOC403.setIcon(icon);
                break;
            case 4:
                jLabelOC404.setIcon(icon);
                break;
            case 5:
                jLabelOC405.setIcon(icon);
                break;
            case 6:
                jLabelOC406.setIcon(icon);
                break;
            case 7:
                jLabelOC407.setIcon(icon);
                break;
            case 8:
                jLabelOC408.setIcon(icon);
                break;
            case 9:
                jLabelOC409.setIcon(icon);
                break;
            case 10:
                jLabelOC410.setIcon(icon);
                break;
            case 11:
                jLabelOC411.setIcon(icon);
                break;
            case 12:
                jLabelOC412.setIcon(icon);
                break;
            case 13:
                jLabelOC413.setIcon(icon);
                break;
            case 14:
                jLabelOC414.setIcon(icon);
                break;
        }
    }
    
    private void fillRoom5Cells(int day, String roomID, String roomType, ImageIcon icon)
    {
        switch (day)
        {
            case 500:
                jLabelRoom5RoomID.setText("" + roomID);
                jLabelRoom5RoomType.setText(roomType);
                break;
            case 1:
                jLabelOC501.setIcon(icon);
                break;
            case 2:
                jLabelOC502.setIcon(icon);
                break;
            case 3:
                jLabelOC503.setIcon(icon);
                break;
            case 4:
                jLabelOC504.setIcon(icon);
                break;
            case 5:
                jLabelOC505.setIcon(icon);
                break;
            case 6:
                jLabelOC506.setIcon(icon);
                break;
            case 7:
                jLabelOC507.setIcon(icon);
                break;
            case 8:
                jLabelOC508.setIcon(icon);
                break;
            case 9:
                jLabelOC509.setIcon(icon);
                break;
            case 10:
                jLabelOC510.setIcon(icon);
                break;
            case 11:
                jLabelOC511.setIcon(icon);
                break;
            case 12:
                jLabelOC512.setIcon(icon);
                break;
            case 13:
                jLabelOC513.setIcon(icon);
                break;
            case 14:
                jLabelOC514.setIcon(icon);
                break;
        }
    }
    
    private void fillRoom6Cells(int day, String roomID, String roomType, ImageIcon icon)
    {
        switch (day)
        {
            case 600:
                jLabelRoom6RoomID.setText("" + roomID);
                jLabelRoom6RoomType.setText(roomType);
                break;
            case 1:
                jLabelOC601.setIcon(icon);
                break;
            case 2:
                jLabelOC602.setIcon(icon);
                break;
            case 3:
                jLabelOC603.setIcon(icon);
                break;
            case 4:
                jLabelOC604.setIcon(icon);
                break;
            case 5:
                jLabelOC605.setIcon(icon);
                break;
            case 6:
                jLabelOC606.setIcon(icon);
                break;
            case 7:
                jLabelOC607.setIcon(icon);
                break;
            case 8:
                jLabelOC608.setIcon(icon);
                break;
            case 9:
                jLabelOC609.setIcon(icon);
                break;
            case 10:
                jLabelOC610.setIcon(icon);
                break;
            case 11:
                jLabelOC611.setIcon(icon);
                break;
            case 12:
                jLabelOC612.setIcon(icon);
                break;
            case 13:
                jLabelOC613.setIcon(icon);
                break;
            case 14:
                jLabelOC614.setIcon(icon);
                break;
        }
    }
    
    private void fillRoom7Cells(int day, String roomID, String roomType, ImageIcon icon)
    {
        switch (day)
        {
            case 700:
                jLabelRoom7RoomID.setText("" + roomID);
                jLabelRoom7RoomType.setText(roomType);
                break;
            case 1:
                jLabelOC701.setIcon(icon);
                break;
            case 2:
                jLabelOC702.setIcon(icon);
                break;
            case 3:
                jLabelOC703.setIcon(icon);
                break;
            case 4:
                jLabelOC704.setIcon(icon);
                break;
            case 5:
                jLabelOC705.setIcon(icon);
                break;
            case 6:
                jLabelOC706.setIcon(icon);
                break;
            case 7:
                jLabelOC707.setIcon(icon);
                break;
            case 8:
                jLabelOC708.setIcon(icon);
                break;
            case 9:
                jLabelOC709.setIcon(icon);
                break;
            case 10:
                jLabelOC710.setIcon(icon);
                break;
            case 11:
                jLabelOC711.setIcon(icon);
                break;
            case 12:
                jLabelOC712.setIcon(icon);
                break;
            case 13:
                jLabelOC713.setIcon(icon);
                break;
            case 14:
                jLabelOC714.setIcon(icon);
                break;
        }
    }
    
    private void fillRoom8Cells(int day, String roomID, String roomType, ImageIcon icon)
    {
        switch (day)
        {
            case 800:
                jLabelRoom8RoomID.setText("" + roomID);
                jLabelRoom8RoomType.setText(roomType);
                break;
            case 1:
                jLabelOC801.setIcon(icon);
                break;
            case 2:
                jLabelOC802.setIcon(icon);
                break;
            case 3:
                jLabelOC803.setIcon(icon);
                break;
            case 4:
                jLabelOC804.setIcon(icon);
                break;
            case 5:
                jLabelOC805.setIcon(icon);
                break;
            case 6:
                jLabelOC806.setIcon(icon);
                break;
            case 7:
                jLabelOC807.setIcon(icon);
                break;
            case 8:
                jLabelOC808.setIcon(icon);
                break;
            case 9:
                jLabelOC809.setIcon(icon);
                break;
            case 10:
                jLabelOC810.setIcon(icon);
                break;
            case 11:
                jLabelOC811.setIcon(icon);
                break;
            case 12:
                jLabelOC812.setIcon(icon);
                break;
            case 13:
                jLabelOC813.setIcon(icon);
                break;
            case 14:
                jLabelOC814.setIcon(icon);
                break;
        }
    }
}
