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
import javax.swing.JTextField;



/**
 *
 * @author Jonas
 **/
public class Facilitet_GUI extends javax.swing.JFrame
{
    public String finalGuestID;
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
    Calendar presentDate = Calendar.getInstance();
    Calendar cal = Calendar.getInstance();
    
    public Facilitet_GUI()
    {
        initComponents();
        
        // jComboBoxBadmintonSelectDate
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
    
    private String[] getComboBoxListFromToday()
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
    
    private void loadListOverview() {
        bookedOverview.removeAllElements();
        tempBookOverview = select.getBookedOverview("12345");
        for(int i = 0;  i<tempBookOverview.size(); ++i) {
            //String GuestID = tempBookOverview.get(i).getGuestID();
            String FacType = tempBookOverview.get(i).getFacType();
            String FacDate = tempBookOverview.get(i).getFacDate();
            String TimeStart = tempBookOverview.get(i).getTimeStart();
            String TimeEnd = tempBookOverview.get(i).getTimeEnd();
            
            bookedOverview.addElement("Facility: "+FacType+", Date: "+FacDate+", From: "+TimeStart+", To: "+TimeEnd);
        }
        jListBookedOverview.setModel(bookedOverview);
    }
    
    private void loadWaitlistOverview(String guestID) {
        waitlistOverview.removeAllElements();
        tempPos = select.getWaitlistPosition(guestID);
        for(int i=0; i<tempPos.size(); ++i) {
            String pos = tempPos.get(i).getPos();
            String facType = tempPos.get(i).getFacType();
            String timeStart = tempPos.get(i).getTimeStart();
            String timeEnd = tempPos.get(i).getTimeEnd();
            String facDate = tempPos.get(i).getFacDate();
            
            waitlistOverview.addElement("("+facDate+") Facility: "+facType+", From "+timeStart+" to "
                    +timeEnd+". Position in queue: "+pos.substring(1));
        }
        jListWaitOverview.setModel(waitlistOverview);
            
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
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jButtonOverviewEditBookingSaveChanges1 = new javax.swing.JButton();
        jLabelAlreadyBooked = new javax.swing.JLabel();
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
        jDialogLogIn = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldFinalGuestID = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButtonSignIn = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5Overview = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jButtonOverviewEditBooking1 = new javax.swing.JButton();
        jButtonOverviewDeleteBooking1 = new javax.swing.JButton();
        jLabel91 = new javax.swing.JLabel();
        jButtonOverviewHelp = new javax.swing.JButton();
        jLabel116 = new javax.swing.JLabel();
        jButtonPrintInstrucCost = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListBookedOverview = new javax.swing.JList();
        jButtonLoadBookings = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListWaitOverview = new javax.swing.JList();
        jButtonGetWaitOverview = new javax.swing.JButton();
        jLabelOverviewGuestID = new javax.swing.JLabel();
        jPanel1Badminton = new javax.swing.JPanel();
        jButtonBookBadminton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabelBadmintonCostText = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jComboBoxBadmintonSelectDate = new javax.swing.JComboBox();
        jComboBoxBadmintonTimeFrom = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        jComboBoxBadmintonTimeTo = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonBadmintonHelp = new javax.swing.JButton();
        jLabel105 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBoxBadmintonInstruct = new javax.swing.JCheckBox();
        jComboBoxBadmintonInstrucHours = new javax.swing.JComboBox();
        jLabelBadmintonInstructHourLabel = new javax.swing.JLabel();
        jLabelBadmintonInstructorPrice = new javax.swing.JLabel();
        jLabelBadmintonErrorMessageNoHours = new javax.swing.JLabel();
        jLabelBadmintonErrorMessageBook = new javax.swing.JLabel();
        jPanel3Golf = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabelGolfInstructorDate = new javax.swing.JLabel();
        jComboBoxGolfInstructorDate = new javax.swing.JComboBox();
        jLabelGolfInstructorTimeFrom = new javax.swing.JLabel();
        jComboBoxGolfInstructorTimeFrom = new javax.swing.JComboBox();
        jLabelGolfInstructorTimeTo = new javax.swing.JLabel();
        jComboBoxGolfInstructorTimeTo = new javax.swing.JComboBox();
        jLabelGolfInstructorDateTimeInfo = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jCheckBoxGolfInstruct = new javax.swing.JCheckBox();
        jLabelGolfInstructHourLabel = new javax.swing.JLabel();
        jComboBoxGolfInstrucHours = new javax.swing.JComboBox();
        jButtonBookGolf = new javax.swing.JButton();
        jLabelGolfCostText = new javax.swing.JLabel();
        jLabelGolfErrorMessageBook = new javax.swing.JLabel();
        jLabelGolfErrorMessageNoHours = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabelGolfInstructorPrice = new javax.swing.JLabel();
        jButtonGolfHelp = new javax.swing.JButton();
        jPanel1Handball = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jComboBoxHandballSelectDate = new javax.swing.JComboBox();
        jLabel47 = new javax.swing.JLabel();
        jComboBoxHandballTimeFrom = new javax.swing.JComboBox();
        jLabel55 = new javax.swing.JLabel();
        jComboBoxHandballTimeTo = new javax.swing.JComboBox();
        jButtonHandBallHelp = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jButtonBookHandball = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabelHandballErrorMessageBook = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel4MountainBike = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jPanel6TableTennis = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
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
        jLabel77 = new javax.swing.JLabel();
        jComboBoxVolleyballTimeTo = new javax.swing.JComboBox();
        jButtonVolleybalHelp = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jButtonBookVolley = new javax.swing.JButton();
        jLabelVolleyballErrorMessageBook = new javax.swing.JLabel();
        jPanel7Tennis = new javax.swing.JPanel();
        jButtonBookTennis = new javax.swing.JButton();
        jLabelTennisCostText = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jComboBoxTennisSelectDate = new javax.swing.JComboBox();
        jLabel86 = new javax.swing.JLabel();
        jComboBoxTennisTimeFrom = new javax.swing.JComboBox();
        jLabel87 = new javax.swing.JLabel();
        jComboBoxTennisTimeTo = new javax.swing.JComboBox();
        jButtonTennisHelp = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jLabelGUIISBULLSHIT = new javax.swing.JLabel();
        jLabelTennisErrorMessageNoHours = new javax.swing.JLabel();
        jLabelTennisErrorMessageBook = new javax.swing.JLabel();
        jLabelTennisInstructorPrice = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBoxTennisInstruct = new javax.swing.JCheckBox();
        jLabelTennisInstructHourLabel = new javax.swing.JLabel();
        jComboBoxTennisInstrucHours = new javax.swing.JComboBox();
        jPanel5Swimming = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabelSwimmingPriceLabel = new javax.swing.JLabel();
        jLabelSwimmingInstructorPrice = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jCheckBoxSwimmingInstruct = new javax.swing.JCheckBox();
        jLabel85 = new javax.swing.JLabel();
        jLabelSwimmingInstructHourLabel = new javax.swing.JLabel();
        jComboBoxSwimmingInstrucHours = new javax.swing.JComboBox();
        jLabelSwimmingInstructorDateTimeInfo = new javax.swing.JLabel();
        jLabelSwimmingInstructorDate = new javax.swing.JLabel();
        jComboBoxSwimmingInstructorDate = new javax.swing.JComboBox();
        jLabelSwimmingInstructorTimeFrom = new javax.swing.JLabel();
        jComboBoxSwimmingInstructorTimeFrom = new javax.swing.JComboBox();
        jLabelSwimmingInstructorTimeTo = new javax.swing.JLabel();
        jComboBoxSwimmingInstructorTimeTo = new javax.swing.JComboBox();
        jLabel40 = new javax.swing.JLabel();
        jButtonBookSwimming = new javax.swing.JButton();
        jButtonSwimmingHelp = new javax.swing.JButton();
        jLabelSwimmingErrorMessageNoHours = new javax.swing.JLabel();
        jLabelSwimmingErrorMessageBook = new javax.swing.JLabel();
        jPanel2Fitness = new javax.swing.JPanel();
        jPanelGolf = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jComboBoxFitnessSelectDate = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        jComboBoxFitnessTimeFrom = new javax.swing.JComboBox();
        jLabel34 = new javax.swing.JLabel();
        jComboBoxFitnessTimeTo = new javax.swing.JComboBox();
        jButtonFitnessHelp = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jButtonBookFitness = new javax.swing.JButton();
        jLabelFitnessErrorMessageBook1 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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
                .addGap(0, 50, Short.MAX_VALUE))
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

        jComboBoxOverviewEditBookingTimeFrom1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "08.00 - 09.00", "09.00 - 10.00", "11.00 - 12.00", "12.00 - 13.00", "14.00 - 15.00", "15.00 - 16.00", "17.00 - 18.00", "18.00 - 19.00", "19.00 - 20.00" }));
        jComboBoxOverviewEditBookingTimeFrom1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxOverviewEditBookingTimeFrom1ActionPerformed(evt);
            }
        });

        jLabel100.setText("From:");

        jLabel102.setText("Current booking:");

        jLabel103.setText("Change your booking to following date and time:");

        jButtonOverviewEditBookingSaveChanges1.setText("Save changes");
        jButtonOverviewEditBookingSaveChanges1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonOverviewEditBookingSaveChanges1ActionPerformed(evt);
            }
        });

        jLabelAlreadyBooked.setText("already booked message");

        javax.swing.GroupLayout jPanelOverviewEditBookingLayout = new javax.swing.GroupLayout(jPanelOverviewEditBooking);
        jPanelOverviewEditBooking.setLayout(jPanelOverviewEditBookingLayout);
        jPanelOverviewEditBookingLayout.setHorizontalGroup(
            jPanelOverviewEditBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOverviewEditBookingLayout.createSequentialGroup()
                .addGroup(jPanelOverviewEditBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel98)
                    .addComponent(jLabel102)
                    .addComponent(jLabel103)
                    .addGroup(jPanelOverviewEditBookingLayout.createSequentialGroup()
                        .addGroup(jPanelOverviewEditBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelOverviewEditBookingLayout.createSequentialGroup()
                                .addComponent(jLabel99)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxOverviewEditBookingDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel100)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxOverviewEditBookingTimeFrom1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOverviewEditBookingLayout.createSequentialGroup()
                                .addComponent(jLabelAlreadyBooked)
                                .addGap(131, 131, 131)))
                        .addComponent(jButtonOverviewEditBookingSaveChanges1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))
                .addGap(39, 39, 39))
        );
        jPanelOverviewEditBookingLayout.setVerticalGroup(
            jPanelOverviewEditBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOverviewEditBookingLayout.createSequentialGroup()
                .addComponent(jLabel98)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel102)
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
                    .addComponent(jLabelAlreadyBooked))
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

        jDialogLogIn.setFocusable(false);
        jDialogLogIn.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText("Please enter your guestID:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Welcome dear guest!");

        jButtonSignIn.setText("Sign in");
        jButtonSignIn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSignInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButtonSignIn)
                                .addGap(12, 12, 12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldFinalGuestID, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldFinalGuestID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSignIn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialogLogInLayout = new javax.swing.GroupLayout(jDialogLogIn.getContentPane());
        jDialogLogIn.getContentPane().setLayout(jDialogLogInLayout);
        jDialogLogInLayout.setHorizontalGroup(
            jDialogLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogLogInLayout.setVerticalGroup(
            jDialogLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel69.setText("You have booked following facilities:");

        jLabel70.setText("Guestname");

        jLabel71.setText("GuestID");

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

        jLabel91.setText("Waiting List:");

        jButtonOverviewHelp.setText("Help");
        jButtonOverviewHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonOverviewHelpActionPerformed(evt);
            }
        });

        jLabel116.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel116.setText("jLabel116");

        jButtonPrintInstrucCost.setText("Print current balance for instructor cost");
        jButtonPrintInstrucCost.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonPrintInstrucCostActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jListBookedOverview);

        jButtonLoadBookings.setText("Load Bookings");
        jButtonLoadBookings.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonLoadBookingsActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(jListWaitOverview);

        jButtonGetWaitOverview.setText("Refresh");
        jButtonGetWaitOverview.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonGetWaitOverviewActionPerformed(evt);
            }
        });

        jLabelOverviewGuestID.setText("*****");

        javax.swing.GroupLayout jPanel5OverviewLayout = new javax.swing.GroupLayout(jPanel5Overview);
        jPanel5Overview.setLayout(jPanel5OverviewLayout);
        jPanel5OverviewLayout.setHorizontalGroup(
            jPanel5OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5OverviewLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel5OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5OverviewLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonOverviewDeleteBooking1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonOverviewEditBooking1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonOverviewHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(328, 328, 328))
                    .addGroup(jPanel5OverviewLayout.createSequentialGroup()
                        .addGroup(jPanel5OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel70)
                            .addComponent(jLabel71))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel5OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel116, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelOverviewGuestID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5OverviewLayout.createSequentialGroup()
                        .addGroup(jPanel5OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5OverviewLayout.createSequentialGroup()
                                .addComponent(jLabel91)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonGetWaitOverview, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5OverviewLayout.createSequentialGroup()
                                .addComponent(jLabel69)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonLoadBookings)))
                        .addGap(0, 626, Short.MAX_VALUE))
                    .addGroup(jPanel5OverviewLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonPrintInstrucCost)
                        .addGap(54, 54, 54))))
        );
        jPanel5OverviewLayout.setVerticalGroup(
            jPanel5OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5OverviewLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(jLabel116))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(jLabelOverviewGuestID))
                .addGap(18, 18, 18)
                .addGroup(jPanel5OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(jButtonLoadBookings))
                .addGap(10, 10, 10)
                .addGroup(jPanel5OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5OverviewLayout.createSequentialGroup()
                        .addComponent(jButtonOverviewEditBooking1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonOverviewDeleteBooking1)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonOverviewHelp))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(jButtonGetWaitOverview, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPrintInstrucCost))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Overview", jPanel5Overview);

        jPanel1Badminton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBookBadminton.setText("BOOK");
        jButtonBookBadminton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBookBadmintonActionPerformed(evt);
            }
        });
        jPanel1Badminton.add(jButtonBookBadminton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 101, 43));

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel7.setText("The facilities are available between 8am - 8pm every day");
        jPanel1Badminton.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 330, -1));

        jLabelBadmintonCostText.setText("The following amount has been added to your bill:");
        jLabelBadmintonCostText.setVisible(false);
        jPanel1Badminton.add(jLabelBadmintonCostText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 290, -1));

        jLabel16.setText("Select the date and hour/hours you wish to play");
        jPanel1Badminton.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLabel17.setText("Date:");
        jPanel1Badminton.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 317, -1, -1));

        jLabel19.setText("<html>Badminton is a racquet sport usually played individually against each other <br>but can also be a 2v2 team sport. Bring your sweaty pants <br> and prepare for loads of fun and action in a game of strength, speed and <br> skills. Our highly experienced instructors are always available for hire</html>");
        jLabel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1Badminton.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 395, 134));

        jComboBoxBadmintonSelectDate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxBadmintonSelectDateActionPerformed(evt);
            }
        });
        jPanel1Badminton.add(jComboBoxBadmintonSelectDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 314, 169, -1));

        jComboBoxBadmintonTimeFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "08.00", "09.00", "10.00", "11.00", "12.00", "13.00", "14.00", "15.00", "16.00", "17.00", "18.00", "19.00" }));
        jComboBoxBadmintonTimeFrom.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxBadmintonTimeFromActionPerformed(evt);
            }
        });
        jPanel1Badminton.add(jComboBoxBadmintonTimeFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 314, -1, -1));

        jLabel27.setText("To");
        jPanel1Badminton.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 317, 20, -1));

        jComboBoxBadmintonTimeTo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09.00", "10.00", "11.00", "12.00", "13.00", "14.00", "15.00", "16.00", "17.00", "18.00", "19.00", "20.00" }));
        jComboBoxBadmintonTimeTo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxBadmintonTimeToActionPerformed(evt);
            }
        });
        jPanel1Badminton.add(jComboBoxBadmintonTimeTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 314, -1, -1));

        jLabel28.setText("(max 4 facilities allowed per guest/day)");
        jPanel1Badminton.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 345, -1, -1));

        jLabel29.setText("From:");
        jPanel1Badminton.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 317, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("BADMINTON");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addContainerGap(509, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel1Badminton.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 612, 68));

        jButtonBadmintonHelp.setText("Help");
        jButtonBadmintonHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBadmintonHelpActionPerformed(evt);
            }
        });
        jPanel1Badminton.add(jButtonBadmintonHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 313, -1, -1));

        jLabel105.setText("<html>Useful info: <br> There are a total of 4 badminton courts, each with 4 players max/court. <br> The equipment will be given to you.");
        jPanel1Badminton.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 267, 76));

        jLabel2.setText("Do you wish to hire an instructor?");
        jPanel1Badminton.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, 20));

        jCheckBoxBadmintonInstruct.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jCheckBoxBadmintonInstructActionPerformed(evt);
            }
        });
        jPanel1Badminton.add(jCheckBoxBadmintonInstruct, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 20, 20));

        jComboBoxBadmintonInstrucHours.setVisible(false);
        jComboBoxBadmintonInstrucHours.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4" }));
        jComboBoxBadmintonInstrucHours.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxBadmintonInstrucHoursActionPerformed(evt);
            }
        });
        jPanel1Badminton.add(jComboBoxBadmintonInstrucHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, -1));

        jLabelBadmintonInstructHourLabel.setVisible(false);
        jLabelBadmintonInstructHourLabel.setText("...for how many hours?");
        jPanel1Badminton.add(jLabelBadmintonInstructHourLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 133, 22));

        jLabelBadmintonInstructorPrice.setVisible(false);
        jLabelBadmintonInstructorPrice.setText("*cost*");
        jPanel1Badminton.add(jLabelBadmintonInstructorPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 48, 16));

        jLabelBadmintonErrorMessageNoHours.setVisible(false);
        jLabelBadmintonErrorMessageNoHours.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelBadmintonErrorMessageNoHours.setText("You have to specify the number of hours you wish to hire an instructor");
        jPanel1Badminton.add(jLabelBadmintonErrorMessageNoHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 410, -1));

        jLabelBadmintonErrorMessageBook.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelBadmintonErrorMessageBook.setVisible(false);
        jLabelBadmintonErrorMessageBook.setText("The hours you have selected are not eligible");
        jPanel1Badminton.add(jLabelBadmintonErrorMessageBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, -1, -1));

        jTabbedPane1.addTab("Badminton", jPanel1Badminton);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelGolfInstructorDate.setText("Date:");
        jLabelGolfInstructorDate.setVisible(false);
        jPanel5.add(jLabelGolfInstructorDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, 30));

        jComboBoxGolfInstructorDate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxGolfInstructorDateActionPerformed(evt);
            }
        });
        jComboBoxGolfInstructorDate.setVisible(false);
        jPanel5.add(jComboBoxGolfInstructorDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 168, -1));

        jLabelGolfInstructorTimeFrom.setText("From:");
        jLabelGolfInstructorTimeFrom.setVisible(false);
        jPanel5.add(jLabelGolfInstructorTimeFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, 20));

        jComboBoxGolfInstructorTimeFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "08.00", "09.00", "10.00", "11.00", "12.00", "13.00", "14.00", "15.00", "16.00", "17.00", "18.00", "19.00" }));
        jComboBoxGolfInstructorTimeFrom.setVisible(false);
        jPanel5.add(jComboBoxGolfInstructorTimeFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, -1, -1));

        jLabelGolfInstructorTimeTo.setText("To:");
        jLabelGolfInstructorTimeTo.setVisible(false);
        jPanel5.add(jLabelGolfInstructorTimeTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 26, 20));

        jComboBoxGolfInstructorTimeTo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09.00", "10.00", "11.00", "12.00", "13.00", "14.00", "15.00", "16.00", "17.00", "18.00", "19.00", "20.00" }));
        jComboBoxGolfInstructorTimeTo.setVisible(false);
        jPanel5.add(jComboBoxGolfInstructorTimeTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, -1));

        jLabelGolfInstructorDateTimeInfo.setText("On which date and time:");
        jPanel5.add(jLabelGolfInstructorDateTimeInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));
        jLabelGolfInstructorDateTimeInfo.setVisible(false);

        jLabel67.setText("Do you wish to hire an instructor?");
        jPanel5.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 25));

        jCheckBoxGolfInstruct.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jCheckBoxGolfInstructActionPerformed(evt);
            }
        });
        jPanel5.add(jCheckBoxGolfInstruct, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        jLabelGolfInstructHourLabel.setVisible(false);
        jLabelGolfInstructHourLabel.setText("...for how many hours?");
        jPanel5.add(jLabelGolfInstructHourLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, 22));

        jComboBoxGolfInstrucHours.setVisible(false);
        jComboBoxGolfInstrucHours.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4" }));
        jComboBoxGolfInstrucHours.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxGolfInstrucHoursActionPerformed(evt);
            }
        });
        jPanel5.add(jComboBoxGolfInstrucHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, -1, -1));

        jButtonBookGolf.setText("BOOK");
        jButtonBookGolf.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBookGolfActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonBookGolf, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 400, 101, 43));

        jLabelGolfCostText.setVisible(false);
        jLabelGolfCostText.setText("The following amount has been added to your bill:");
        jPanel5.add(jLabelGolfCostText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        jLabelGolfErrorMessageBook.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelGolfErrorMessageBook.setVisible(false);
        jLabelGolfErrorMessageBook.setText("The hours you have selected are not eligible");
        jPanel5.add(jLabelGolfErrorMessageBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, -1, -1));

        jLabelGolfErrorMessageNoHours.setVisible(false);
        jLabelGolfErrorMessageNoHours.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelGolfErrorMessageNoHours.setText("You have to specify the number of hours you wish to hire an instructor");
        jPanel5.add(jLabelGolfErrorMessageNoHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 450, 418, -1));

        jLabel57.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel57.setText("The facilities are available between 8am - 8pm every day");
        jPanel5.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 484, 320, -1));

        jLabel25.setText("<html> Outdoor golf in a huge area in an exotic environment. <br> You dont have to book time just show up and swing your club.");
        jLabel25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel108.setText("<html>Useful info: <br> There are no player limits on this facility.<br> The equipment will be given to you.");
        jPanel5.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, -1, -1));

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel58.setText("GOLF");
        jPanel5.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jLabelGolfInstructorPrice.setVisible(false);
        jLabelGolfInstructorPrice.setText("*cost*");
        jPanel5.add(jLabelGolfInstructorPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 48, 16));

        jButtonGolfHelp.setText("Help");
        jButtonGolfHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonGolfHelpActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonGolfHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, -1, -1));

        javax.swing.GroupLayout jPanel3GolfLayout = new javax.swing.GroupLayout(jPanel3Golf);
        jPanel3Golf.setLayout(jPanel3GolfLayout);
        jPanel3GolfLayout.setHorizontalGroup(
            jPanel3GolfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1311, Short.MAX_VALUE)
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

        jLabel45.setText("Select the date and hour/hours you wish to play");
        jPanel8.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 259, -1, -1));

        jLabel46.setText("Date");
        jPanel8.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 302, -1, -1));

        jPanel8.add(jComboBoxHandballSelectDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 299, 154, -1));

        jLabel47.setText("From:");
        jPanel8.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 302, -1, -1));

        jComboBoxHandballTimeFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "08.00", "09.00", "10.00", "11.00", "12.00", "13.00", "14.00", "15.00", "16.00", "17.00", "18.00", "19.00" }));
        jPanel8.add(jComboBoxHandballTimeFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 299, -1, -1));

        jLabel55.setText("To:");
        jPanel8.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 302, -1, -1));

        jComboBoxHandballTimeTo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09.00", "10.00", "11.00", "12.00", "13.00", "14.00", "15.00", "16.00", "17.00", "18.00", "19.00", "20.00" }));
        jPanel8.add(jComboBoxHandballTimeTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 299, -1, -1));

        jButtonHandBallHelp.setText("Help");
        jButtonHandBallHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonHandBallHelpActionPerformed(evt);
            }
        });
        jPanel8.add(jButtonHandBallHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 298, -1, -1));

        jLabel51.setText("(max 4 facilities allowed per guest/day)");
        jPanel8.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 330, -1, -1));

        jButtonBookHandball.setText("BOOK");
        jButtonBookHandball.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBookHandballActionPerformed(evt);
            }
        });
        jPanel8.add(jButtonBookHandball, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 112, 48));

        jLabel5.setText("<html>Handball is a teamsport usually 6 players on each team. <br> Test your accuracy and have fun with your teammates. ");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 49, -1, -1));

        jLabel106.setText("<html>Useful info: <br> There are a total of 2 Handball courts, each with 12 players max/court. <br> The handballs will of cause be given to you.");
        jPanel8.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 320, 78));

        jLabel107.setText("<html>please note that if too few people have <br> booked within the given time, the facility will be cancelled.");
        jPanel8.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, -1, -1));

        jLabelHandballErrorMessageBook.setVisible(false);
        jLabelHandballErrorMessageBook.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelHandballErrorMessageBook.setText("The hours you have selected are not eligible");
        jPanel8.add(jLabelHandballErrorMessageBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, -1, -1));

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel43.setText("Handball");
        jPanel8.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel64.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel64.setText("The facilities are available between 8am - 8pm every day");
        jPanel8.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 484, 320, -1));

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

        jTabbedPane1.addTab("Table Tennis", jPanel6TableTennis);

        jPanel8Volleyball.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setText("<html>Playing volleyball is a great way to meet the other guests at the resort.<br> Sign-up at your preferred time and you will join a team consisting of other<br> guests and compete and have fun.");
        jLabel23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8Volleyball.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 126, -1, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel35.setText("The facilities are available between 8am - 8pm every day");
        jPanel8Volleyball.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 483, 324, -1));

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel62.setText("VOLLEYBALL");
        jPanel8Volleyball.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jLabel111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel111.setText("<html> Useful info: <br>  There are a total of 2 volleyball courts, each with 12 players max/court. <br> The equipment will be given to you.");
        jPanel8Volleyball.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 284, -1));

        jLabel74.setText("Select the date and hour/hours you wish to play");

        jLabel75.setText("Date:");

        jComboBoxVolleyballSelectDate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxVolleyballSelectDateActionPerformed(evt);
            }
        });

        jLabel76.setText("From:");

        jComboBoxVolleyballTimeFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "08.00", "09.00", "10.00", "11.00", "12.00", "13.00", "14.00", "15.00", "16.00", "17.00", "18.00", "19.00" }));

        jLabel77.setText("To");

        jComboBoxVolleyballTimeTo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09.00", "10.00", "11.00", "12.00", "13.00", "14.00", "15.00", "16.00", "17.00", "18.00", "19.00", "20.00" }));

        jButtonVolleybalHelp.setText("Help");
        jButtonVolleybalHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonVolleybalHelpActionPerformed(evt);
            }
        });

        jLabel52.setText("(max 4 facilities allowed per guest/day)");

        jButtonBookVolley.setText("BOOK");
        jButtonBookVolley.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBookVolleyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonBookVolley, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel74)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxVolleyballSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel76)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jComboBoxVolleyballTimeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxVolleyballTimeTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonVolleybalHelp)))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel74)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(jLabel76)
                    .addComponent(jLabel77)
                    .addComponent(jComboBoxVolleyballTimeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxVolleyballTimeTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxVolleyballSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVolleybalHelp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jButtonBookVolley, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel8Volleyball.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 241, -1, 210));

        jLabelVolleyballErrorMessageBook.setVisible(false);
        jLabelVolleyballErrorMessageBook.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelVolleyballErrorMessageBook.setText("The hours you have selected are not eligible");
        jPanel8Volleyball.add(jLabelVolleyballErrorMessageBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, -1, -1));

        jTabbedPane1.addTab("Volleyball", jPanel8Volleyball);

        jPanel7Tennis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBookTennis.setText("BOOK");
        jButtonBookTennis.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBookTennisActionPerformed(evt);
            }
        });
        jPanel7Tennis.add(jButtonBookTennis, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 101, 43));

        jLabelTennisCostText.setText("The following amount has been added to your bill:");
        jLabelTennisCostText.setVisible(false);
        jPanel7Tennis.add(jLabelTennisCostText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel61.setText("TENNIS");
        jPanel7Tennis.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel78.setText("Select the date and hour/hours you wish to play");
        jPanel10.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

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

        jComboBoxTennisTimeFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "08.00", "09.00", "10.00", "11.00", "12.00", "13.00", "14.00", "15.00", "16.00", "17.00", "18.00", "19.00" }));
        jPanel10.add(jComboBoxTennisTimeFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        jLabel87.setText("To");
        jPanel10.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 20, 20));

        jComboBoxTennisTimeTo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09.00", "10.00", "11.00", "12.00", "13.00", "14.00", "15.00", "16.00", "17.00", "18.00", "19.00", "20.00" }));
        jPanel10.add(jComboBoxTennisTimeTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        jButtonTennisHelp.setText("Help");
        jButtonTennisHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonTennisHelpActionPerformed(evt);
            }
        });
        jPanel10.add(jButtonTennisHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        jLabel68.setText("(max 4 facilities allowed per guest/day)");
        jPanel10.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        jPanel7Tennis.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 218, -1, 120));

        jLabel20.setText("<html> At Casablanca we have 6 state-of- the-art tennis courts. <br> You have the choice to book one of our highly experienced instructors, <br> who can make your game even better, or play with whoever you want.<html>");
        jLabel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel7Tennis.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, 80));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        jPanel7Tennis.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jLabel112.setText("<html>Useful info: <br> There are a total of 6 tennis courts, each with 4 players max/court. <br> The equipment will be given to you.");
        jPanel7Tennis.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 312, -1));

        jLabelGUIISBULLSHIT.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabelGUIISBULLSHIT.setText("The facilities are available between 8am - 8pm every day");
        jPanel7Tennis.add(jLabelGUIISBULLSHIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 484, 320, -1));

        jLabelTennisErrorMessageNoHours.setVisible(false);
        jLabelTennisErrorMessageNoHours.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTennisErrorMessageNoHours.setText("You have to specify the number of hours you wish to hire an instructor");
        jPanel7Tennis.add(jLabelTennisErrorMessageNoHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 360, -1));

        jLabelTennisErrorMessageBook.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTennisErrorMessageBook.setVisible(false);
        jLabelTennisErrorMessageBook.setText("The hours you have selected are not eligible");
        jPanel7Tennis.add(jLabelTennisErrorMessageBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, -1, -1));

        jLabelTennisInstructorPrice.setVisible(false);
        jLabelTennisInstructorPrice.setText("*cost*");
        jPanel7Tennis.add(jLabelTennisInstructorPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 48, 16));

        jLabel6.setText("Do you wish to hire an instructor?");
        jPanel7Tennis.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, 20));

        jCheckBoxTennisInstruct.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jCheckBoxTennisInstructActionPerformed(evt);
            }
        });
        jPanel7Tennis.add(jCheckBoxTennisInstruct, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, -1));

        jLabelTennisInstructHourLabel.setVisible(false);
        jLabelTennisInstructHourLabel.setText("...for how many hours?");
        jPanel7Tennis.add(jLabelTennisInstructHourLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, 20));

        jComboBoxTennisInstrucHours.setVisible(false);
        jComboBoxTennisInstrucHours.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4" }));
        jComboBoxTennisInstrucHours.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxTennisInstrucHoursActionPerformed(evt);
            }
        });
        jPanel7Tennis.add(jComboBoxTennisInstrucHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, -1, -1));

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

        jLabelSwimmingPriceLabel.setText("       ");
        jPanel5Swimming.add(jLabelSwimmingPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 117, -1, -1));

        jLabelSwimmingInstructorPrice.setText("         ");
        jPanel5Swimming.add(jLabelSwimmingInstructorPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 117, -1, -1));

        jLabel114.setText("<html>Useful info: <br>There are no player limits for this facility.");
        jPanel5Swimming.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(832, 294, -1, -1));

        jCheckBoxSwimmingInstruct.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jCheckBoxSwimmingInstructActionPerformed(evt);
            }
        });

        jLabel85.setText("Do you wish to hire an instructor?");

        jLabelSwimmingInstructHourLabel.setText("                         ");

        jComboBoxSwimmingInstrucHours.setVisible(false);
        jComboBoxSwimmingInstrucHours.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4" }));
        jComboBoxSwimmingInstrucHours.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxSwimmingInstrucHoursActionPerformed(evt);
            }
        });

        jLabelSwimmingInstructorDateTimeInfo.setText("On which date and time:");
        jLabelSwimmingInstructorDateTimeInfo.setVisible(false);

        jLabelSwimmingInstructorDate.setText("Date:");
        jLabelSwimmingInstructorDate.setVisible(false);

        jComboBoxSwimmingInstructorDate.setVisible(false);

        jLabelSwimmingInstructorTimeFrom.setText("From:");
        jLabelSwimmingInstructorTimeFrom.setVisible(false);

        jComboBoxSwimmingInstructorTimeFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "08.00", "09.00", "10.00", "11.00", "12.00", "13.00", "14.00", "15.00", "16.00", "17.00", "18.00", "19.00" }));
        jComboBoxSwimmingInstructorTimeFrom.setVisible(false);

        jLabelSwimmingInstructorTimeTo.setText("To:");
        jLabelSwimmingInstructorTimeTo.setVisible(false);

        jComboBoxSwimmingInstructorTimeTo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09.00", "10.00", "11.00", "12.00", "13.00", "14.00", "15.00", "16.00", "17.00", "18.00", "19.00", "20.00" }));
        jComboBoxSwimmingInstructorTimeTo.setVisible(false);

        jLabel40.setText("The cost for the instructor has been added to your bill ");

        jButtonBookSwimming.setText("BOOK");
        jButtonBookSwimming.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBookSwimmingActionPerformed(evt);
            }
        });

        jButtonSwimmingHelp.setText("Help");
        jButtonSwimmingHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSwimmingHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel85)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBoxSwimmingInstruct)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelSwimmingInstructHourLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxSwimmingInstrucHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelSwimmingInstructorDateTimeInfo))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabelSwimmingInstructorDate)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxSwimmingInstructorDate, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabelSwimmingInstructorTimeFrom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxSwimmingInstructorTimeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSwimmingInstructorTimeTo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxSwimmingInstructorTimeTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSwimmingHelp)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonBookSwimming, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxSwimmingInstrucHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelSwimmingInstructHourLabel))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel85)
                        .addComponent(jCheckBoxSwimmingInstruct)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSwimmingInstructorDateTimeInfo)
                .addGap(25, 25, 25)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSwimmingInstructorDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSwimmingInstructorTimeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSwimmingInstructorTimeFrom)
                    .addComponent(jLabelSwimmingInstructorTimeTo)
                    .addComponent(jComboBoxSwimmingInstructorTimeTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSwimmingInstructorDate)
                    .addComponent(jButtonSwimmingHelp))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(jButtonBookSwimming, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5Swimming.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 244, -1, -1));

        jLabelBadmintonErrorMessageNoHours.setVisible(false);
        jLabelSwimmingErrorMessageNoHours.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelSwimmingErrorMessageNoHours.setText("You have to specify the number of hours you wish to hire an instructor");
        jPanel5Swimming.add(jLabelSwimmingErrorMessageNoHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 440, 414, -1));

        jLabelSwimmingErrorMessageBook.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSwimmingErrorMessageBook.setVisible(false);
        jLabelSwimmingErrorMessageBook.setText("The hours you have selected are not eligible");
        jPanel5Swimming.add(jLabelSwimmingErrorMessageBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 290, -1));

        jTabbedPane1.addTab("Swimming", jPanel5Swimming);

        jPanelGolf.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setText("Select the date and hour/hours you wish use the Fitness center.");
        jPanelGolf.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 328, -1, -1));

        jLabel31.setText("Date:");
        jPanelGolf.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 367, -1, -1));

        jComboBoxFitnessSelectDate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxFitnessSelectDateActionPerformed(evt);
            }
        });
        jPanelGolf.add(jComboBoxFitnessSelectDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 364, 146, -1));

        jLabel33.setText("From:");
        jPanelGolf.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 367, -1, -1));

        jComboBoxFitnessTimeFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "08.00", "09.00", "10.00", "11.00", "12.00", "13.00", "14.00", "15.00", "16.00", "17.00", "18.00", "19.00" }));
        jComboBoxFitnessTimeFrom.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxFitnessTimeFromActionPerformed(evt);
            }
        });
        jPanelGolf.add(jComboBoxFitnessTimeFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 364, -1, -1));

        jLabel34.setText("To");
        jPanelGolf.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 367, 20, -1));

        jComboBoxFitnessTimeTo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09.00", "10.00", "11.00", "12.00", "13.00", "14.00", "15.00", "16.00", "17.00", "18.00", "19.00", "20.00" }));
        jPanelGolf.add(jComboBoxFitnessTimeTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 364, -1, -1));

        jButtonFitnessHelp.setText("Help");
        jButtonFitnessHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonFitnessHelpActionPerformed(evt);
            }
        });
        jPanelGolf.add(jButtonFitnessHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 363, -1, -1));

        jLabel44.setText("(max 4 hours allowed per guest/day)");
        jPanelGolf.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 395, -1, -1));

        jButtonBookFitness.setText("BOOK");
        jButtonBookFitness.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBookFitnessActionPerformed(evt);
            }
        });
        jPanelGolf.add(jButtonBookFitness, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 418, 95, 47));

        jLabelFitnessErrorMessageBook1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelFitnessErrorMessageBook1.setVisible(false);
        jLabelFitnessErrorMessageBook1.setText("The hours you have selected are not eligible");
        jPanelGolf.add(jLabelFitnessErrorMessageBook1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, -1, -1));

        jLabel24.setText("<html>Our Fitness room allows you to train your body exactly how you want it.<br> The fitness center has all kinds of equipment so there is something for everyone.");
        jLabel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelGolf.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 146, -1, -1));

        jLabel113.setText("<html>Useful info: <br> The Fitness room limits 20 people. <br> The equipment be given to you.");
        jPanelGolf.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 273, -1, -1));

        jLabel50.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel50.setText("The facilities are available between 8am - 8pm every day");
        jPanelGolf.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 483, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("FITNESS CENTER");
        jPanelGolf.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 154, -1));

        javax.swing.GroupLayout jPanel2FitnessLayout = new javax.swing.GroupLayout(jPanel2Fitness);
        jPanel2Fitness.setLayout(jPanel2FitnessLayout);
        jPanel2FitnessLayout.setHorizontalGroup(
            jPanel2FitnessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGolf, javax.swing.GroupLayout.DEFAULT_SIZE, 1311, Short.MAX_VALUE)
        );
        jPanel2FitnessLayout.setVerticalGroup(
            jPanel2FitnessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGolf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jComboBoxSwimmingInstrucHoursActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxSwimmingInstrucHoursActionPerformed
    {//GEN-HEADEREND:event_jComboBoxSwimmingInstrucHoursActionPerformed
        jLabelSwimmingInstructorPrice.setText("$" + (jComboBoxSwimmingInstrucHours.getSelectedIndex()) * 40);
    }//GEN-LAST:event_jComboBoxSwimmingInstrucHoursActionPerformed

    private void jCheckBoxSwimmingInstructActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBoxSwimmingInstructActionPerformed
    {//GEN-HEADEREND:event_jCheckBoxSwimmingInstructActionPerformed
        if(jCheckBoxSwimmingInstruct.isSelected())
        {
            jLabelSwimmingInstructHourLabel.setText("...for how many hours?");
            jComboBoxSwimmingInstrucHours.setVisible(true);
            jComboBoxSwimmingInstrucHours.setSelectedIndex(0);
            jLabelSwimmingPriceLabel.setText("Price:");
            jLabelSwimmingInstructorDate.setVisible(true);
            jLabelSwimmingInstructorDateTimeInfo.setVisible(true);
            jLabelSwimmingInstructorTimeFrom.setVisible(true);
            jLabelSwimmingInstructorTimeTo.setVisible(true);
            jComboBoxSwimmingInstructorDate.setVisible(true);
            jComboBoxSwimmingInstructorTimeFrom.setVisible(true);
            jComboBoxSwimmingInstructorTimeTo.setVisible(true);
        } else
        {
            jLabelSwimmingInstructHourLabel.setText("");
            jComboBoxSwimmingInstrucHours.setVisible(false);
            jLabelSwimmingPriceLabel.setText("");
            jLabelSwimmingInstructorPrice.setText("");
            jLabelSwimmingInstructorDate.setVisible(false);
            jLabelSwimmingInstructorDateTimeInfo.setVisible(false);
            jLabelSwimmingInstructorTimeFrom.setVisible(false);
            jLabelSwimmingInstructorTimeTo.setVisible(false);
            jComboBoxSwimmingInstructorDate.setVisible(false);
            jComboBoxSwimmingInstructorTimeFrom.setVisible(false);
            jComboBoxSwimmingInstructorTimeTo.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBoxSwimmingInstructActionPerformed

    private void jComboBoxTennisSelectDateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxTennisSelectDateActionPerformed
    {//GEN-HEADEREND:event_jComboBoxTennisSelectDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTennisSelectDateActionPerformed

    private void jComboBoxTennisInstrucHoursActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxTennisInstrucHoursActionPerformed
    {//GEN-HEADEREND:event_jComboBoxTennisInstrucHoursActionPerformed
        jLabelTennisInstructorPrice.setText("$" + (jComboBoxTennisInstrucHours.getSelectedIndex()) * 30);
    }//GEN-LAST:event_jComboBoxTennisInstrucHoursActionPerformed

    private void jCheckBoxTennisInstructActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBoxTennisInstructActionPerformed
    {//GEN-HEADEREND:event_jCheckBoxTennisInstructActionPerformed
        if(jCheckBoxTennisInstruct.isSelected())
        {
            jLabelTennisInstructorPrice.setVisible(true);
            jLabelTennisCostText.setVisible(true);
            jLabelTennisInstructHourLabel.setVisible(true);
            jComboBoxTennisInstrucHours.setVisible(true);
            jComboBoxTennisInstrucHours.setSelectedIndex(0);
        } else
        {
            jLabelTennisInstructHourLabel.setVisible(false);
            jComboBoxTennisInstrucHours.setVisible(false);
            jLabelTennisInstructorPrice.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBoxTennisInstructActionPerformed

    private void jComboBoxVolleyballSelectDateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxVolleyballSelectDateActionPerformed
    {//GEN-HEADEREND:event_jComboBoxVolleyballSelectDateActionPerformed
       
    }//GEN-LAST:event_jComboBoxVolleyballSelectDateActionPerformed

    private void jButtonBookHandballActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBookHandballActionPerformed
    {//GEN-HEADEREND:event_jButtonBookHandballActionPerformed
        jLabelHandballErrorMessageBook.setVisible(false);
        if(jComboBoxHandballTimeFrom.getSelectedIndex() <= jComboBoxHandballTimeTo.getSelectedIndex()) {
            String handballDate = (String)jComboBoxHandballSelectDate.getSelectedItem();
            String handballTimeFrom = (String)jComboBoxHandballTimeFrom.getSelectedItem();
            String handballTimeTo = (String)jComboBoxHandballTimeTo.getSelectedItem();
            try
            {
                insert.JDBCInsertFacility("12345", "02", handballDate, handballTimeFrom, handballTimeTo, "09098");
            } catch (SQLException ex)
            {
                Logger.getLogger(Facilitet_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {jLabelHandballErrorMessageBook.setVisible(true);}
    }//GEN-LAST:event_jButtonBookHandballActionPerformed

    private void jCheckBoxGolfInstructActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBoxGolfInstructActionPerformed
    {//GEN-HEADEREND:event_jCheckBoxGolfInstructActionPerformed
        if(jCheckBoxGolfInstruct.isSelected())
        {
            jLabelGolfInstructorPrice.setVisible(true);
            jLabelGolfCostText.setVisible(true);
            jLabelGolfInstructHourLabel.setVisible(true);
            jComboBoxGolfInstrucHours.setVisible(true);
            jComboBoxGolfInstrucHours.setSelectedIndex(0);
            jLabelGolfInstructorDateTimeInfo.setVisible(true);
            jLabelGolfInstructorDate.setVisible(true);
            jLabelGolfInstructorTimeFrom.setVisible(true);
            jLabelGolfInstructorTimeTo.setVisible(true);
            jComboBoxGolfInstructorDate.setVisible(true);
            jComboBoxGolfInstructorTimeFrom.setVisible(true);
            jComboBoxGolfInstructorTimeTo.setVisible(true);
        } else
        {
            jLabelGolfCostText.setVisible(false);
            jLabelGolfInstructHourLabel.setVisible(false);
            jComboBoxGolfInstrucHours.setVisible(false);
            jLabelGolfInstructorPrice.setVisible(false);
            jLabelGolfInstructorDateTimeInfo.setVisible(false);
            jLabelGolfInstructorDate.setVisible(false);
            jLabelGolfInstructorTimeFrom.setVisible(false);
            jLabelGolfInstructorTimeTo.setVisible(false);
            jComboBoxGolfInstructorDate.setVisible(false);
            jComboBoxGolfInstructorTimeFrom.setVisible(false);
            jComboBoxGolfInstructorTimeTo.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBoxGolfInstructActionPerformed

    private void jComboBoxGolfInstrucHoursActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxGolfInstrucHoursActionPerformed
    {//GEN-HEADEREND:event_jComboBoxGolfInstrucHoursActionPerformed
        jLabelGolfInstructorPrice.setText("$" + (jComboBoxGolfInstrucHours.getSelectedIndex()) * 40);
    }//GEN-LAST:event_jComboBoxGolfInstrucHoursActionPerformed

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
        if(jListBookedOverview.isSelectionEmpty()) {} else {
            jDialogOverviewDelete.setVisible(true);
            jDialogOverviewDelete.setLocation(900, 300);
        }
    }//GEN-LAST:event_jButtonOverviewDeleteBooking1ActionPerformed

    private void jButtonOverviewEditBooking1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonOverviewEditBooking1ActionPerformed
    {//GEN-HEADEREND:event_jButtonOverviewEditBooking1ActionPerformed
        String[] list = getComboBoxListFromToday();
        jComboBoxOverviewEditBookingDate1.setModel(new javax.swing.DefaultComboBoxModel(list));
        if(jListBookedOverview.isSelectionEmpty()) {} else {
            jDialogOverviewEditBooking.setVisible(true);
            jDialogOverviewEditBooking.setLocation(400, 250);
        }
    }//GEN-LAST:event_jButtonOverviewEditBooking1ActionPerformed

    private void jButtonBadmintonHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBadmintonHelpActionPerformed
    {//GEN-HEADEREND:event_jButtonBadmintonHelpActionPerformed
        jDialogFacilityHelp.setVisible(true);
        jDialogFacilityHelp.setLocation(700, 250);
    }//GEN-LAST:event_jButtonBadmintonHelpActionPerformed

    private void jComboBoxBadmintonInstrucHoursActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxBadmintonInstrucHoursActionPerformed
    {//GEN-HEADEREND:event_jComboBoxBadmintonInstrucHoursActionPerformed
        if(jComboBoxBadmintonInstrucHours.getSelectedIndex()==0) { jLabelBadmintonInstructorPrice.setText(""); }
        else {
        jLabelBadmintonInstructorPrice.setText("$" + (jComboBoxBadmintonInstrucHours.getSelectedIndex()) * 30); }
    }//GEN-LAST:event_jComboBoxBadmintonInstrucHoursActionPerformed

    private void jCheckBoxBadmintonInstructActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBoxBadmintonInstructActionPerformed
    {//GEN-HEADEREND:event_jCheckBoxBadmintonInstructActionPerformed
        if(jCheckBoxBadmintonInstruct.isSelected())
        {
            jLabelBadmintonInstructHourLabel.setVisible(true);
            jComboBoxBadmintonInstrucHours.setVisible(true);
            jComboBoxBadmintonInstrucHours.setSelectedIndex(0);
            jLabelBadmintonInstructorPrice.setVisible(true);
            jLabelBadmintonCostText.setVisible(true);
        } else
        {
            jLabelBadmintonCostText.setVisible(false);
            jLabelBadmintonInstructHourLabel.setVisible(false);
            jComboBoxBadmintonInstrucHours.setVisible(false);
            jLabelBadmintonInstructorPrice.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBoxBadmintonInstructActionPerformed

    private void jComboBoxBadmintonTimeToActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxBadmintonTimeToActionPerformed
    {//GEN-HEADEREND:event_jComboBoxBadmintonTimeToActionPerformed
                jComboBoxBadmintonTimeFrom.setSelectedItem(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12);
                jComboBoxBadmintonTimeTo.setSelectedItem(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12);
        

                if (jComboBoxBadmintonTimeTo.getSelectedIndex() <= jComboBoxBadmintonTimeFrom.getSelectedIndex())
        
        {
                        jLabel92.setText("must be between 1 and 4 hours");
                        jLabel92.setVisible(true);
                    } else
        
        {
                        jLabel92.setText("");
                        jLabel92.setVisible(false);
                    }
        
    }//GEN-LAST:event_jComboBoxBadmintonTimeToActionPerformed

    private void jComboBoxBadmintonTimeFromActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxBadmintonTimeFromActionPerformed
    {//GEN-HEADEREND:event_jComboBoxBadmintonTimeFromActionPerformed

    }//GEN-LAST:event_jComboBoxBadmintonTimeFromActionPerformed

    private void jComboBoxBadmintonSelectDateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxBadmintonSelectDateActionPerformed
    {//GEN-HEADEREND:event_jComboBoxBadmintonSelectDateActionPerformed

    }//GEN-LAST:event_jComboBoxBadmintonSelectDateActionPerformed

    private void jButtonBookBadmintonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBookBadmintonActionPerformed
    {//GEN-HEADEREND:event_jButtonBookBadmintonActionPerformed
        if (select.getfacAvail("02", jComboBoxBadmintonSelectDate.getSelectedItem().toString(), 
                jComboBoxBadmintonTimeFrom.getSelectedItem().toString(), 
                jComboBoxBadmintonTimeTo.getSelectedItem().toString()).size() < 4) 
                {
                    String noHours = jComboBoxBadmintonInstrucHours.getSelectedItem().toString();
                    jLabelBadmintonErrorMessageBook.setVisible(false);
                    jLabelBadmintonErrorMessageNoHours.setVisible(false);
                    if(jComboBoxBadmintonTimeFrom.getSelectedIndex() <= jComboBoxBadmintonTimeTo.getSelectedIndex()) {

                        if(jCheckBoxBadmintonInstruct.isSelected()){

                            if(jComboBoxBadmintonInstrucHours.getSelectedIndex()==0){ jLabelBadmintonErrorMessageNoHours.setVisible(true); }
                            else {
                                String badmintonDate = (String)jComboBoxBadmintonSelectDate.getSelectedItem();
                                String badmintonTimeFrom = (String)jComboBoxBadmintonTimeFrom.getSelectedItem();
                                String badmintonTimeTo = (String)jComboBoxBadmintonTimeTo.getSelectedItem();
                                try
                                {
                                    insert.JDBCInsertFacility("12345", "02", badmintonDate, badmintonTimeFrom, badmintonTimeTo, "09098");
                                } catch (SQLException ex)
                                {
                                    Logger.getLogger(Facilitet_GUI.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                try
                                {
                                    insert.JDBCInsertInstructorCost("12345", noHours, 02);
                                } catch (SQLException ex)
                                {
                                    Logger.getLogger(Facilitet_GUI.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            jLabelBadmintonErrorMessageNoHours.setVisible(false);                  
                            }
                        } else {
                                String badmintonDate = (String)jComboBoxBadmintonSelectDate.getSelectedItem();
                                String badmintonTimeFrom = (String)jComboBoxBadmintonTimeFrom.getSelectedItem();
                                String badmintonTimeTo = (String)jComboBoxBadmintonTimeTo.getSelectedItem();
                            try
                            {
                                insert.JDBCInsertFacility("12345", "02", badmintonDate, badmintonTimeFrom, badmintonTimeTo, "09098");
                            } catch (SQLException ex)
                            {
                                Logger.getLogger(Facilitet_GUI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            try
                            {
                                insert.JDBCInsertInstructorCost("12345", noHours, 02);
                            } catch (SQLException ex)
                            {
                                Logger.getLogger(Facilitet_GUI.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    } else {
                        jLabelBadmintonErrorMessageBook.setVisible(true); }  
                } else {System.out.println("Well met!"); }
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
        if(jComboBoxFitnessTimeFrom.getSelectedIndex() <= jComboBoxFitnessTimeTo.getSelectedIndex()) {
            
                String fitnessDate = (String)jComboBoxFitnessSelectDate.getSelectedItem();
                String fitnessTimeFrom = (String)jComboBoxFitnessTimeFrom.getSelectedItem();
                String fitnessTimeTo = (String)jComboBoxFitnessTimeTo.getSelectedItem();
            try
            {
                insert.JDBCInsertFacility("12345", "02", fitnessDate, fitnessTimeFrom, fitnessTimeTo, "09098");
            } catch (SQLException ex)
            {
                Logger.getLogger(Facilitet_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
 
            jLabelFitnessErrorMessageBook1.setVisible(false);   
        } else {
            jLabelFitnessErrorMessageBook1.setVisible(true); } 
    }//GEN-LAST:event_jButtonBookFitnessActionPerformed

    private void jButtonBookVolleyActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBookVolleyActionPerformed
    {//GEN-HEADEREND:event_jButtonBookVolleyActionPerformed
        jLabelVolleyballErrorMessageBook.setVisible(false);
        if(jComboBoxVolleyballTimeFrom.getSelectedIndex() <= jComboBoxVolleyballTimeTo.getSelectedIndex()) {
            String volleyballDate = (String)jComboBoxVolleyballSelectDate.getSelectedItem();
            String volleyTimeFrom = (String)jComboBoxVolleyballTimeFrom.getSelectedItem();
            String volleyTimeTo = (String)jComboBoxVolleyballTimeTo.getSelectedItem();
            try
            {
                insert.JDBCInsertFacility("12345", "02", volleyballDate, volleyTimeFrom, volleyTimeTo, "09098");
            } catch (SQLException ex)
            {
                Logger.getLogger(Facilitet_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{jLabelVolleyballErrorMessageBook.setVisible(true);}
    }//GEN-LAST:event_jButtonBookVolleyActionPerformed

    private void jButtonBookTennisActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBookTennisActionPerformed
    {//GEN-HEADEREND:event_jButtonBookTennisActionPerformed
        jLabelTennisErrorMessageBook.setVisible(false);
        jLabelTennisErrorMessageNoHours.setVisible(false);
        if(jComboBoxTennisTimeFrom.getSelectedIndex() <= jComboBoxTennisTimeTo.getSelectedIndex()) {
        
            if(jComboBoxTennisInstrucHours.getSelectedIndex()==0){ jLabelTennisErrorMessageNoHours.setVisible(true); }
            else {
                String tennisballDate = (String)jComboBoxTennisSelectDate.getSelectedItem();
                String tennisTimeFrom = (String)jComboBoxTennisTimeFrom.getSelectedItem();
                String tennisTimeTo = (String)jComboBoxTennisTimeTo.getSelectedItem();
                try
                {
                    insert.JDBCInsertFacility("12345", "02", tennisballDate, tennisTimeFrom, tennisTimeTo, "09098");
                } catch (SQLException ex)
                {
                    Logger.getLogger(Facilitet_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
        jLabelTennisErrorMessageNoHours.setVisible(false);   
        }} else {jLabelTennisErrorMessageBook.setVisible(true); } 
    }//GEN-LAST:event_jButtonBookTennisActionPerformed

    private void jComboBoxGolfInstructorDateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxGolfInstructorDateActionPerformed
    {//GEN-HEADEREND:event_jComboBoxGolfInstructorDateActionPerformed

    }//GEN-LAST:event_jComboBoxGolfInstructorDateActionPerformed

    private void jButtonPrintInstrucCostActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonPrintInstrucCostActionPerformed
    {//GEN-HEADEREND:event_jButtonPrintInstrucCostActionPerformed
        select.printBill("12345");
    }//GEN-LAST:event_jButtonPrintInstrucCostActionPerformed

    private void jButtonLoadBookingsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonLoadBookingsActionPerformed
    {//GEN-HEADEREND:event_jButtonLoadBookingsActionPerformed
        loadListOverview();
    }//GEN-LAST:event_jButtonLoadBookingsActionPerformed

    private void jButtonOverviewDeleteYes1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonOverviewDeleteYes1ActionPerformed
    {//GEN-HEADEREND:event_jButtonOverviewDeleteYes1ActionPerformed
        int a = jListBookedOverview.getSelectedIndex();
        //delete.JDBCDeleteFacBooking(tempBookOverview.get(a).getGuestID(), tempBookOverview.get(a).getFacID(), tempBookOverview.get(a).getTimeStart());
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
        try
        {
            update.updateFacBook("12345", jComboBoxOverviewEditBookingDate1.getSelectedItem().toString(),
            (jComboBoxOverviewEditBookingTimeFrom1.getSelectedIndex()+8)+"", (jComboBoxOverviewEditBookingTimeFrom1.getSelectedIndex()+9)+"",
            tempBookOverview.get(a).getTimeStart(), tempBookOverview.get(a).getFacDate());
        } catch (SQLException ex)
        {
            Logger.getLogger(Facilitet_GUI.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("That was a mistake...");
        }
    }//GEN-LAST:event_jButtonOverviewEditBookingSaveChanges1ActionPerformed

    private void jComboBoxOverviewEditBookingTimeFrom1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxOverviewEditBookingTimeFrom1ActionPerformed
    {//GEN-HEADEREND:event_jComboBoxOverviewEditBookingTimeFrom1ActionPerformed

    }//GEN-LAST:event_jComboBoxOverviewEditBookingTimeFrom1ActionPerformed

    private void jButtonBookGolfActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBookGolfActionPerformed
    {//GEN-HEADEREND:event_jButtonBookGolfActionPerformed
        jLabelGolfErrorMessageBook.setVisible(false);
        jLabelGolfErrorMessageNoHours.setVisible(false);
        if(jComboBoxGolfInstructorTimeFrom.getSelectedIndex() <= jComboBoxGolfInstructorTimeTo.getSelectedIndex()) {
            if(jComboBoxGolfInstrucHours.getSelectedIndex()==0){ jLabelGolfErrorMessageNoHours.setVisible(true); }
                else {
                    jLabelGolfErrorMessageNoHours.setVisible(false);  
                    String golfDate = (String)jComboBoxGolfInstructorDate.getSelectedItem();
                    String golfTimeFrom = (String)jComboBoxGolfInstructorTimeFrom.getSelectedItem();
                    String golfTimeTo = (String)jComboBoxGolfInstructorTimeTo.getSelectedItem();
                try
                {
                    insert.JDBCInsertFacility("12345", "05", golfDate, golfTimeFrom, golfTimeTo, "09098");
                } catch (SQLException ex)
                {
                    Logger.getLogger(Facilitet_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                    jLabelGolfErrorMessageBook.setVisible(false);   
                {
                jLabelGolfErrorMessageBook.setVisible(true); } }
            }else{jLabelGolfErrorMessageNoHours.setVisible(true);}
    }//GEN-LAST:event_jButtonBookGolfActionPerformed

    private void jButtonBookSwimmingActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBookSwimmingActionPerformed
    {//GEN-HEADEREND:event_jButtonBookSwimmingActionPerformed
        jLabelSwimmingErrorMessageBook.setVisible(false);
        jLabelSwimmingErrorMessageNoHours.setVisible(false);
        if(jComboBoxSwimmingInstructorTimeFrom.getSelectedIndex() <= jComboBoxSwimmingInstructorTimeTo.getSelectedIndex()) {
            if(jComboBoxSwimmingInstrucHours.getSelectedIndex()==0){ jLabelSwimmingErrorMessageNoHours.setVisible(true); }
                else {
                    jLabelSwimmingErrorMessageNoHours.setVisible(false);  
                    String golfDate = (String)jComboBoxSwimmingInstructorDate.getSelectedItem();
                    String golfTimeFrom = (String)jComboBoxSwimmingInstructorTimeFrom.getSelectedItem();
                    String golfTimeTo = (String)jComboBoxSwimmingInstructorTimeTo.getSelectedItem();
                try
                {
                    insert.JDBCInsertFacility("12345", "05", golfDate, golfTimeFrom, golfTimeTo, "09098");
                } catch (SQLException ex)
                {
                    Logger.getLogger(Facilitet_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                    jLabelGolfErrorMessageBook.setVisible(false);   
                {
                jLabelGolfErrorMessageBook.setVisible(true); } }
            }else{jLabelGolfErrorMessageNoHours.setVisible(true);}
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
        loadWaitlistOverview("54321");
    }//GEN-LAST:event_jButtonGetWaitOverviewActionPerformed

    private void jButtonSignInActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonSignInActionPerformed
    {//GEN-HEADEREND:event_jButtonSignInActionPerformed
        jLabelOverviewGuestID.setText("sdsjds");
        
        //finalGuestID = jTextFieldFinalGuestID.getText();
        //jLabelOverviewGuestID.setText(finalGuestID);
        //jLabelOverviewGuestID.setVisible(true);
        jDialogLogIn.setVisible(false);
    }//GEN-LAST:event_jButtonSignInActionPerformed

    private void loginPop() {
        jDialogLogIn.setSize(300, 150);
        jDialogLogIn.setVisible(true);
        jDialogLogIn.setLocation(700, 250);
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
                new Facilitet_GUI().loginPop();
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
    private javax.swing.JButton jButtonSignIn;
    private javax.swing.JButton jButtonSwimmingHelp;
    private javax.swing.JButton jButtonTennisHelp;
    private javax.swing.JButton jButtonVolleybalHelp;
    private javax.swing.JCheckBox jCheckBoxBadmintonInstruct;
    private javax.swing.JCheckBox jCheckBoxGolfInstruct;
    private javax.swing.JCheckBox jCheckBoxSwimmingInstruct;
    private javax.swing.JCheckBox jCheckBoxTennisInstruct;
    private javax.swing.JComboBox jComboBoxBadmintonInstrucHours;
    private javax.swing.JComboBox jComboBoxBadmintonSelectDate;
    private javax.swing.JComboBox jComboBoxBadmintonTimeFrom;
    private javax.swing.JComboBox jComboBoxBadmintonTimeTo;
    private javax.swing.JComboBox jComboBoxFitnessSelectDate;
    private javax.swing.JComboBox jComboBoxFitnessTimeFrom;
    private javax.swing.JComboBox jComboBoxFitnessTimeTo;
    private javax.swing.JComboBox jComboBoxGolfInstrucHours;
    private javax.swing.JComboBox jComboBoxGolfInstructorDate;
    private javax.swing.JComboBox jComboBoxGolfInstructorTimeFrom;
    private javax.swing.JComboBox jComboBoxGolfInstructorTimeTo;
    private javax.swing.JComboBox jComboBoxHandballSelectDate;
    private javax.swing.JComboBox jComboBoxHandballTimeFrom;
    private javax.swing.JComboBox jComboBoxHandballTimeTo;
    private javax.swing.JComboBox jComboBoxOverviewEditBookingDate1;
    private javax.swing.JComboBox jComboBoxOverviewEditBookingTimeFrom1;
    private javax.swing.JComboBox jComboBoxSwimmingInstrucHours;
    private javax.swing.JComboBox jComboBoxSwimmingInstructorDate;
    private javax.swing.JComboBox jComboBoxSwimmingInstructorTimeFrom;
    private javax.swing.JComboBox jComboBoxSwimmingInstructorTimeTo;
    private javax.swing.JComboBox jComboBoxTennisInstrucHours;
    private javax.swing.JComboBox jComboBoxTennisSelectDate;
    private javax.swing.JComboBox jComboBoxTennisTimeFrom;
    private javax.swing.JComboBox jComboBoxTennisTimeTo;
    private javax.swing.JComboBox jComboBoxVolleyballSelectDate;
    private javax.swing.JComboBox jComboBoxVolleyballTimeFrom;
    private javax.swing.JComboBox jComboBoxVolleyballTimeTo;
    private javax.swing.JDialog jDialogFacilityHelp;
    private javax.swing.JDialog jDialogFacilityInstrucHelp;
    private javax.swing.JDialog jDialogLogIn;
    private javax.swing.JDialog jDialogOverviewDelete;
    private javax.swing.JDialog jDialogOverviewEditBooking;
    private javax.swing.JDialog jDialogOverviewHelp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
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
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLabel jLabelAlreadyBooked;
    private javax.swing.JLabel jLabelBadmintonCostText;
    private javax.swing.JLabel jLabelBadmintonErrorMessageBook;
    private javax.swing.JLabel jLabelBadmintonErrorMessageNoHours;
    private javax.swing.JLabel jLabelBadmintonInstructHourLabel;
    private javax.swing.JLabel jLabelBadmintonInstructorPrice;
    private javax.swing.JLabel jLabelFitnessErrorMessageBook1;
    private javax.swing.JLabel jLabelGUIISBULLSHIT;
    private javax.swing.JLabel jLabelGolfCostText;
    private javax.swing.JLabel jLabelGolfErrorMessageBook;
    private javax.swing.JLabel jLabelGolfErrorMessageNoHours;
    private javax.swing.JLabel jLabelGolfInstructHourLabel;
    private javax.swing.JLabel jLabelGolfInstructorDate;
    private javax.swing.JLabel jLabelGolfInstructorDateTimeInfo;
    private javax.swing.JLabel jLabelGolfInstructorPrice;
    private javax.swing.JLabel jLabelGolfInstructorTimeFrom;
    private javax.swing.JLabel jLabelGolfInstructorTimeTo;
    private javax.swing.JLabel jLabelHandballErrorMessageBook;
    private javax.swing.JLabel jLabelOverviewGuestID;
    private javax.swing.JLabel jLabelSwimmingErrorMessageBook;
    private javax.swing.JLabel jLabelSwimmingErrorMessageNoHours;
    private javax.swing.JLabel jLabelSwimmingInstructHourLabel;
    private javax.swing.JLabel jLabelSwimmingInstructorDate;
    private javax.swing.JLabel jLabelSwimmingInstructorDateTimeInfo;
    private javax.swing.JLabel jLabelSwimmingInstructorPrice;
    private javax.swing.JLabel jLabelSwimmingInstructorTimeFrom;
    private javax.swing.JLabel jLabelSwimmingInstructorTimeTo;
    private javax.swing.JLabel jLabelSwimmingPriceLabel;
    private javax.swing.JLabel jLabelTennisCostText;
    private javax.swing.JLabel jLabelTennisErrorMessageBook;
    private javax.swing.JLabel jLabelTennisErrorMessageNoHours;
    private javax.swing.JLabel jLabelTennisInstructHourLabel;
    private javax.swing.JLabel jLabelTennisInstructorPrice;
    private javax.swing.JLabel jLabelVolleyballErrorMessageBook;
    private javax.swing.JList jListBookedOverview;
    private javax.swing.JList jListWaitOverview;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
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
    private javax.swing.JTextField jTextFieldFinalGuestID;
    // End of variables declaration//GEN-END:variables
}
