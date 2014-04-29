/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spc;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author Jonas
 **/
public class Facilitet_GUI extends javax.swing.JFrame
{
    public String finalGuestID;
    public String tempFacID;
    private SimpleDateFormat cDate = new SimpleDateFormat("dd");
    private SimpleDateFormat cMonth = new SimpleDateFormat("MM");
    private SimpleDateFormat cYear = new SimpleDateFormat("yy");
    JDBCInsertQuery insert = new JDBCInsertQuery();
    JDBCSelectQuery select = new JDBCSelectQuery();
    JDBCDeleteQuery delete = new JDBCDeleteQuery();
    JDBCUpdateQuery update = new JDBCUpdateQuery();
    DefaultListModel bookedOverview = new DefaultListModel();
    DefaultListModel waitlistOverview = new DefaultListModel();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
    ArrayList<BookedOverviewConstructor> tempBookOverview = new ArrayList<>();
    ArrayList<PositionOverviewConstructor> tempPos = new ArrayList<>();
    ArrayList<InfoObjectConstructor> tempGuestName = new ArrayList<>();
    ArrayList<GetfacAvailabilityConstructor> tempGetFac = new ArrayList<>();
    Calendar presentDate = Calendar.getInstance();
    Calendar cal = Calendar.getInstance();
    
    public Facilitet_GUI()
    {
        initComponents();
        
        // jComboBoxOverviewSelectDate
        jComboBoxOverviewSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxOverviewSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxOverviewSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxOverviewSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxOverviewSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxOverviewSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxOverviewSelectDate.addItem(sdf.format(cal.getTime()));
        
        // jComboBoxBadmintonSelectDate
        cal.roll(Calendar.DAY_OF_YEAR, -6);
        jComboBoxBadmintonSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxBadmintonSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxBadmintonSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxBadmintonSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxBadmintonSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxBadmintonSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxBadmintonSelectDate.addItem(sdf.format(cal.getTime()));
        
        // jComboBoxFitnessSelectDate
        cal.roll(Calendar.DAY_OF_YEAR, -6);
        jComboBoxFitnessSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxFitnessSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxFitnessSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxFitnessSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxFitnessSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxFitnessSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxFitnessSelectDate.addItem(sdf.format(cal.getTime()));
        
        // jComboBoxHandballSelectDate
        cal.roll(Calendar.DAY_OF_YEAR, -6);
        jComboBoxHandballSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxHandballSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxHandballSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxHandballSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxHandballSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxHandballSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxHandballSelectDate.addItem(sdf.format(cal.getTime()));
        
        // jComboBoxVolleyballSelectDate
        cal.roll(Calendar.DAY_OF_YEAR, -6);
        jComboBoxVolleyballSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxVolleyballSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxVolleyballSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxVolleyballSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxVolleyballSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxVolleyballSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxVolleyballSelectDate.addItem(sdf.format(cal.getTime()));
        
        // jComboBoxVolleyballSelectDate
        cal.roll(Calendar.DAY_OF_YEAR, -6);
        jComboBoxTennisSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxTennisSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxTennisSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxTennisSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxTennisSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxTennisSelectDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxTennisSelectDate.addItem(sdf.format(cal.getTime()));
        
        // jComboBoxOverviewEditBooking
        cal.roll(Calendar.DAY_OF_YEAR, -6);
        jComboBoxOverviewEditBookingDate1.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxOverviewEditBookingDate1.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxOverviewEditBookingDate1.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxOverviewEditBookingDate1.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxOverviewEditBookingDate1.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxOverviewEditBookingDate1.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxOverviewEditBookingDate1.addItem(sdf.format(cal.getTime()));
        
        //jComboBoxGolfInstructorDate
        cal.roll(Calendar.DAY_OF_YEAR, -6);
        jComboBoxGolfInstructorDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxGolfInstructorDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxGolfInstructorDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxGolfInstructorDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxGolfInstructorDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxGolfInstructorDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxGolfInstructorDate.addItem(sdf.format(cal.getTime()));
        
         //jComboBoxSwimmingInstructorDate
        cal.roll(Calendar.DAY_OF_YEAR, -6);
        jComboBoxSwimmingInstructorDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxSwimmingInstructorDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxSwimmingInstructorDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxSwimmingInstructorDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxSwimmingInstructorDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxSwimmingInstructorDate.addItem(sdf.format(cal.getTime()));
        cal.roll(Calendar.DAY_OF_YEAR, true);
        jComboBoxSwimmingInstructorDate.addItem(sdf.format(cal.getTime()));
    }
    
    private String[] getComboBoxListFromToday() //Genererer de næste 7 dage (inklusiv dagens dato)
    {
        int currentDate = Integer.parseInt(cDate.format(presentDate.getTime()));
        int currentMonth = Integer.parseInt(cMonth.format(presentDate.getTime()));
        int currentYear = Integer.parseInt(cYear.format(presentDate.getTime()));
        presentDate.set(currentYear, currentMonth, currentDate);
        String[] listOfDates = new String[7];
        for(int i = 0; i<7; i++)
        {
            String ld = sdf.format(presentDate.getTime());
            listOfDates[i] = ld;
            presentDate.add(Calendar.DAY_OF_MONTH, 1);
        }
        return listOfDates;
    }
    
    private void loadListOverview() { //henter en liste over en kundes bookinger (facilitet)
        bookedOverview.removeAllElements();
        tempBookOverview = select.getBookedOverview(finalGuestID);
        for(int i = 0;  i<tempBookOverview.size(); ++i) {
            String FacType = tempBookOverview.get(i).getFacType();
            String FacDate = tempBookOverview.get(i).getFacDate();
            String TimeStart = tempBookOverview.get(i).getTimeStart();
            String TimeEnd = tempBookOverview.get(i).getTimeEnd();
            String Instructor = tempBookOverview.get(i).getInstructor();
            
            if (Instructor.equals("Y")) {
            bookedOverview.addElement("Facility: "+FacType+", Date: "+FacDate+", "
                    + "From: "+TimeStart+", To: "+TimeEnd+", Instructor: Yes");
            } else {
                bookedOverview.addElement("Facility: "+FacType+", Date: "+FacDate+", "
                    + "From: "+TimeStart+", To: "+TimeEnd+", Instructor: No");
            }
        }
        jListBookedOverview.setModel(bookedOverview);
    }
    
    private void loadWaitlistOverview(String date, String timeStart, String timeEnd, String facility) { //henter ventelisten for en given facilitet på en given dato & tid
        waitlistOverview.removeAllElements();
        tempPos = select.getWaitlistPosition(date, timeStart, timeEnd, facility);
        for(int i=0; i<tempPos.size(); ++i) {
            int pos = i+1;
            String guestID = tempPos.get(i).getGuestID();
            String lastName = tempPos.get(i).getLastName();
            String firstName = tempPos.get(i).getFirstName();
            waitlistOverview.addElement(pos+": Guest ID: "+guestID+". Name: "+lastName+", "+firstName);
        }
        jListWaitOverview.setModel(waitlistOverview);
    }
    
    public boolean doubleBook (String cfacID, String cfacDate, String ctimeStart, String ctimeEnd){ //tjekker om en given booking allerede eksisterer
        tempBookOverview = select.getBookedOverview(finalGuestID);
        for(int i=0; i<tempBookOverview.size(); ++i) {
            String facID = tempBookOverview.get(i).getFacID();
            String facDate = tempBookOverview.get(i).getFacDate();
            String timeStart = tempBookOverview.get(i).getTimeStart();
            String timeEnd = tempBookOverview.get(i).getTimeEnd();
            if(facID.equals(cfacID) && facDate.equals(cfacDate) 
                    && timeStart.equals(ctimeStart) && timeEnd.equals(ctimeEnd)) {
                return true;
            }
            
        }
        return false;
    }
    
    public String convertFac (String entireBooking) { //Modtager en String, deler den op og konventerer derefter Facilitetstypen til et Facilitets ID
        String[] split = entireBooking.split(" ");
        String facType = split[1];
        switch (facType){
            case "BADMINTON,": return "1"; 
            case "GOLF,": return "2";
            case "HANDBALL,": return "3";
            case "MOUNTAIN": return "4";
            case "TABLE": return "5";
            case "VOLLEYBALL,": return "6";
            case "TENNIS,": return "7";
            case "SWIMMING,": return "8";
            case "FITNESS,": return "9";
        } return "This shouldn't happend";        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jDialogFacilityHelp = new javax.swing.JDialog();
        jPanelFacilityHelp = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jDialogOverviewHelp = new javax.swing.JDialog();
        jPanelOverviewHelp = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jDialogOverviewEditBooking = new javax.swing.JDialog();
        jPanelOverviewEditBooking = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        jComboBoxOverviewEditBookingDate1 = new javax.swing.JComboBox();
        jLabel99 = new javax.swing.JLabel();
        jComboBoxOverviewEditBookingTimeFrom1 = new javax.swing.JComboBox();
        jLabel100 = new javax.swing.JLabel();
        jLabelCurrentBooking = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jButtonOverviewEditBookingSaveChanges1 = new javax.swing.JButton();
        jLabelEditAlreadyBooked = new javax.swing.JLabel();
        jDialogOverviewDelete = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        jButtonOverviewDeleteYes1 = new javax.swing.JButton();
        jButtonOverviewDeleteNo1 = new javax.swing.JButton();
        jDialogFacilityInstrucHelp = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jDialogWaitOrNo = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonWaitYes = new javax.swing.JButton();
        jButtonWaitNo = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5Overview = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabelSignInGuestName = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jTextFieldSignInGuestID = new javax.swing.JTextField();
        jButtonSignInMain = new javax.swing.JButton();
        jButtonSignOutMain = new javax.swing.JButton();
        jLabelSignInErrorMessage = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jButtonOverviewEditBooking1 = new javax.swing.JButton();
        jButtonOverviewDeleteBooking1 = new javax.swing.JButton();
        jButtonOverviewHelp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListBookedOverview = new javax.swing.JList();
        jLabel69 = new javax.swing.JLabel();
        jButtonLoadBookings = new javax.swing.JButton();
        jLabelPleaseSelectBooking = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jComboBoxOverviewTimeFrom = new javax.swing.JComboBox();
        jButtonGetWaitOverview = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jComboBoxOverviewFacility = new javax.swing.JComboBox();
        jComboBoxOverviewSelectDate = new javax.swing.JComboBox();
        jLabel36 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListWaitOverview = new javax.swing.JList();
        jLabel91 = new javax.swing.JLabel();
        jButtonPrintInstrucCost = new javax.swing.JButton();
        jLabelOverviewBillPrintDone = new javax.swing.JLabel();
        jPanel1Badminton = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabelBadmintonErrorMessageBook = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jComboBoxBadmintonSelectDate = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        jComboBoxBadmintonTimeFrom = new javax.swing.JComboBox();
        jButtonBadmintonHelp = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBoxBadmintonInstruct = new javax.swing.JCheckBox();
        jLabelBadmintonCostText = new javax.swing.JLabel();
        jButtonBookBadminton = new javax.swing.JButton();
        jLabelBadmintonErrorMessageNoHours = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelBadmintonBookDone = new javax.swing.JLabel();
        jPanel3Golf = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jCheckBoxGolfInstruct = new javax.swing.JCheckBox();
        jLabelGolfInstructorDateTimeInfo = new javax.swing.JLabel();
        jLabelGolfInstructorDate = new javax.swing.JLabel();
        jComboBoxGolfInstructorDate = new javax.swing.JComboBox();
        jLabelGolfInstructorTimeFrom = new javax.swing.JLabel();
        jComboBoxGolfInstructorTimeFrom = new javax.swing.JComboBox();
        jButtonGolfHelp = new javax.swing.JButton();
        jButtonBookGolf = new javax.swing.JButton();
        jLabelGolfCostText = new javax.swing.JLabel();
        jLabelGolfErrorAlreadyBook = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelGolfBookDone = new javax.swing.JLabel();
        jPanel1Handball = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jComboBoxHandballSelectDate = new javax.swing.JComboBox();
        jLabel47 = new javax.swing.JLabel();
        jComboBoxHandballTimeFrom = new javax.swing.JComboBox();
        jButtonHandBallHelp = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jButtonBookHandball = new javax.swing.JButton();
        jLabelHandballErrorMessageBook = new javax.swing.JLabel();
        jLabelHandballBookDone = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel4MountainBike = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6TableTennis = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel8Volleyball = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jComboBoxVolleyballSelectDate = new javax.swing.JComboBox();
        jLabel76 = new javax.swing.JLabel();
        jComboBoxVolleyballTimeFrom = new javax.swing.JComboBox();
        jButtonVolleybalHelp = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jButtonBookVolley = new javax.swing.JButton();
        jLabelVolleyballNoSignText = new javax.swing.JLabel();
        jLabelVolleyballNoSign = new javax.swing.JLabel();
        jButtonVolleyballRefreshAmount = new javax.swing.JButton();
        jLabelVolleyballErrorMessageBook = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabelVolleyballBookDone = new javax.swing.JLabel();
        jPanel7Tennis = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jComboBoxTennisSelectDate = new javax.swing.JComboBox();
        jLabel86 = new javax.swing.JLabel();
        jComboBoxTennisTimeFrom = new javax.swing.JComboBox();
        jButtonTennisHelp = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBoxTennisInstruct = new javax.swing.JCheckBox();
        jLabelTennisCostText = new javax.swing.JLabel();
        jButtonBookTennis = new javax.swing.JButton();
        jLabelTennisErrorMessageBook = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabelGUIISBULLSHIT = new javax.swing.JLabel();
        jLabelTennisErrorMessageNoHours = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabelTennisBookDone = new javax.swing.JLabel();
        jPanel5Swimming = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jCheckBoxSwimmingInstruct = new javax.swing.JCheckBox();
        jLabel85 = new javax.swing.JLabel();
        jLabelSwimmingInstructorDateTimeInfo = new javax.swing.JLabel();
        jLabelSwimmingInstructorDate = new javax.swing.JLabel();
        jComboBoxSwimmingInstructorDate = new javax.swing.JComboBox();
        jLabelSwimmingInstructorTimeFrom = new javax.swing.JLabel();
        jComboBoxSwimmingInstructorTimeFrom = new javax.swing.JComboBox();
        jLabelSwimmingInstructorPrice = new javax.swing.JLabel();
        jButtonBookSwimming = new javax.swing.JButton();
        jButtonSwimmingHelp = new javax.swing.JButton();
        jLabelSwimmingErrorMessageNoHours = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabelSwimingBookDone = new javax.swing.JLabel();
        jPanel2Fitness = new javax.swing.JPanel();
        jPanelGolf = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jComboBoxFitnessSelectDate = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jComboBoxFitnessTimeFrom = new javax.swing.JComboBox();
        jButtonBookFitness = new javax.swing.JButton();
        jButtonFitnessHelp = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabelFitnessErrorMessageBook1 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabelFitnessBookDone = new javax.swing.JLabel();

        jDialogFacilityHelp.setMinimumSize(new java.awt.Dimension(435, 145));

        jPanelFacilityHelp.setMinimumSize(new java.awt.Dimension(400, 140));

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel72.setText("Help");

        jLabel93.setText("Use the scroll-panel to select the date and time you wish to play");

        jLabel95.setText("You can book between 1 and 4 hours. (max 4 hours per day)");

        jLabel96.setText("You can book up to 4 facilities, as long as you do not exceed 4 hours per day");

        jLabel119.setText("The cost of the instructor will be added to your check-out bill");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel95)
                    .addComponent(jLabel72)
                    .addComponent(jLabel93)
                    .addComponent(jLabel96)
                    .addComponent(jLabel119))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel72)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel95)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel96)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel119)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelFacilityHelpLayout = new javax.swing.GroupLayout(jPanelFacilityHelp);
        jPanelFacilityHelp.setLayout(jPanelFacilityHelpLayout);
        jPanelFacilityHelpLayout.setHorizontalGroup(
            jPanelFacilityHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFacilityHelpLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelFacilityHelpLayout.setVerticalGroup(
            jPanelFacilityHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFacilityHelpLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogFacilityHelpLayout = new javax.swing.GroupLayout(jDialogFacilityHelp.getContentPane());
        jDialogFacilityHelp.getContentPane().setLayout(jDialogFacilityHelpLayout);
        jDialogFacilityHelpLayout.setHorizontalGroup(
            jDialogFacilityHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFacilityHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogFacilityHelpLayout.setVerticalGroup(
            jDialogFacilityHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFacilityHelp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDialogOverviewHelp.setMinimumSize(new java.awt.Dimension(435, 145));

        jPanelOverviewHelp.setMinimumSize(new java.awt.Dimension(400, 140));
        jPanelOverviewHelp.setPreferredSize(new java.awt.Dimension(400, 140));

        jLabel92.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel92.setText("Help");

        jLabel94.setText("<html>Delete booking: Delete your booking; You can always rebook a facility <br> as long as it is available.");

        jLabel97.setText("<html>Edit booking: change the date and the time interval as long <br>  as it is available.");

        javax.swing.GroupLayout jPanelOverviewHelpLayout = new javax.swing.GroupLayout(jPanelOverviewHelp);
        jPanelOverviewHelp.setLayout(jPanelOverviewHelpLayout);
        jPanelOverviewHelpLayout.setHorizontalGroup(
            jPanelOverviewHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOverviewHelpLayout.createSequentialGroup()
                .addGroup(jPanelOverviewHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel92)
                    .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 66, Short.MAX_VALUE))
        );
        jPanelOverviewHelpLayout.setVerticalGroup(
            jPanelOverviewHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOverviewHelpLayout.createSequentialGroup()
                .addComponent(jLabel92)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogOverviewHelpLayout = new javax.swing.GroupLayout(jDialogOverviewHelp.getContentPane());
        jDialogOverviewHelp.getContentPane().setLayout(jDialogOverviewHelpLayout);
        jDialogOverviewHelpLayout.setHorizontalGroup(
            jDialogOverviewHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelOverviewHelp, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );
        jDialogOverviewHelpLayout.setVerticalGroup(
            jDialogOverviewHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelOverviewHelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDialogOverviewEditBooking.setMinimumSize(new java.awt.Dimension(534, 200));

        jLabel98.setText("Edit Booking");

        jComboBoxOverviewEditBookingDate1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxOverviewEditBookingDate1ActionPerformed(evt);
            }
        });

        jLabel99.setText("Date:");

        jComboBoxOverviewEditBookingTimeFrom1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8.00 - 9.00", "9.00 - 10.00", "11.00 - 12.00", "12.00 - 13.00", "14.00 - 15.00", "15.00 - 16.00", "17.00 - 18.00", "18.00 - 19.00", "19.00 - 20.00" }));
        jComboBoxOverviewEditBookingTimeFrom1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxOverviewEditBookingTimeFrom1ActionPerformed(evt);
            }
        });

        jLabel100.setText("From:");

        jLabelCurrentBooking.setText("Current booking:");

        jLabel103.setText("Change your booking to following date and time:");

        jButtonOverviewEditBookingSaveChanges1.setText("Save changes");
        jButtonOverviewEditBookingSaveChanges1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonOverviewEditBookingSaveChanges1ActionPerformed(evt);
            }
        });

        jLabelEditAlreadyBooked.setVisible(false);
        jLabelEditAlreadyBooked.setText("already booked message");

        javax.swing.GroupLayout jPanelOverviewEditBookingLayout = new javax.swing.GroupLayout(jPanelOverviewEditBooking);
        jPanelOverviewEditBooking.setLayout(jPanelOverviewEditBookingLayout);
        jPanelOverviewEditBookingLayout.setHorizontalGroup(
            jPanelOverviewEditBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOverviewEditBookingLayout.createSequentialGroup()
                .addGroup(jPanelOverviewEditBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOverviewEditBookingLayout.createSequentialGroup()
                        .addGroup(jPanelOverviewEditBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelOverviewEditBookingLayout.createSequentialGroup()
                                .addComponent(jLabel99)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxOverviewEditBookingDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel100)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxOverviewEditBookingTimeFrom1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelEditAlreadyBooked, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonOverviewEditBookingSaveChanges1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelOverviewEditBookingLayout.createSequentialGroup()
                        .addGroup(jPanelOverviewEditBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel98)
                            .addComponent(jLabel103))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(39, 39, 39))
            .addGroup(jPanelOverviewEditBookingLayout.createSequentialGroup()
                .addComponent(jLabelCurrentBooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelOverviewEditBookingLayout.setVerticalGroup(
            jPanelOverviewEditBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOverviewEditBookingLayout.createSequentialGroup()
                .addComponent(jLabel98)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCurrentBooking)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel103)
                .addGap(18, 18, 18)
                .addGroup(jPanelOverviewEditBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxOverviewEditBookingDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel99)
                    .addComponent(jComboBoxOverviewEditBookingTimeFrom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel100))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOverviewEditBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOverviewEditBookingSaveChanges1)
                    .addComponent(jLabelEditAlreadyBooked))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout jDialogOverviewEditBookingLayout = new javax.swing.GroupLayout(jDialogOverviewEditBooking.getContentPane());
        jDialogOverviewEditBooking.getContentPane().setLayout(jDialogOverviewEditBookingLayout);
        jDialogOverviewEditBookingLayout.setHorizontalGroup(
            jDialogOverviewEditBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelOverviewEditBooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogOverviewEditBookingLayout.setVerticalGroup(
            jDialogOverviewEditBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelOverviewEditBooking, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDialogOverviewDelete.setMinimumSize(new java.awt.Dimension(290, 90));

        jLabel104.setText("Are you sure you want to delete this booking");

        jButtonOverviewDeleteYes1.setText("Yes");
        jButtonOverviewDeleteYes1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonOverviewDeleteYes1ActionPerformed(evt);
            }
        });

        jButtonOverviewDeleteNo1.setText("No");
        jButtonOverviewDeleteNo1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonOverviewDeleteNo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel104)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButtonOverviewDeleteYes1)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonOverviewDeleteNo1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel104)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOverviewDeleteYes1)
                    .addComponent(jButtonOverviewDeleteNo1)))
        );

        javax.swing.GroupLayout jDialogOverviewDeleteLayout = new javax.swing.GroupLayout(jDialogOverviewDelete.getContentPane());
        jDialogOverviewDelete.getContentPane().setLayout(jDialogOverviewDeleteLayout);
        jDialogOverviewDeleteLayout.setHorizontalGroup(
            jDialogOverviewDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogOverviewDeleteLayout.setVerticalGroup(
            jDialogOverviewDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialogFacilityInstrucHelp.setMinimumSize(new java.awt.Dimension(465, 200));

        jLabel101.setText("Use the scroll-panel to select the date and time you wish to hire an instructor");

        jLabel115.setText("You can book between 1 and 4 hours. (max 4 hours per day)");

        jLabel117.setText("You can book up to 4 hours, as long as you do not exceed 4 hours per day");

        jLabel118.setText("The cost of the instructor will be added to your check-out bill");

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel73.setText("Help");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel118)
                    .addComponent(jLabel115)
                    .addComponent(jLabel117)
                    .addComponent(jLabel101)
                    .addComponent(jLabel73))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel73)
                .addGap(18, 18, 18)
                .addComponent(jLabel101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel117)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel115)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel118)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialogFacilityInstrucHelpLayout = new javax.swing.GroupLayout(jDialogFacilityInstrucHelp.getContentPane());
        jDialogFacilityInstrucHelp.getContentPane().setLayout(jDialogFacilityInstrucHelpLayout);
        jDialogFacilityInstrucHelpLayout.setHorizontalGroup(
            jDialogFacilityInstrucHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialogFacilityInstrucHelpLayout.setVerticalGroup(
            jDialogFacilityInstrucHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogFacilityInstrucHelpLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jLabel4.setText("The chosen date & time is currently overbooked.");

        jLabel8.setText("Do you wish to be put on a waiting list?");

        jButtonWaitYes.setText("Yes");
        jButtonWaitYes.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonWaitYesActionPerformed(evt);
            }
        });

        jButtonWaitNo.setText("No");
        jButtonWaitNo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonWaitNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(26, 26, 26)))
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jButtonWaitYes)
                        .addGap(41, 41, 41)
                        .addComponent(jButtonWaitNo)
                        .addGap(136, 136, 136))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonWaitYes)
                    .addComponent(jButtonWaitNo))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogWaitOrNoLayout = new javax.swing.GroupLayout(jDialogWaitOrNo.getContentPane());
        jDialogWaitOrNo.getContentPane().setLayout(jDialogWaitOrNoLayout);
        jDialogWaitOrNoLayout.setHorizontalGroup(
            jDialogWaitOrNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogWaitOrNoLayout.setVerticalGroup(
            jDialogWaitOrNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel70.setText("Guestname");

        jLabelSignInGuestName.setVisible(false);
        jLabelSignInGuestName.setText("****");
        jLabelSignInGuestName.setToolTipText("");

        jLabel71.setText("GuestID");

        jButtonSignInMain.setText("Sign in");
        jButtonSignInMain.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSignInMainActionPerformed(evt);
            }
        });

        jButtonSignOutMain.setText("Sign out");
        jButtonSignOutMain.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSignOutMainActionPerformed(evt);
            }
        });

        jLabelSignInErrorMessage.setVisible(false);
        jLabelSignInErrorMessage.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabelSignInErrorMessage.setText("You have to write your guest ID in the box above");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSignInErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel70)
                            .addComponent(jLabel71))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jTextFieldSignInGuestID, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSignInMain, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSignOutMain))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabelSignInGuestName, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(jLabelSignInGuestName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonSignInMain, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonSignOutMain, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel71)
                        .addComponent(jTextFieldSignInGuestID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSignInErrorMessage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonOverviewEditBooking1.setText("Edit Booking");
        jButtonOverviewEditBooking1.setActionCommand("jButton9");
        jButtonOverviewEditBooking1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonOverviewEditBooking1ActionPerformed(evt);
            }
        });

        jButtonOverviewDeleteBooking1.setText("Delete Booking");
        jButtonOverviewDeleteBooking1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonOverviewDeleteBooking1ActionPerformed(evt);
            }
        });

        jButtonOverviewHelp.setText("Help");
        jButtonOverviewHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonOverviewHelpActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jListBookedOverview);

        jLabel69.setText("You have booked following facilities:");

        jButtonLoadBookings.setText("Load Bookings");
        jButtonLoadBookings.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonLoadBookingsActionPerformed(evt);
            }
        });

        jLabelPleaseSelectBooking.setText("*booking error mess*");
        jLabelPleaseSelectBooking.setVisible(false);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonOverviewDeleteBooking1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonOverviewEditBooking1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonOverviewHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLoadBookings)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelPleaseSelectBooking, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(jButtonLoadBookings)
                    .addComponent(jLabelPleaseSelectBooking))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jButtonOverviewEditBooking1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonOverviewDeleteBooking1)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonOverviewHelp)
                        .addGap(32, 32, 32))))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jComboBoxOverviewTimeFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8.00 - 9.00", "9.00 - 10.00", "10.00 - 11.00", "11.00 - 12.00", "12.00 - 13.00", "13.00 - 14.00", "14.00 - 15.00", "15.00 - 16.00", "16.00 - 17.00", "17.00 - 18.00", "18.00 - 19.00", "19.00 - 20.00" }));
        jComboBoxOverviewTimeFrom.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxOverviewTimeFromActionPerformed(evt);
            }
        });

        jButtonGetWaitOverview.setText("Refresh");
        jButtonGetWaitOverview.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonGetWaitOverviewActionPerformed(evt);
            }
        });

        jLabel37.setText("From:");

        jComboBoxOverviewFacility.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Badminton", "Handball", "Volleyball", "Tennis", "Fitness" }));

        jComboBoxOverviewSelectDate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxOverviewSelectDateActionPerformed(evt);
            }
        });

        jLabel36.setText("Date:");

        jLabel9.setText("Facility:");

        jScrollPane3.setViewportView(jListWaitOverview);

        jLabel91.setText("Waiting List:");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel91)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jComboBoxOverviewSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxOverviewTimeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jComboBoxOverviewFacility, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jButtonGetWaitOverview, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel91)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxOverviewSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxOverviewTimeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel37))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jComboBoxOverviewFacility, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonGetWaitOverview, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButtonPrintInstrucCost.setText("Print current balance for instructor cost");
        jButtonPrintInstrucCost.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonPrintInstrucCostActionPerformed(evt);
            }
        });

        jLabelOverviewBillPrintDone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelOverviewBillPrintDone.setVisible(false);
        jLabelOverviewBillPrintDone.setText("*printed mess*");

        javax.swing.GroupLayout jPanel5OverviewLayout = new javax.swing.GroupLayout(jPanel5Overview);
        jPanel5Overview.setLayout(jPanel5OverviewLayout);
        jPanel5OverviewLayout.setHorizontalGroup(
            jPanel5OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5OverviewLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel5OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel5OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonPrintInstrucCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelOverviewBillPrintDone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(72, 72, 72))
        );
        jPanel5OverviewLayout.setVerticalGroup(
            jPanel5OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5OverviewLayout.createSequentialGroup()
                .addGroup(jPanel5OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5OverviewLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5OverviewLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jButtonPrintInstrucCost)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelOverviewBillPrintDone)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Overview", jPanel5Overview);

        jPanel1Badminton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel7.setText("The facilities are available between 8am - 8pm every day");
        jPanel1Badminton.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 330, -1));

        jLabel19.setText("<html>Badminton is a racquet sport usually played individually against each other <br>but can also be a 2v2 team sport. Bring your sweaty pants <br> and prepare for loads of fun and action in a game of strength, speed and <br> skills. Our highly experienced instructors are always available for hire</html>");
        jLabel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1Badminton.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 410, 134));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("BADMINTON");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Badminton.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 130, 30));

        jLabel105.setText("<html>Useful info: <br> There are a total of 4 badminton courts, each with 4 players max/court. <br> The equipment will be given to you.");
        jPanel1Badminton.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 267, 76));

        jLabelBadmintonErrorMessageBook.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelBadmintonErrorMessageBook.setVisible(false);
        jLabelBadmintonErrorMessageBook.setText("The hours you have selected are not eligible");
        jPanel1Badminton.add(jLabelBadmintonErrorMessageBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, -1, -1));

        jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setText("Select the date and hour/hours you wish to play");

        jLabel17.setText("Date:");

        jComboBoxBadmintonSelectDate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxBadmintonSelectDateActionPerformed(evt);
            }
        });

        jLabel29.setText("From:");

        jComboBoxBadmintonTimeFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8.00 - 9.00", "9.00 - 10.00", "10.00 - 11.00", "11.00 - 12.00", "12.00 - 13.00", "13.00 - 14.00", "14.00 - 15.00", "15.00 - 16.00", "16.00 - 17.00", "17.00 - 18.00", "18.00 - 19.00", "19.00 - 20.00" }));
        jComboBoxBadmintonTimeFrom.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxBadmintonTimeFromActionPerformed(evt);
            }
        });

        jButtonBadmintonHelp.setText("Help");
        jButtonBadmintonHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBadmintonHelpActionPerformed(evt);
            }
        });

        jLabel28.setText("(max 4 facilities allowed per guest/day)");

        jLabel2.setText("Do you wish to hire an instructor?");

        jCheckBoxBadmintonInstruct.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jCheckBoxBadmintonInstructActionPerformed(evt);
            }
        });

        jLabelBadmintonCostText.setText("The following amount will be added to your bill: $30");
        jLabelBadmintonCostText.setVisible(false);

        jButtonBookBadminton.setText("BOOK");
        jButtonBookBadminton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBookBadmintonActionPerformed(evt);
            }
        });

        jLabelBadmintonErrorMessageNoHours.setVisible(false);
        jLabelBadmintonErrorMessageNoHours.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelBadmintonErrorMessageNoHours.setText("You have to specify the number of hours you wish to hire an instructor");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(12, 12, 12)
                                .addComponent(jComboBoxBadmintonSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxBadmintonTimeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabelBadmintonCostText, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(111, 111, 111)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jButtonBadmintonHelp)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonBookBadminton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel16))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(jLabel28))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel2)
                                .addGap(8, 8, 8)
                                .addComponent(jCheckBoxBadmintonInstruct, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelBadmintonErrorMessageNoHours, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel17))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jComboBoxBadmintonSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel29))
                            .addComponent(jButtonBadmintonHelp)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxBadmintonTimeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jLabel28)
                .addGap(9, 9, 9)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxBadmintonInstruct, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBadmintonCostText)
                    .addComponent(jButtonBookBadminton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelBadmintonErrorMessageNoHours)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Badminton.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 610, 210));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/BadmintonRESIZED.jpg"))); // NOI18N
        jPanel1Badminton.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, -1, -1));

        jLabelBadmintonBookDone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelBadmintonBookDone.setVisible(false);
        jLabelBadmintonBookDone.setText("Booking accepted!");
        jPanel1Badminton.add(jLabelBadmintonBookDone, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 270, -1));

        jTabbedPane1.addTab("Badminton", jPanel1Badminton);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel57.setText("The facilities are available between 8am - 8pm every day");
        jPanel5.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 484, 320, -1));

        jLabel25.setText("<html> Outdoor golf in a huge area in an exotic environment. <br> You dont have to book time just show up and swing your club.");
        jLabel25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jLabel108.setText("<html>Useful info: <br> There are no player limits on this facility.<br> The equipment will be given to you.");
        jPanel5.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, -1, -1));

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel58.setText("GOLF");
        jPanel5.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel67.setText("Do you wish to hire an instructor?");
        jPanel17.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 15, -1, 25));

        jCheckBoxGolfInstruct.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jCheckBoxGolfInstructActionPerformed(evt);
            }
        });
        jPanel17.add(jCheckBoxGolfInstruct, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 15, -1, -1));

        jLabelGolfInstructorDateTimeInfo.setText("On which date and time:");
        jPanel17.add(jLabelGolfInstructorDateTimeInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 65, -1, -1));
        jLabelGolfInstructorDateTimeInfo.setVisible(false);

        jLabelGolfInstructorDate.setText("Date:");
        jLabelGolfInstructorDate.setVisible(false);
        jPanel17.add(jLabelGolfInstructorDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 81, -1, 30));

        jComboBoxGolfInstructorDate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxGolfInstructorDateActionPerformed(evt);
            }
        });
        jComboBoxGolfInstructorDate.setVisible(false);
        jPanel17.add(jComboBoxGolfInstructorDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 85, 168, -1));

        jLabelGolfInstructorTimeFrom.setText("From:");
        jLabelGolfInstructorTimeFrom.setVisible(false);
        jPanel17.add(jLabelGolfInstructorTimeFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 85, -1, 20));

        jComboBoxGolfInstructorTimeFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8.00 - 9.00", "9.00 - 10.00", "10.00 - 11.00", "11.00 - 12.00", "12.00 - 13.00", "13.00 - 14.00", "14.00 - 15.00", "15.00 - 16.00", "16.00 - 17.00", "17.00 - 18.00", "18.00 - 19.00", "19.00 - 20.00" }));
        jComboBoxGolfInstructorTimeFrom.setVisible(false);
        jPanel17.add(jComboBoxGolfInstructorTimeFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 85, 100, -1));

        jButtonGolfHelp.setVisible(false);
        jButtonGolfHelp.setText("Help");
        jButtonGolfHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonGolfHelpActionPerformed(evt);
            }
        });
        jPanel17.add(jButtonGolfHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 85, -1, -1));

        jButtonBookGolf.setVisible(false);
        jButtonBookGolf.setText("BOOK");
        jButtonBookGolf.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBookGolfActionPerformed(evt);
            }
        });
        jPanel17.add(jButtonBookGolf, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 132, 101, 43));

        jLabelGolfCostText.setVisible(false);
        jLabelGolfCostText.setText("The following amount will be added to your bill: $40");
        jPanel17.add(jLabelGolfCostText, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 145, -1, -1));

        jLabelGolfErrorAlreadyBook.setVisible(false);
        jLabelGolfErrorAlreadyBook.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelGolfErrorAlreadyBook.setText("You have already booked this");
        jPanel17.add(jLabelGolfErrorAlreadyBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 180, -1));

        jPanel5.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 560, 210));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/GolfRESIZED.jpg"))); // NOI18N
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, -1, -1));

        jLabelGolfBookDone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelGolfBookDone.setVisible(false);
        jLabelGolfBookDone.setText("Booking accepted!");
        jPanel5.add(jLabelGolfBookDone, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 270, -1));

        javax.swing.GroupLayout jPanel3GolfLayout = new javax.swing.GroupLayout(jPanel3Golf);
        jPanel3Golf.setLayout(jPanel3GolfLayout);
        jPanel3GolfLayout.setHorizontalGroup(
            jPanel3GolfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3GolfLayout.setVerticalGroup(
            jPanel3GolfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3GolfLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Golf", jPanel3Golf);

        jLabel42.setText("The facilities are available between 8am - 8pm every day");

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("<html>Handball is a teamsport usually 6 players on each team. <br> Test your accuracy and have fun with your teammates. ");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        jLabel106.setText("<html>Useful info: <br> There are a total of 2 Handball courts, each with 12 players max/court. <br> The handballs will of cause be given to you.");
        jPanel8.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 320, 78));

        jLabel107.setText("<html>please note that if too few people have <br> booked within the given time, the facility will be cancelled.");
        jPanel8.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, -1, -1));

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel43.setText("HANDBALL");
        jPanel8.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel64.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel64.setText("The facilities are available between 8am - 8pm every day");
        jPanel8.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 484, 320, -1));

        jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel45.setText("Select the date and hour/hours you wish to play");

        jLabel46.setText("Date");

        jLabel47.setText("From:");

        jComboBoxHandballTimeFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8.00 - 9.00", "9.00 - 10.00", "10.00 - 11.00", "11.00 - 12.00", "12.00 - 13.00", "13.00 - 14.00", "14.00 - 15.00", "15.00 - 16.00", "16.00 - 17.00", "17.00 - 18.00", "18.00 - 19.00", "19.00 - 20.00" }));

        jButtonHandBallHelp.setText("Help");
        jButtonHandBallHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonHandBallHelpActionPerformed(evt);
            }
        });

        jLabel51.setText("(max 4 facilities allowed per guest/day)");

        jButtonBookHandball.setText("BOOK");
        jButtonBookHandball.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBookHandballActionPerformed(evt);
            }
        });

        jLabelHandballErrorMessageBook.setVisible(false);
        jLabelHandballErrorMessageBook.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelHandballErrorMessageBook.setText("The hours you have selected are not eligible");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addGap(12, 12, 12)
                        .addComponent(jComboBoxHandballSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel47)
                        .addGap(12, 12, 12)
                        .addComponent(jComboBoxHandballTimeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jButtonHandBallHelp))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jLabel51)))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelHandballErrorMessageBook)
                .addGap(48, 48, 48)
                .addComponent(jButtonBookHandball, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel46))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jComboBoxHandballSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel47))
                            .addComponent(jButtonHandBallHelp)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jComboBoxHandballTimeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBookHandball, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHandballErrorMessageBook, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel8.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 630, 190));

        jLabelHandballBookDone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelHandballBookDone.setVisible(false);
        jLabelHandballBookDone.setText("Booking accepted!");
        jPanel8.add(jLabelHandballBookDone, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 270, -1));

        jLabel32.setPreferredSize(new java.awt.Dimension(320, 200));

        javax.swing.GroupLayout jPanel1HandballLayout = new javax.swing.GroupLayout(jPanel1Handball);
        jPanel1Handball.setLayout(jPanel1HandballLayout);
        jPanel1HandballLayout.setHorizontalGroup(
            jPanel1HandballLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1HandballLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel42))
            .addGroup(jPanel1HandballLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(332, 332, 332))
            .addGroup(jPanel1HandballLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1HandballLayout.setVerticalGroup(
            jPanel1HandballLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1HandballLayout.createSequentialGroup()
                .addGroup(jPanel1HandballLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1HandballLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(243, 243, 243)
                .addComponent(jLabel42)
                .addGap(32, 32, 32))
        );

        jTabbedPane1.addTab("Handball", jPanel1Handball);

        jPanel4MountainBike.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setText("<html>Ride our bikes to the heights you desire. the country provides <br> plenty of roads and mountainbike paths. Its free to use and no <br> booking required, just show up choose your own path. ");
        jLabel26.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4MountainBike.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 194, -1, -1));

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel63.setText("MOUNTAIN BIKING");
        jPanel4MountainBike.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jLabel53.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel53.setText("The facilities are available between 8am - 8pm every day");
        jPanel4MountainBike.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 483, 322, -1));

        jLabel66.setText("This facility does not require Time-booking, it is free to use for any guest at our resort.");
        jPanel4MountainBike.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 42, -1, -1));

        jLabel109.setText("<html>Useful info: <br>There are no player limits on this facility. <br> The equipment will be given to you.");
        jPanel4MountainBike.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 372, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/bikingRESIZED.jpg"))); // NOI18N
        jPanel4MountainBike.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, -1, -1));

        jTabbedPane1.addTab("Mountain Biking", jPanel4MountainBike);

        jPanel6TableTennis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setText("<html>We have placed a tabletennis in the hall, where you can go and play without booking first. <br> A classic fun little activity for people at all ages.");
        jLabel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6TableTennis.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 179, 316, -1));

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel60.setText("TABLE TENNIS");
        jPanel6TableTennis.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jLabel54.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel54.setText("The facilities are available between 8am - 8pm every day");
        jPanel6TableTennis.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 483, 320, -1));

        jLabel65.setText("This facility does not require Time-booking, it is free to use for any guest at our resort.");
        jPanel6TableTennis.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 42, -1, -1));

        jLabel110.setText("<html> Useful info: <br> The equipment will be given to you.");
        jPanel6TableTennis.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/bordtennisRESIZED.jpg"))); // NOI18N
        jPanel6TableTennis.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, -1));

        jTabbedPane1.addTab("Table Tennis", jPanel6TableTennis);

        jPanel8Volleyball.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setText("<html>Playing volleyball is a great way to meet the other guests at the resort.<br> Sign-up at your preferred time and you will join a team consisting of other<br> guests and compete and have fun.");
        jLabel23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8Volleyball.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel35.setText("The facilities are available between 8am - 8pm every day");
        jPanel8Volleyball.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 483, 324, -1));

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel62.setText("VOLLEYBALL");
        jPanel8Volleyball.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jLabel111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel111.setText("<html> Useful info: <br>  There are a total of 2 volleyball courts, each with 12 players max/court. <br> The equipment will be given to you.");
        jPanel8Volleyball.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 284, -1));

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel74.setText("Select the date and hour/hours you wish to play");
        jPanel9.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 15, -1, -1));

        jLabel75.setText("Date:");
        jPanel9.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 53, -1, -1));

        jComboBoxVolleyballSelectDate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxVolleyballSelectDateActionPerformed(evt);
            }
        });
        jPanel9.add(jComboBoxVolleyballSelectDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 50, 170, -1));

        jLabel76.setText("From:");
        jPanel9.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 53, -1, -1));

        jComboBoxVolleyballTimeFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8.00 - 9.00", "9.00 - 10.00", "10.00 - 11.00", "11.00 - 12.00", "12.00 - 13.00", "13.00 - 14.00", "14.00 - 15.00", "15.00 - 16.00", "16.00 - 17.00", "17.00 - 18.00", "18.00 - 19.00", "19.00 - 20.00" }));
        jPanel9.add(jComboBoxVolleyballTimeFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 50, 110, -1));

        jButtonVolleybalHelp.setText("Help");
        jButtonVolleybalHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonVolleybalHelpActionPerformed(evt);
            }
        });
        jPanel9.add(jButtonVolleybalHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 49, -1, -1));

        jLabel52.setText("(max 4 facilities allowed per guest/day)");
        jPanel9.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        jButtonBookVolley.setText("BOOK");
        jButtonBookVolley.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBookVolleyActionPerformed(evt);
            }
        });
        jPanel9.add(jButtonBookVolley, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 101, 43));

        jLabelVolleyballNoSignText.setText("The current number of sign-ups for the chosen time:");
        jPanel9.add(jLabelVolleyballNoSignText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabelVolleyballNoSign.setText("***");
        jPanel9.add(jLabelVolleyballNoSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        jButtonVolleyballRefreshAmount.setText("Refresh");
        jButtonVolleyballRefreshAmount.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonVolleyballRefreshAmountActionPerformed(evt);
            }
        });
        jPanel9.add(jButtonVolleyballRefreshAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, 16));

        jLabelVolleyballErrorMessageBook.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelVolleyballErrorMessageBook.setVisible(false);
        jLabelVolleyballErrorMessageBook.setText("The hours you have selected are not eligible");
        jPanel9.add(jLabelVolleyballErrorMessageBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 290, -1));

        jPanel8Volleyball.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 550, 210));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/volleyballRESIZED.jpg"))); // NOI18N
        jPanel8Volleyball.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, -1, -1));

        jLabelVolleyballBookDone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelVolleyballBookDone.setVisible(false);
        jLabelVolleyballBookDone.setText("Booking accepted!");
        jPanel8Volleyball.add(jLabelVolleyballBookDone, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 270, -1));

        jTabbedPane1.addTab("Volleyball", jPanel8Volleyball);

        jPanel7Tennis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel61.setText("TENNIS");
        jPanel7Tennis.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel78.setText("Select the date and hour/hours you wish to play");
        jPanel10.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel79.setText("Date:");
        jPanel10.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 20));

        jComboBoxTennisSelectDate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxTennisSelectDateActionPerformed(evt);
            }
        });
        jPanel10.add(jComboBoxTennisSelectDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 176, -1));

        jLabel86.setText("From:");
        jPanel10.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, 20));

        jComboBoxTennisTimeFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8.00 - 9.00", "9.00 - 10.00", "10.00 - 11.00", "11.00 - 12.00", "12.00 - 13.00", "13.00 - 14.00", "14.00 - 15.00", "15.00 - 16.00", "16.00 - 17.00", "17.00 - 18.00", "18.00 - 19.00", "19.00 - 20.00" }));
        jPanel10.add(jComboBoxTennisTimeFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 140, -1));

        jButtonTennisHelp.setText("Help");
        jButtonTennisHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonTennisHelpActionPerformed(evt);
            }
        });
        jPanel10.add(jButtonTennisHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        jLabel68.setText("(max 4 facilities allowed per guest/day)");
        jPanel10.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        jLabel6.setText("Do you wish to hire an instructor?");
        jPanel10.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 20));

        jCheckBoxTennisInstruct.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jCheckBoxTennisInstructActionPerformed(evt);
            }
        });
        jPanel10.add(jCheckBoxTennisInstruct, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        jLabelTennisCostText.setText("The following amount will be added to your bill: $30");
        jLabelTennisCostText.setVisible(false);
        jPanel10.add(jLabelTennisCostText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jButtonBookTennis.setText("BOOK");
        jButtonBookTennis.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBookTennisActionPerformed(evt);
            }
        });
        jPanel10.add(jButtonBookTennis, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 101, 43));

        jLabelTennisErrorMessageBook.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTennisErrorMessageBook.setVisible(false);
        jLabelTennisErrorMessageBook.setText("The hours you have selected are not eligible");
        jPanel10.add(jLabelTennisErrorMessageBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        jPanel7Tennis.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 550, 250));

        jLabel112.setText("<html>Useful info: <br> There are a total of 6 tennis courts, each with 4 players max/court. <br> The equipment will be given to you.");
        jPanel7Tennis.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 312, -1));

        jLabelGUIISBULLSHIT.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabelGUIISBULLSHIT.setText("The facilities are available between 8am - 8pm every day");
        jPanel7Tennis.add(jLabelGUIISBULLSHIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 484, 320, -1));

        jLabelTennisErrorMessageNoHours.setVisible(false);
        jLabelTennisErrorMessageNoHours.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTennisErrorMessageNoHours.setText("You have to specify the number of hours you wish to hire an instructor");
        jPanel7Tennis.add(jLabelTennisErrorMessageNoHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 360, -1));

        jLabel20.setText("<html> At Casablanca we have 6 state-of- the-art tennis courts. <br> You have the choice to book one of our highly experienced instructors, <br> who can make your game even better, or play with whoever you want.<html>");
        jLabel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7Tennis.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/TennisRESIZED.jpg"))); // NOI18N
        jPanel7Tennis.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, -1, -1));

        jLabelTennisBookDone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTennisBookDone.setVisible(false);
        jLabelTennisBookDone.setText("Booking accepted!");
        jPanel7Tennis.add(jLabelTennisBookDone, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 270, -1));

        jTabbedPane1.addTab("Tennis", jPanel7Tennis);

        jPanel5Swimming.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setText("<html>Due to Marocco's hot climate, we highly recommend that you <br> try our beautiful swimming pool. It is great fun and great <br> excercise which you can do on your own or with other guests. ");
        jLabel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5Swimming.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 115, -1, -1));

        jLabel41.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel41.setText("The facilities are available between 8am - 8pm every day");
        jPanel5Swimming.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, -1, -1));

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel59.setText("SWIMMING");
        jPanel5Swimming.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jLabel114.setText("<html>Useful info: <br>There are no guest limits for this facility.");
        jPanel5Swimming.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, -1, -1));

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBoxSwimmingInstruct.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jCheckBoxSwimmingInstructActionPerformed(evt);
            }
        });
        jPanel12.add(jCheckBoxSwimmingInstruct, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel85.setText("Do you wish to hire an instructor?");
        jPanel12.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 15, -1, -1));

        jLabelSwimmingInstructorDateTimeInfo.setText("On which date and time:");
        jLabelSwimmingInstructorDateTimeInfo.setVisible(false);
        jPanel12.add(jLabelSwimmingInstructorDateTimeInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 50, -1, -1));

        jLabelSwimmingInstructorDate.setText("Date:");
        jLabelSwimmingInstructorDate.setVisible(false);
        jPanel12.add(jLabelSwimmingInstructorDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 95, -1, -1));

        jComboBoxSwimmingInstructorDate.setVisible(false);
        jPanel12.add(jComboBoxSwimmingInstructorDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 92, 145, -1));

        jLabelSwimmingInstructorTimeFrom.setText("From:");
        jLabelSwimmingInstructorTimeFrom.setVisible(false);
        jPanel12.add(jLabelSwimmingInstructorTimeFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 95, -1, -1));

        jComboBoxSwimmingInstructorTimeFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8.00 - 9.00", "9.00 - 10.00", "10.00 - 11.00", "11.00 - 12.00", "12.00 - 13.00", "13.00 - 14.00", "14.00 - 15.00", "15.00 - 16.00", "16.00 - 17.00", "17.00 - 18.00", "18.00 - 19.00", "19.00 - 20.00" }));
        jComboBoxSwimmingInstructorTimeFrom.setVisible(false);
        jPanel12.add(jComboBoxSwimmingInstructorTimeFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 92, 130, -1));

        jLabelSwimmingInstructorPrice.setVisible(false);
        jLabelSwimmingInstructorPrice.setText("The following amount will be added to your bill: $40 ");
        jPanel12.add(jLabelSwimmingInstructorPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jButtonBookSwimming.setVisible(false);
        jButtonBookSwimming.setText("BOOK");
        jButtonBookSwimming.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBookSwimmingActionPerformed(evt);
            }
        });
        jPanel12.add(jButtonBookSwimming, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 134, 101, 43));

        jButtonSwimmingHelp.setVisible(false);
        jButtonSwimmingHelp.setText("Help");
        jButtonSwimmingHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSwimmingHelpActionPerformed(evt);
            }
        });
        jPanel12.add(jButtonSwimmingHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 91, -1, -1));

        jPanel5Swimming.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 244, 540, 190));

        jLabelSwimmingErrorMessageNoHours.setVisible(false);
        jLabelSwimmingErrorMessageNoHours.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelSwimmingErrorMessageNoHours.setText("You have already booked this");
        jPanel5Swimming.add(jLabelSwimmingErrorMessageNoHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 180, -1));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/SwimmingRESIZED.jpg"))); // NOI18N
        jPanel5Swimming.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, -1, -1));

        jLabelSwimingBookDone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSwimingBookDone.setVisible(false);
        jLabelSwimingBookDone.setText("Booking accepted!");
        jPanel5Swimming.add(jLabelSwimingBookDone, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 270, -1));

        jTabbedPane1.addTab("Swimming", jPanel5Swimming);

        jPanelGolf.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setText("<html>Our Fitness room allows you to train your body exactly how you want it.<br> The fitness center has all kinds of equipment so there is something for everyone.");
        jLabel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelGolf.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel113.setText("<html>Useful info: <br> The Fitness room limits 20 people. <br> The equipment be given to you.");
        jPanelGolf.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, -1, -1));

        jLabel50.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel50.setText("The facilities are available between 8am - 8pm every day");
        jPanelGolf.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 320, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("FITNESS CENTER");
        jPanelGolf.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 154, -1));

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel30.setText("Select the date and hour/hours you wish use the Fitness center.");

        jComboBoxFitnessSelectDate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxFitnessSelectDateActionPerformed(evt);
            }
        });

        jLabel33.setText("From:");

        jLabel44.setText("(max 4 hours allowed per guest/day)");

        jComboBoxFitnessTimeFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8.00 - 9.00", "9.00 - 10.00", "10.00 - 11.00", "11.00 - 12.00", "12.00 - 13.00", "13.00 - 14.00", "14.00 - 15.00", "15.00 - 16.00", "16.00 - 17.00", "17.00 - 18.00", "18.00 - 19.00", "19.00 - 20.00" }));
        jComboBoxFitnessTimeFrom.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxFitnessTimeFromActionPerformed(evt);
            }
        });

        jButtonBookFitness.setText("BOOK");
        jButtonBookFitness.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBookFitnessActionPerformed(evt);
            }
        });

        jButtonFitnessHelp.setText("Help");
        jButtonFitnessHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonFitnessHelpActionPerformed(evt);
            }
        });

        jLabel31.setText("Date:");

        jLabelFitnessErrorMessageBook1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelFitnessErrorMessageBook1.setVisible(false);
        jLabelFitnessErrorMessageBook1.setText("The hours you have selected are not eligible");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxFitnessSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel33)
                        .addGap(7, 7, 7)
                        .addComponent(jComboBoxFitnessTimeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jButtonFitnessHelp))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel44)))
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelFitnessErrorMessageBook1)
                .addGap(18, 18, 18)
                .addComponent(jButtonBookFitness, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addGap(19, 19, 19)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxFitnessSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel31))
                    .addComponent(jComboBoxFitnessTimeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFitnessHelp)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel33)))
                .addGap(7, 7, 7)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBookFitness, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFitnessErrorMessageBook1))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanelGolf.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 580, 170));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fitness CenterRESIZED.jpg"))); // NOI18N
        jPanelGolf.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, -1, -1));

        jLabelFitnessBookDone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelFitnessBookDone.setVisible(false);
        jLabelFitnessBookDone.setText("Booking accepted!");
        jPanelGolf.add(jLabelFitnessBookDone, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 270, -1));

        javax.swing.GroupLayout jPanel2FitnessLayout = new javax.swing.GroupLayout(jPanel2Fitness);
        jPanel2Fitness.setLayout(jPanel2FitnessLayout);
        jPanel2FitnessLayout.setHorizontalGroup(
            jPanel2FitnessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGolf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2FitnessLayout.setVerticalGroup(
            jPanel2FitnessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2FitnessLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGolf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Fitness", jPanel2Fitness);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1028, 577));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxSwimmingInstructActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBoxSwimmingInstructActionPerformed
    {//GEN-HEADEREND:event_jCheckBoxSwimmingInstructActionPerformed
        if(jCheckBoxSwimmingInstruct.isSelected())
        {
            jLabelSwimmingInstructorPrice.setVisible(true);
            jLabelSwimmingInstructorDate.setVisible(true);
            jLabelSwimmingInstructorDateTimeInfo.setVisible(true);
            jLabelSwimmingInstructorTimeFrom.setVisible(true);
            jComboBoxSwimmingInstructorDate.setVisible(true);
            jComboBoxSwimmingInstructorTimeFrom.setVisible(true);
            jButtonBookSwimming.setVisible(true);
            jButtonSwimmingHelp.setVisible(true);
        } else
        {
            jLabelSwimmingInstructorPrice.setVisible(false);
            jLabelSwimmingInstructorDate.setVisible(false);
            jLabelSwimmingInstructorDateTimeInfo.setVisible(false);
            jLabelSwimmingInstructorTimeFrom.setVisible(false);
            jComboBoxSwimmingInstructorDate.setVisible(false);
            jComboBoxSwimmingInstructorTimeFrom.setVisible(false);
            jButtonBookSwimming.setVisible(false);
            jButtonSwimmingHelp.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBoxSwimmingInstructActionPerformed

    private void jComboBoxTennisSelectDateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxTennisSelectDateActionPerformed
    {//GEN-HEADEREND:event_jComboBoxTennisSelectDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTennisSelectDateActionPerformed

    private void jCheckBoxTennisInstructActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBoxTennisInstructActionPerformed
    {//GEN-HEADEREND:event_jCheckBoxTennisInstructActionPerformed
        if(jCheckBoxTennisInstruct.isSelected()) {
            jLabelTennisCostText.setVisible(true);
        } else {
            jLabelTennisCostText.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBoxTennisInstructActionPerformed

    private void jComboBoxVolleyballSelectDateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxVolleyballSelectDateActionPerformed
    {//GEN-HEADEREND:event_jComboBoxVolleyballSelectDateActionPerformed
       
    }//GEN-LAST:event_jComboBoxVolleyballSelectDateActionPerformed

    private void jButtonBookHandballActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBookHandballActionPerformed
    {//GEN-HEADEREND:event_jButtonBookHandballActionPerformed
        tempFacID = "3"; 
        jLabelHandballErrorMessageBook.setVisible(false);
        jLabelHandballBookDone.setVisible(false);
        if(doubleBook(tempFacID, jComboBoxHandballSelectDate.getSelectedItem().toString(),
                jComboBoxHandballTimeFrom.getSelectedIndex()+8+".00",
                jComboBoxHandballTimeFrom.getSelectedIndex()+9+".00")==false) {
            if(select.getfacAvail(tempFacID, jComboBoxHandballSelectDate.getSelectedItem().toString(),
                    jComboBoxHandballTimeFrom.getSelectedIndex()+8+".00",
                    jComboBoxHandballTimeFrom.getSelectedIndex()+9+".00").size() < 12) 
            {
                        jLabelHandballErrorMessageBook.setVisible(false);
                        String handballDate = (String)jComboBoxHandballSelectDate.getSelectedItem();
                        String handballTimeFrom = jComboBoxHandballTimeFrom.getSelectedIndex()+8+".00";
                        String handballTimeTo = jComboBoxHandballTimeFrom.getSelectedIndex()+9+".00";
                        insert.JDBCInsertFacility(finalGuestID, tempFacID, handballDate, handballTimeFrom, handballTimeTo, "N");
                        jLabelHandballBookDone.setVisible(true);
                    
            } else {waitNoPop();}
        } else {
            jLabelHandballErrorMessageBook.setText("You have already booked this");
            jLabelHandballErrorMessageBook.setVisible(true);
        }     
        
    }//GEN-LAST:event_jButtonBookHandballActionPerformed

    private void jCheckBoxGolfInstructActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBoxGolfInstructActionPerformed
    {//GEN-HEADEREND:event_jCheckBoxGolfInstructActionPerformed
        if(jCheckBoxGolfInstruct.isSelected())
        {
            jLabelGolfCostText.setVisible(true);
            jLabelGolfInstructorDateTimeInfo.setVisible(true);
            jLabelGolfInstructorDate.setVisible(true);
            jLabelGolfInstructorTimeFrom.setVisible(true);
            jComboBoxGolfInstructorDate.setVisible(true);
            jComboBoxGolfInstructorTimeFrom.setVisible(true);
            jButtonGolfHelp.setVisible(true);
            jButtonBookGolf.setVisible(true);
        } else
        {
            jLabelGolfCostText.setVisible(false);
            jLabelGolfInstructorDateTimeInfo.setVisible(false);
            jLabelGolfInstructorDate.setVisible(false);
            jLabelGolfInstructorTimeFrom.setVisible(false);
            jComboBoxGolfInstructorDate.setVisible(false);
            jComboBoxGolfInstructorTimeFrom.setVisible(false);
            jButtonGolfHelp.setVisible(false);
            jButtonBookGolf.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBoxGolfInstructActionPerformed

    private void jComboBoxFitnessSelectDateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxFitnessSelectDateActionPerformed
    {//GEN-HEADEREND:event_jComboBoxFitnessSelectDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFitnessSelectDateActionPerformed

    private void jComboBoxFitnessTimeFromActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxFitnessTimeFromActionPerformed
    {//GEN-HEADEREND:event_jComboBoxFitnessTimeFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFitnessTimeFromActionPerformed

    private void jButtonOverviewDeleteBooking1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonOverviewDeleteBooking1ActionPerformed
    {//GEN-HEADEREND:event_jButtonOverviewDeleteBooking1ActionPerformed
        if(jListBookedOverview.isSelectionEmpty()) {
            jLabelPleaseSelectBooking.setVisible(true);
            jLabelPleaseSelectBooking.setText("Please select a booking på delete or edit");
        } else {
            jDialogOverviewDelete.setVisible(true);
            jDialogOverviewDelete.setLocation(900, 300);
        }
    }//GEN-LAST:event_jButtonOverviewDeleteBooking1ActionPerformed

    private void jButtonOverviewEditBooking1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonOverviewEditBooking1ActionPerformed
    {//GEN-HEADEREND:event_jButtonOverviewEditBooking1ActionPerformed
        if(jListBookedOverview.isSelectionEmpty()) {
            jLabelPleaseSelectBooking.setVisible(true);
            jLabelPleaseSelectBooking.setText("Please select a booking på delete or edit");
        } else {
            tempFacID=convertFac(jListBookedOverview.getSelectedValue().toString());
            jLabelCurrentBooking.setText("Current booking: "+jListBookedOverview.getSelectedValue().toString());
            String[] list = getComboBoxListFromToday();
            jComboBoxOverviewEditBookingDate1.setModel(new javax.swing.DefaultComboBoxModel(list));
            jDialogOverviewEditBooking.setVisible(true);
            jDialogOverviewEditBooking.setLocation(400, 250);
        }
    }//GEN-LAST:event_jButtonOverviewEditBooking1ActionPerformed

    private void jButtonBadmintonHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBadmintonHelpActionPerformed
    {//GEN-HEADEREND:event_jButtonBadmintonHelpActionPerformed
        jDialogFacilityHelp.setVisible(true);
        jDialogFacilityHelp.setLocation(700, 250);
    }//GEN-LAST:event_jButtonBadmintonHelpActionPerformed

    private void jCheckBoxBadmintonInstructActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBoxBadmintonInstructActionPerformed
    {//GEN-HEADEREND:event_jCheckBoxBadmintonInstructActionPerformed
        if(jCheckBoxBadmintonInstruct.isSelected()){
            jLabelBadmintonCostText.setVisible(true);
        } else {
            jLabelBadmintonCostText.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBoxBadmintonInstructActionPerformed

    private void jComboBoxBadmintonTimeFromActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxBadmintonTimeFromActionPerformed
    {//GEN-HEADEREND:event_jComboBoxBadmintonTimeFromActionPerformed

    }//GEN-LAST:event_jComboBoxBadmintonTimeFromActionPerformed

    private void jComboBoxBadmintonSelectDateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxBadmintonSelectDateActionPerformed
    {//GEN-HEADEREND:event_jComboBoxBadmintonSelectDateActionPerformed

    }//GEN-LAST:event_jComboBoxBadmintonSelectDateActionPerformed

    private void jButtonBookBadmintonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBookBadmintonActionPerformed
    {//GEN-HEADEREND:event_jButtonBookBadmintonActionPerformed
        tempFacID = "1";
        jLabelBadmintonBookDone.setVisible(false);
        jLabelBadmintonErrorMessageBook.setVisible(false);
        jLabelBadmintonErrorMessageNoHours.setVisible(false);
        tempGetFac = select.getfacAvail(tempFacID, jComboBoxBadmintonSelectDate.getSelectedItem().toString(), 
                    jComboBoxBadmintonTimeFrom.getSelectedIndex()+8+".00", 
                    jComboBoxBadmintonTimeFrom.getSelectedIndex()+9+".00");
        if(doubleBook(tempFacID, jComboBoxBadmintonSelectDate.getSelectedItem().toString(), 
                    jComboBoxBadmintonTimeFrom.getSelectedIndex()+8+".00", 
                    jComboBoxBadmintonTimeFrom.getSelectedIndex()+9+".00") == false )
            {   
            if (tempGetFac.size() < 4) 
                    {
                        jLabelBadmintonErrorMessageBook.setVisible(false);
                        jLabelBadmintonErrorMessageNoHours.setVisible(false);

                        if(jCheckBoxBadmintonInstruct.isSelected()){
                            String badmintonDate = (String)jComboBoxBadmintonSelectDate.getSelectedItem();
                            String badmintonTimeFrom = jComboBoxBadmintonTimeFrom.getSelectedIndex()+8+".00";
                            System.out.println(badmintonTimeFrom);
                            String badmintonTimeTo = jComboBoxBadmintonTimeFrom.getSelectedIndex()+9+".00";
                            insert.JDBCInsertFacility(finalGuestID, tempFacID, badmintonDate, badmintonTimeFrom, badmintonTimeTo, "Y");
                            insert.JDBCInsertInstructorCost(finalGuestID, "1", Integer.parseInt(tempFacID));
                            jLabelBadmintonErrorMessageNoHours.setVisible(false);   
                            jLabelBadmintonBookDone.setVisible(true);
                            
                        } else {
                            String badmintonDate = (String)jComboBoxBadmintonSelectDate.getSelectedItem();
                            String badmintonTimeFrom = jComboBoxBadmintonTimeFrom.getSelectedIndex()+8+".00";
                            String badmintonTimeTo = jComboBoxBadmintonTimeFrom.getSelectedIndex()+9+".00";
                            insert.JDBCInsertFacility(finalGuestID, tempFacID, badmintonDate, badmintonTimeFrom, badmintonTimeTo, "N");
                            insert.JDBCInsertInstructorCost(finalGuestID, "0", Integer.parseInt(tempFacID)); 
                            jLabelBadmintonBookDone.setVisible(true);
                        }  
                    } else {waitNoPop();}     
            } else {jLabelBadmintonErrorMessageBook.setText("You have already booked this");
                jLabelBadmintonErrorMessageBook.setVisible(true);}
                
    }//GEN-LAST:event_jButtonBookBadmintonActionPerformed

    private void jButtonVolleybalHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonVolleybalHelpActionPerformed
    {//GEN-HEADEREND:event_jButtonVolleybalHelpActionPerformed
        jDialogFacilityHelp.setVisible(true);
    }//GEN-LAST:event_jButtonVolleybalHelpActionPerformed

    private void jButtonHandBallHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonHandBallHelpActionPerformed
    {//GEN-HEADEREND:event_jButtonHandBallHelpActionPerformed
        jDialogFacilityHelp.setVisible(true);
    }//GEN-LAST:event_jButtonHandBallHelpActionPerformed

    private void jButtonFitnessHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonFitnessHelpActionPerformed
    {//GEN-HEADEREND:event_jButtonFitnessHelpActionPerformed
        jDialogFacilityHelp.setVisible(true);
    }//GEN-LAST:event_jButtonFitnessHelpActionPerformed

    private void jButtonTennisHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonTennisHelpActionPerformed
    {//GEN-HEADEREND:event_jButtonTennisHelpActionPerformed
        jDialogFacilityHelp.setVisible(true);
    }//GEN-LAST:event_jButtonTennisHelpActionPerformed

    private void jButtonOverviewHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonOverviewHelpActionPerformed
    {//GEN-HEADEREND:event_jButtonOverviewHelpActionPerformed
         jDialogOverviewHelp.setVisible(true);
         jDialogOverviewHelp.setLocation(800, 300);
    }//GEN-LAST:event_jButtonOverviewHelpActionPerformed

    private void jComboBoxOverviewEditBookingDate1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxOverviewEditBookingDate1ActionPerformed
    {//GEN-HEADEREND:event_jComboBoxOverviewEditBookingDate1ActionPerformed

    }//GEN-LAST:event_jComboBoxOverviewEditBookingDate1ActionPerformed

    private void jButtonBookFitnessActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBookFitnessActionPerformed
    {//GEN-HEADEREND:event_jButtonBookFitnessActionPerformed
        tempFacID="9";
        jLabelFitnessErrorMessageBook1.setVisible(false);
        jLabelFitnessBookDone.setVisible(false);
        if(doubleBook(tempFacID, jComboBoxFitnessSelectDate.getSelectedItem().toString(), 
            jComboBoxFitnessTimeFrom.getSelectedIndex()+8+".00", 
            jComboBoxFitnessTimeFrom.getSelectedIndex()+9+".00")==false) {
            if(select.getfacAvail(tempFacID, jComboBoxFitnessSelectDate.getSelectedItem().toString(), 
                jComboBoxFitnessTimeFrom.getSelectedIndex()+8+".00", 
                jComboBoxFitnessTimeFrom.getSelectedIndex()+9+".00").size() < 20)
                {
                    String fitnessDate = (String)jComboBoxFitnessSelectDate.getSelectedItem();
                    String fitnessTimeFrom = jComboBoxFitnessTimeFrom.getSelectedIndex()+8+".00";
                    String fitnessTimeTo = jComboBoxFitnessTimeFrom.getSelectedIndex()+9+".00";
                    insert.JDBCInsertFacility(finalGuestID, tempFacID, fitnessDate, fitnessTimeFrom, fitnessTimeTo, "N");
                    jLabelFitnessErrorMessageBook1.setVisible(false);  
                    jLabelFitnessBookDone.setVisible(true);

                }else{waitNoPop();}
        } else {
            jLabelFitnessErrorMessageBook1.setText("You have already booked this");
            jLabelFitnessErrorMessageBook1.setVisible(true);
        }
    }//GEN-LAST:event_jButtonBookFitnessActionPerformed

    private void jButtonBookVolleyActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBookVolleyActionPerformed
    {//GEN-HEADEREND:event_jButtonBookVolleyActionPerformed
        tempFacID="6";
        jLabelVolleyballErrorMessageBook.setVisible(false);
        jLabelVolleyballBookDone.setVisible(false);
        if(doubleBook(tempFacID, jComboBoxVolleyballSelectDate.getSelectedItem().toString(),
                jComboBoxVolleyballTimeFrom.getSelectedIndex()+8+".00",
                jComboBoxVolleyballTimeFrom.getSelectedIndex()+9+".00") == false) {
            if(select.getfacAvail(tempFacID, jComboBoxVolleyballSelectDate.getSelectedItem().toString(),
                    jComboBoxVolleyballTimeFrom.getSelectedIndex()+8+".00",
                    jComboBoxVolleyballTimeFrom.getSelectedIndex()+9+".00").size() < 12) {

                        jLabelVolleyballErrorMessageBook.setVisible(false);
                        String volleyballDate = (String)jComboBoxVolleyballSelectDate.getSelectedItem();
                        String volleyTimeFrom = jComboBoxVolleyballTimeFrom.getSelectedIndex()+8+".00";
                        String volleyTimeTo = jComboBoxVolleyballTimeFrom.getSelectedIndex()+9+".00";
                        insert.JDBCInsertFacility(finalGuestID, tempFacID, volleyballDate, volleyTimeFrom, volleyTimeTo, "N");
                        jLabelVolleyballBookDone.setVisible(true);

            } else {waitNoPop();}
        } else {
            jLabelVolleyballErrorMessageBook.setText("You have already booked this");
            jLabelVolleyballErrorMessageBook.setVisible(true);
        }
                
    }//GEN-LAST:event_jButtonBookVolleyActionPerformed

    private void jButtonBookTennisActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBookTennisActionPerformed
    {//GEN-HEADEREND:event_jButtonBookTennisActionPerformed
        tempFacID="7";
        jLabelTennisErrorMessageBook.setVisible(false);
        jLabelTennisErrorMessageNoHours.setVisible(false);
        jLabelTennisBookDone.setVisible(false);
        tempGetFac = select.getfacAvail(tempFacID, jComboBoxTennisSelectDate.getSelectedItem().toString(), 
                jComboBoxTennisTimeFrom.getSelectedIndex()+8+".00", 
                jComboBoxTennisTimeFrom.getSelectedIndex()+9+".00");
        
        if(doubleBook(tempFacID, jComboBoxTennisSelectDate.getSelectedItem().toString(), 
                jComboBoxTennisTimeFrom.getSelectedIndex()+8+".00", 
                jComboBoxTennisTimeFrom.getSelectedIndex()+9+".00") == false ) 
        {
            if(tempGetFac.size() < 6)
                    {
                        jLabelTennisErrorMessageBook.setVisible(false);
                        jLabelTennisErrorMessageNoHours.setVisible(false);
                        if(jCheckBoxTennisInstruct.isSelected()){
                            String tennisballDate = (String)jComboBoxTennisSelectDate.getSelectedItem(); //tennisballdate? Whaaaaaaaaaaaaat
                            String tennisTimeFrom = jComboBoxTennisTimeFrom.getSelectedIndex()+8+".00";
                            String tennisTimeTo = jComboBoxTennisTimeFrom.getSelectedIndex()+9+".00";
                            insert.JDBCInsertFacility(finalGuestID, tempFacID, tennisballDate, tennisTimeFrom, tennisTimeTo, "Y");
                            insert.JDBCInsertInstructorCost(finalGuestID, "1", Integer.parseInt(tempFacID));
                            jLabelTennisErrorMessageNoHours.setVisible(false); 
                            jLabelTennisBookDone.setVisible(true);
                        }else{
                            String tennisballDate = (String)jComboBoxTennisSelectDate.getSelectedItem();
                            String tennisTimeFrom = jComboBoxTennisTimeFrom.getSelectedIndex()+8+".00";
                            String tennisTimeTo = jComboBoxTennisTimeFrom.getSelectedIndex()+9+".00";
                            insert.JDBCInsertFacility(finalGuestID, tempFacID, tennisballDate, tennisTimeFrom, tennisTimeTo, "N");
                            insert.JDBCInsertInstructorCost(finalGuestID, "0", Integer.parseInt(tempFacID));
                            jLabelTennisBookDone.setVisible(true);
                        }       
                    } else {waitNoPop();}
        } else {
            jLabelTennisErrorMessageBook.setText("You have already booked this");
            jLabelTennisErrorMessageBook.setVisible(true);
        }
    }//GEN-LAST:event_jButtonBookTennisActionPerformed

    private void jComboBoxGolfInstructorDateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxGolfInstructorDateActionPerformed
    {//GEN-HEADEREND:event_jComboBoxGolfInstructorDateActionPerformed

    }//GEN-LAST:event_jComboBoxGolfInstructorDateActionPerformed

    private void jButtonPrintInstrucCostActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonPrintInstrucCostActionPerformed
    {//GEN-HEADEREND:event_jButtonPrintInstrucCostActionPerformed
        select.printBill(finalGuestID);
        jLabelOverviewBillPrintDone.setText("Your bill has been added to the folder");
        jLabelOverviewBillPrintDone.setVisible(true);
    }//GEN-LAST:event_jButtonPrintInstrucCostActionPerformed

    private void jButtonLoadBookingsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonLoadBookingsActionPerformed
    {//GEN-HEADEREND:event_jButtonLoadBookingsActionPerformed
        loadListOverview();
    }//GEN-LAST:event_jButtonLoadBookingsActionPerformed

    private void jButtonOverviewDeleteYes1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonOverviewDeleteYes1ActionPerformed
    {//GEN-HEADEREND:event_jButtonOverviewDeleteYes1ActionPerformed
        int a = jListBookedOverview.getSelectedIndex();
        delete.JDBCDeleteFacBooking(tempBookOverview.get(a).getGuestID(), tempBookOverview.get(a).getFacID(), tempBookOverview.get(a).getTimeStart());
        jDialogOverviewDelete.setVisible(false);
        loadListOverview();
    }//GEN-LAST:event_jButtonOverviewDeleteYes1ActionPerformed

    private void jButtonOverviewDeleteNo1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonOverviewDeleteNo1ActionPerformed
    {//GEN-HEADEREND:event_jButtonOverviewDeleteNo1ActionPerformed
        jDialogOverviewDelete.setVisible(false);
    }//GEN-LAST:event_jButtonOverviewDeleteNo1ActionPerformed

    private void jButtonOverviewEditBookingSaveChanges1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonOverviewEditBookingSaveChanges1ActionPerformed
    {//GEN-HEADEREND:event_jButtonOverviewEditBookingSaveChanges1ActionPerformed
        int a = jListBookedOverview.getSelectedIndex();
        jLabelEditAlreadyBooked.setVisible(false);
        if(doubleBook(tempFacID, jComboBoxOverviewEditBookingDate1.getSelectedItem().toString(),
                jComboBoxOverviewEditBookingTimeFrom1.getSelectedIndex()+8+".00", 
                jComboBoxOverviewEditBookingTimeFrom1.getSelectedIndex()+9+".00") == false) {
            try
            {
                update.updateFacBook(finalGuestID, jComboBoxOverviewEditBookingDate1.getSelectedItem().toString(),
                (jComboBoxOverviewEditBookingTimeFrom1.getSelectedIndex()+8)+"", (jComboBoxOverviewEditBookingTimeFrom1.getSelectedIndex()+9)+"",
                tempBookOverview.get(a).getTimeStart(), tempBookOverview.get(a).getFacDate());
                jDialogOverviewEditBooking.setVisible(false);
                loadListOverview();
            } catch (SQLException ex)
            {
                Logger.getLogger(Facilitet_GUI.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("That was a mistake...");
            }
        } else {jLabelEditAlreadyBooked.setText("This time and date is already booked by another guest");
            jLabelEditAlreadyBooked.setVisible(true);}
    }//GEN-LAST:event_jButtonOverviewEditBookingSaveChanges1ActionPerformed

    private void jComboBoxOverviewEditBookingTimeFrom1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxOverviewEditBookingTimeFrom1ActionPerformed
    {//GEN-HEADEREND:event_jComboBoxOverviewEditBookingTimeFrom1ActionPerformed

    }//GEN-LAST:event_jComboBoxOverviewEditBookingTimeFrom1ActionPerformed

    private void jButtonBookGolfActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBookGolfActionPerformed
    {//GEN-HEADEREND:event_jButtonBookGolfActionPerformed
        tempFacID = "2";
        jLabelGolfErrorAlreadyBook.setVisible(false);
        jLabelGolfBookDone.setVisible(false);
        if(doubleBook(tempFacID, jComboBoxGolfInstructorDate.getSelectedItem().toString(), 
                jComboBoxGolfInstructorTimeFrom.getSelectedIndex()+8+".00", 
                jComboBoxGolfInstructorTimeFrom.getSelectedIndex()+9+".00") == false) 
        {
            jLabelGolfErrorAlreadyBook.setVisible(false); 
            insert.JDBCInsertFacility(finalGuestID, tempFacID, jComboBoxGolfInstructorDate.getSelectedItem().toString(), 
                    jComboBoxGolfInstructorTimeFrom.getSelectedIndex()+8+".00", 
                    jComboBoxGolfInstructorTimeFrom.getSelectedIndex()+9+".00", "Y");
            insert.JDBCInsertInstructorCost(finalGuestID, "1", 
            Integer.parseInt(tempFacID));
            jLabelGolfBookDone.setVisible(true);
        } else {jLabelGolfErrorAlreadyBook.setVisible(true);}
    }//GEN-LAST:event_jButtonBookGolfActionPerformed

    private void jButtonBookSwimmingActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBookSwimmingActionPerformed
    {//GEN-HEADEREND:event_jButtonBookSwimmingActionPerformed
        tempFacID="8";
        jLabelSwimmingErrorMessageNoHours.setVisible(false);
        jLabelSwimingBookDone.setVisible(false);
        if(doubleBook(tempFacID, jComboBoxSwimmingInstructorDate.getSelectedItem().toString(), 
                jComboBoxSwimmingInstructorTimeFrom.getSelectedIndex()+8+".00", 
                jComboBoxSwimmingInstructorTimeFrom.getSelectedIndex()+9+".00")==false) {
                jLabelSwimmingErrorMessageNoHours.setVisible(false);  
                insert.JDBCInsertFacility(finalGuestID, tempFacID, 
                        jComboBoxSwimmingInstructorDate.getSelectedItem().toString(), 
                        jComboBoxSwimmingInstructorTimeFrom.getSelectedIndex()+8+".00", 
                        jComboBoxSwimmingInstructorTimeFrom.getSelectedIndex()+9+".00", 
                        "Y");
                insert.JDBCInsertInstructorCost(finalGuestID,"1", Integer.parseInt(tempFacID));
                jLabelSwimingBookDone.setVisible(true);
        } else {jLabelSwimmingErrorMessageNoHours.setVisible(true);}
    }//GEN-LAST:event_jButtonBookSwimmingActionPerformed

    private void jButtonGolfHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonGolfHelpActionPerformed
    {//GEN-HEADEREND:event_jButtonGolfHelpActionPerformed
        jDialogFacilityInstrucHelp.setVisible(true);
        jDialogFacilityInstrucHelp.setLocation(700, 250);
    }//GEN-LAST:event_jButtonGolfHelpActionPerformed

    private void jButtonSwimmingHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonSwimmingHelpActionPerformed
    {//GEN-HEADEREND:event_jButtonSwimmingHelpActionPerformed
        jDialogFacilityInstrucHelp.setVisible(true);
        jDialogFacilityInstrucHelp.setLocation(700, 250);
    }//GEN-LAST:event_jButtonSwimmingHelpActionPerformed

    private void jButtonGetWaitOverviewActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonGetWaitOverviewActionPerformed
    {//GEN-HEADEREND:event_jButtonGetWaitOverviewActionPerformed
        loadWaitlistOverview(jComboBoxOverviewSelectDate.getSelectedItem().toString(),
                jComboBoxOverviewTimeFrom.getSelectedIndex()+8+".00",
                jComboBoxOverviewTimeFrom.getSelectedIndex()+9+".00",
                jComboBoxOverviewFacility.getSelectedItem().toString().toUpperCase());
    }//GEN-LAST:event_jButtonGetWaitOverviewActionPerformed

    private void jButtonWaitYesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonWaitYesActionPerformed
    {//GEN-HEADEREND:event_jButtonWaitYesActionPerformed
        insert.JDBCInsertWait(finalGuestID, tempFacID, jComboBoxBadmintonTimeFrom.getSelectedIndex()+8+".00",
                jComboBoxBadmintonTimeFrom.getSelectedIndex()+9+".00", jComboBoxBadmintonSelectDate.getSelectedItem().toString());
        jDialogWaitOrNo.setVisible(false);
        System.out.println(tempFacID);
    }//GEN-LAST:event_jButtonWaitYesActionPerformed

    private void jButtonWaitNoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonWaitNoActionPerformed
    {//GEN-HEADEREND:event_jButtonWaitNoActionPerformed
        jDialogWaitOrNo.setVisible(false);
    }//GEN-LAST:event_jButtonWaitNoActionPerformed

    private void jButtonVolleyballRefreshAmountActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonVolleyballRefreshAmountActionPerformed
    {//GEN-HEADEREND:event_jButtonVolleyballRefreshAmountActionPerformed
         tempGetFac = select.getfacAvail("6", jComboBoxVolleyballSelectDate.getSelectedItem().toString(), 
                jComboBoxVolleyballTimeFrom.getSelectedIndex()+8+".00", 
                jComboBoxVolleyballTimeFrom.getSelectedIndex()+9+".00");
         System.out.println(Integer.toString(tempGetFac.size()));
         jLabelVolleyballNoSign.setText(Integer.toString(tempGetFac.size()));
    }//GEN-LAST:event_jButtonVolleyballRefreshAmountActionPerformed

    private void jButtonSignInMainActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonSignInMainActionPerformed
    {//GEN-HEADEREND:event_jButtonSignInMainActionPerformed
        finalGuestID = jTextFieldSignInGuestID.getText();
        tempGuestName = select.getInfoFromGuestID(finalGuestID);
        if(jTextFieldSignInGuestID.getText().isEmpty() ==true) {
            jLabelSignInErrorMessage.setText("The box above is empty, you have to insert your guest ID");
            jLabelSignInErrorMessage.setVisible(true);
        } else {
            if (tempGuestName.size() > 0){
                jTextFieldSignInGuestID.setEditable(false);
                jButtonSignInMain.setEnabled(false);
                jLabelSignInGuestName.setVisible(true);
                String firstName = tempGuestName.get(0).getGuestFirstname();
                String lastName = tempGuestName.get(0).getGuestLastName();
                jLabelSignInGuestName.setText(firstName+" "+lastName);
                jLabelSignInErrorMessage.setText("You have succesfully signed in!");
                jLabelSignInErrorMessage.setVisible(true);
            } else {
                jLabelSignInErrorMessage.setText("Guest ID could not be found, please try again or contact the reception");
                jLabelSignInErrorMessage.setVisible(true);
            }

        }
    }//GEN-LAST:event_jButtonSignInMainActionPerformed

    private void jButtonSignOutMainActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonSignOutMainActionPerformed
    {//GEN-HEADEREND:event_jButtonSignOutMainActionPerformed
        jTextFieldSignInGuestID.setText("");
        jLabelSignInGuestName.setText("");
        jTextFieldSignInGuestID.setEditable(true);
        finalGuestID = null;
        jLabelSignInErrorMessage.setText("You have signed out!");
        jLabelSignInErrorMessage.setVisible(true);
        jButtonSignInMain.setEnabled(true);
    }//GEN-LAST:event_jButtonSignOutMainActionPerformed

    private void jComboBoxOverviewSelectDateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxOverviewSelectDateActionPerformed
    {//GEN-HEADEREND:event_jComboBoxOverviewSelectDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxOverviewSelectDateActionPerformed

    private void jComboBoxOverviewTimeFromActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxOverviewTimeFromActionPerformed
    {//GEN-HEADEREND:event_jComboBoxOverviewTimeFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxOverviewTimeFromActionPerformed
 
    private void waitNoPop() {
        jDialogWaitOrNo.setSize(300, 210);
        jDialogWaitOrNo.setVisible(true);
        jDialogWaitOrNo.setLocation(700, 250);
    }
    public static void main(String args[])
    {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Facilitet_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Facilitet_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Facilitet_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Facilitet_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Facilitet_GUI().setVisible(true);                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBadmintonHelp;
    private javax.swing.JButton jButtonBookBadminton;
    private javax.swing.JButton jButtonBookFitness;
    private javax.swing.JButton jButtonBookGolf;
    private javax.swing.JButton jButtonBookHandball;
    private javax.swing.JButton jButtonBookSwimming;
    private javax.swing.JButton jButtonBookTennis;
    private javax.swing.JButton jButtonBookVolley;
    private javax.swing.JButton jButtonFitnessHelp;
    private javax.swing.JButton jButtonGetWaitOverview;
    private javax.swing.JButton jButtonGolfHelp;
    private javax.swing.JButton jButtonHandBallHelp;
    private javax.swing.JButton jButtonLoadBookings;
    private javax.swing.JButton jButtonOverviewDeleteBooking1;
    private javax.swing.JButton jButtonOverviewDeleteNo1;
    private javax.swing.JButton jButtonOverviewDeleteYes1;
    private javax.swing.JButton jButtonOverviewEditBooking1;
    private javax.swing.JButton jButtonOverviewEditBookingSaveChanges1;
    private javax.swing.JButton jButtonOverviewHelp;
    private javax.swing.JButton jButtonPrintInstrucCost;
    private javax.swing.JButton jButtonSignInMain;
    private javax.swing.JButton jButtonSignOutMain;
    private javax.swing.JButton jButtonSwimmingHelp;
    private javax.swing.JButton jButtonTennisHelp;
    private javax.swing.JButton jButtonVolleybalHelp;
    private javax.swing.JButton jButtonVolleyballRefreshAmount;
    private javax.swing.JButton jButtonWaitNo;
    private javax.swing.JButton jButtonWaitYes;
    private javax.swing.JCheckBox jCheckBoxBadmintonInstruct;
    private javax.swing.JCheckBox jCheckBoxGolfInstruct;
    private javax.swing.JCheckBox jCheckBoxSwimmingInstruct;
    private javax.swing.JCheckBox jCheckBoxTennisInstruct;
    private javax.swing.JComboBox jComboBoxBadmintonSelectDate;
    private javax.swing.JComboBox jComboBoxBadmintonTimeFrom;
    private javax.swing.JComboBox jComboBoxFitnessSelectDate;
    private javax.swing.JComboBox jComboBoxFitnessTimeFrom;
    private javax.swing.JComboBox jComboBoxGolfInstructorDate;
    private javax.swing.JComboBox jComboBoxGolfInstructorTimeFrom;
    private javax.swing.JComboBox jComboBoxHandballSelectDate;
    private javax.swing.JComboBox jComboBoxHandballTimeFrom;
    private javax.swing.JComboBox jComboBoxOverviewEditBookingDate1;
    private javax.swing.JComboBox jComboBoxOverviewEditBookingTimeFrom1;
    private javax.swing.JComboBox jComboBoxOverviewFacility;
    private javax.swing.JComboBox jComboBoxOverviewSelectDate;
    private javax.swing.JComboBox jComboBoxOverviewTimeFrom;
    private javax.swing.JComboBox jComboBoxSwimmingInstructorDate;
    private javax.swing.JComboBox jComboBoxSwimmingInstructorTimeFrom;
    private javax.swing.JComboBox jComboBoxTennisSelectDate;
    private javax.swing.JComboBox jComboBoxTennisTimeFrom;
    private javax.swing.JComboBox jComboBoxVolleyballSelectDate;
    private javax.swing.JComboBox jComboBoxVolleyballTimeFrom;
    private javax.swing.JDialog jDialogFacilityHelp;
    private javax.swing.JDialog jDialogFacilityInstrucHelp;
    private javax.swing.JDialog jDialogOverviewDelete;
    private javax.swing.JDialog jDialogOverviewEditBooking;
    private javax.swing.JDialog jDialogOverviewHelp;
    private javax.swing.JDialog jDialogWaitOrNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLabel jLabelBadmintonBookDone;
    private javax.swing.JLabel jLabelBadmintonCostText;
    private javax.swing.JLabel jLabelBadmintonErrorMessageBook;
    private javax.swing.JLabel jLabelBadmintonErrorMessageNoHours;
    private javax.swing.JLabel jLabelCurrentBooking;
    private javax.swing.JLabel jLabelEditAlreadyBooked;
    private javax.swing.JLabel jLabelFitnessBookDone;
    private javax.swing.JLabel jLabelFitnessErrorMessageBook1;
    private javax.swing.JLabel jLabelGUIISBULLSHIT;
    private javax.swing.JLabel jLabelGolfBookDone;
    private javax.swing.JLabel jLabelGolfCostText;
    private javax.swing.JLabel jLabelGolfErrorAlreadyBook;
    private javax.swing.JLabel jLabelGolfInstructorDate;
    private javax.swing.JLabel jLabelGolfInstructorDateTimeInfo;
    private javax.swing.JLabel jLabelGolfInstructorTimeFrom;
    private javax.swing.JLabel jLabelHandballBookDone;
    private javax.swing.JLabel jLabelHandballErrorMessageBook;
    private javax.swing.JLabel jLabelOverviewBillPrintDone;
    private javax.swing.JLabel jLabelPleaseSelectBooking;
    private javax.swing.JLabel jLabelSignInErrorMessage;
    private javax.swing.JLabel jLabelSignInGuestName;
    private javax.swing.JLabel jLabelSwimingBookDone;
    private javax.swing.JLabel jLabelSwimmingErrorMessageNoHours;
    private javax.swing.JLabel jLabelSwimmingInstructorDate;
    private javax.swing.JLabel jLabelSwimmingInstructorDateTimeInfo;
    private javax.swing.JLabel jLabelSwimmingInstructorPrice;
    private javax.swing.JLabel jLabelSwimmingInstructorTimeFrom;
    private javax.swing.JLabel jLabelTennisBookDone;
    private javax.swing.JLabel jLabelTennisCostText;
    private javax.swing.JLabel jLabelTennisErrorMessageBook;
    private javax.swing.JLabel jLabelTennisErrorMessageNoHours;
    private javax.swing.JLabel jLabelVolleyballBookDone;
    private javax.swing.JLabel jLabelVolleyballErrorMessageBook;
    private javax.swing.JLabel jLabelVolleyballNoSign;
    private javax.swing.JLabel jLabelVolleyballNoSignText;
    private javax.swing.JList jListBookedOverview;
    private javax.swing.JList jListWaitOverview;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel1Badminton;
    private javax.swing.JPanel jPanel1Handball;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel2Fitness;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel3Golf;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel4MountainBike;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel5Overview;
    private javax.swing.JPanel jPanel5Swimming;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel6TableTennis;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel7Tennis;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel8Volleyball;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelFacilityHelp;
    private javax.swing.JPanel jPanelGolf;
    private javax.swing.JPanel jPanelOverviewEditBooking;
    private javax.swing.JPanel jPanelOverviewHelp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldSignInGuestID;
    // End of variables declaration//GEN-END:variables
}
