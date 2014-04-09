/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.DefaultListModel;



/**
 *
 * @author Jonas
 **/
public class Facilitet_GUI extends javax.swing.JFrame
{
    private SimpleDateFormat cDate = new SimpleDateFormat("dd");
    private SimpleDateFormat cMonth = new SimpleDateFormat("MM");
    private SimpleDateFormat cYear = new SimpleDateFormat("yy");
    JDBCInsertQuery insert = new JDBCInsertQuery();
    JDBCSelectQuery select = new JDBCSelectQuery();
    JDBCDeleteQuery delete = new JDBCDeleteQuery();
    JDBCUpdateQuery update = new JDBCUpdateQuery();
    DefaultListModel bookedOverview = new DefaultListModel();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
    ArrayList<BookedOverviewConstructor> tempBookOverview = new ArrayList<>();
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
        presentDate.set(currentDate, (currentMonth - 1), currentYear);
        String[] listOfDates = null;
        listOfDates[0] = sdf.format(presentDate.getTime());
        for(int i = 1; i<8; i++)
        {
            presentDate.add(Calendar.DAY_OF_MONTH, i);
            listOfDates[i] = sdf.format(presentDate.getTime());
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jDialogFacilityHelp = new javax.swing.JDialog();
        jPanelFacilityHelp = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5Overview = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jButtonOverviewEditBooking1 = new javax.swing.JButton();
        jButtonOverviewDeleteBooking1 = new javax.swing.JButton();
        jLabel91 = new javax.swing.JLabel();
        jButtonOverviewHelp = new javax.swing.JButton();
        jLabelOverviewGuestID = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jButtonPrintInstrucCost = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListBookedOverview = new javax.swing.JList();
        jButtonLoadBookings = new javax.swing.JButton();
        jPanel1Badminton = new javax.swing.JPanel();
        jButtonBookBadminton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
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
        jLabel2 = new javax.swing.JLabel();
        jCheckBoxBadmintonInstruct = new javax.swing.JCheckBox();
        jLabelBadmintonInstructHourLabel = new javax.swing.JLabel();
        jComboBoxBadmintonInstrucHours = new javax.swing.JComboBox();
        jLabelBadmintonInstructorPrice = new javax.swing.JLabel();
        jLabelBadmintonPriceLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonBadmintonHelp = new javax.swing.JButton();
        jLabel105 = new javax.swing.JLabel();
        jPanel2Fitness = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jButtonBookFitness = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jComboBoxFitnessTimeFrom = new javax.swing.JComboBox();
        jComboBoxFitnessTimeTo = new javax.swing.JComboBox();
        jComboBoxFitnessSelectDate = new javax.swing.JComboBox();
        jLabel32 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jButtonFitnessHelp = new javax.swing.JButton();
        jLabel113 = new javax.swing.JLabel();
        jPanel3Golf = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButtonBookGolf = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabelGolfInstructHourLabel = new javax.swing.JLabel();
        jComboBoxGolfInstrucHours = new javax.swing.JComboBox();
        jLabelGolfPriceLabel = new javax.swing.JLabel();
        jLabelGolfInstructorPrice = new javax.swing.JLabel();
        jCheckBoxGolfInstruct = new javax.swing.JCheckBox();
        jLabel108 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jComboBoxGolfInstructorDate = new javax.swing.JComboBox();
        jLabelGolfInstructorDateTimeInfo = new javax.swing.JLabel();
        jLabelGolfInstructorTimeFrom = new javax.swing.JLabel();
        jComboBoxGolfInstructorTimeFrom = new javax.swing.JComboBox();
        jLabelGolfInstructorDate = new javax.swing.JLabel();
        jLabelGolfInstructorTimeTo = new javax.swing.JLabel();
        jComboBoxGolfInstructorTimeTo = new javax.swing.JComboBox();
        jPanel1Handball = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jComboBoxHandballSelectDate = new javax.swing.JComboBox();
        jComboBoxHandballTimeFrom = new javax.swing.JComboBox();
        jComboBoxHandballTimeTo = new javax.swing.JComboBox();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jButtonBookHandball = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jButtonHandBallHelp = new javax.swing.JButton();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jPanel4MountainBike = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jPanel6TableTennis = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jPanel8Volleyball = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButtonBookVolley = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jComboBoxVolleyballSelectDate = new javax.swing.JComboBox();
        jLabel76 = new javax.swing.JLabel();
        jComboBoxVolleyballTimeFrom = new javax.swing.JComboBox();
        jLabel77 = new javax.swing.JLabel();
        jComboBoxVolleyballTimeTo = new javax.swing.JComboBox();
        jLabel39 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jButtonVolleybalHelp = new javax.swing.JButton();
        jLabel111 = new javax.swing.JLabel();
        jPanel7Tennis = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButtonBookTennis = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBoxTennisInstruct = new javax.swing.JCheckBox();
        jLabelTennisInstructHourLabel = new javax.swing.JLabel();
        jComboBoxTennisInstrucHours = new javax.swing.JComboBox();
        jLabelTennisPriceLabel = new javax.swing.JLabel();
        jLabelTennisInstructorPrice = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jComboBoxTennisSelectDate = new javax.swing.JComboBox();
        jLabel86 = new javax.swing.JLabel();
        jComboBoxTennisTimeFrom = new javax.swing.JComboBox();
        jLabel87 = new javax.swing.JLabel();
        jComboBoxTennisTimeTo = new javax.swing.JComboBox();
        jLabel68 = new javax.swing.JLabel();
        jButtonTennisHelp = new javax.swing.JButton();
        jLabel112 = new javax.swing.JLabel();
        jPanel5Swimming = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButtonBookSwimming = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jCheckBoxSwimmingInstruct = new javax.swing.JCheckBox();
        jLabelSwimmingInstructHourLabel = new javax.swing.JLabel();
        jComboBoxSwimmingInstrucHours = new javax.swing.JComboBox();
        jLabelSwimmingPriceLabel = new javax.swing.JLabel();
        jLabelSwimmingInstructorPrice = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jComboBoxSwimmingInstructorDate = new javax.swing.JComboBox();
        jComboBoxSwimmingInstructorTimeFrom = new javax.swing.JComboBox();
        jComboBoxSwimmingInstructorTimeTo = new javax.swing.JComboBox();
        jLabelSwimmingInstructorTimeFrom = new javax.swing.JLabel();
        jLabelSwimmingInstructorTimeTo = new javax.swing.JLabel();
        jLabelSwimmingInstructorDate = new javax.swing.JLabel();
        jLabelSwimmingInstructorDateTimeInfo = new javax.swing.JLabel();

        jDialogFacilityHelp.setMinimumSize(new java.awt.Dimension(435, 145));

        jPanelFacilityHelp.setMinimumSize(new java.awt.Dimension(400, 140));

        jLabel96.setText("You can book up to 4 facilities, as long as you dont exceed 4 hours per day");

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel72.setText("Help");

        jLabel93.setText("Use the scroll-panel to select the date and time you wish to play");

        jLabel95.setText("You can book between 1 and 4 hours. (max 4 hours per day)");

        javax.swing.GroupLayout jPanelFacilityHelpLayout = new javax.swing.GroupLayout(jPanelFacilityHelp);
        jPanelFacilityHelp.setLayout(jPanelFacilityHelpLayout);
        jPanelFacilityHelpLayout.setHorizontalGroup(
            jPanelFacilityHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFacilityHelpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFacilityHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel95)
                    .addComponent(jLabel72)
                    .addComponent(jLabel93)
                    .addComponent(jLabel96))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanelFacilityHelpLayout.setVerticalGroup(
            jPanelFacilityHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFacilityHelpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel72)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel95)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel96)
                .addContainerGap(47, Short.MAX_VALUE))
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

        jLabel91.setText("venteliste");

        jButtonOverviewHelp.setText("Help");
        jButtonOverviewHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonOverviewHelpActionPerformed(evt);
            }
        });

        jLabelOverviewGuestID.setText("12345");

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

        javax.swing.GroupLayout jPanel5OverviewLayout = new javax.swing.GroupLayout(jPanel5Overview);
        jPanel5Overview.setLayout(jPanel5OverviewLayout);
        jPanel5OverviewLayout.setHorizontalGroup(
            jPanel5OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5OverviewLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel5OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5OverviewLayout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLoadBookings)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5OverviewLayout.createSequentialGroup()
                        .addGroup(jPanel5OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel5OverviewLayout.createSequentialGroup()
                                    .addComponent(jLabel71)
                                    .addGap(54, 54, 54)
                                    .addComponent(jLabelOverviewGuestID))
                                .addGroup(jPanel5OverviewLayout.createSequentialGroup()
                                    .addComponent(jLabel70)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel116)))
                            .addComponent(jLabel91)
                            .addGroup(jPanel5OverviewLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(jPanel5OverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonOverviewDeleteBooking1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonOverviewEditBooking1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonOverviewHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(194, Short.MAX_VALUE))))
            .addGroup(jPanel5OverviewLayout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(jButtonPrintInstrucCost)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addGap(38, 38, 38)
                .addComponent(jLabel91)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(jButtonPrintInstrucCost)
                .addGap(69, 69, 69))
        );

        jTabbedPane1.addTab("Overview", jPanel5Overview);

        jButtonBookBadminton.setText("BOOK");
        jButtonBookBadminton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBookBadmintonActionPerformed(evt);
            }
        });

        jLabel7.setText("The facilities are available between 8am - 8pm every day");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/BadmintonRESIZED.jpg"))); // NOI18N

        jLabel15.setText("The cost for the instructor has been added to your bill ");

        jLabel16.setText("Select the date and hour/hours you wish to play");

        jLabel17.setText("Date:");

        jLabel19.setText("<html>Badminton is a racquet sport usually played individually against each other <br>but can also be a 2v2 team sport. Bring your sweaty pants <br> and prepare for loads of fun and action in a game of strength, speed and <br> skills. Our highly experienced instructors are always available for hire</html>");

        jComboBoxBadmintonSelectDate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxBadmintonSelectDateActionPerformed(evt);
            }
        });

        jComboBoxBadmintonTimeFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8 am", "9 am", "10 am", "11 am", "12 am", "1 pm", "2 pm", "3 pm", "4 pm", "5 pm", "6 pm", "7 pm" }));
        jComboBoxBadmintonTimeFrom.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxBadmintonTimeFromActionPerformed(evt);
            }
        });

        jLabel27.setText("To");

        jComboBoxBadmintonTimeTo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9 am", "10 am", "11 am", "12 am", "1 pm", "2 pm", "3 pm", "4 pm", "5 pm", "6 pm", "7 pm", "8 pm" }));
        jComboBoxBadmintonTimeTo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxBadmintonTimeToActionPerformed(evt);
            }
        });

        jLabel28.setText("(max 4 facilities allowed per guest/day)");

        jLabel29.setText("From:");

        jLabel2.setText("Do you wish to hire an instructor?");

        jCheckBoxBadmintonInstruct.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jCheckBoxBadmintonInstructActionPerformed(evt);
            }
        });

        jComboBoxBadmintonInstrucHours.setVisible(false);
        jComboBoxBadmintonInstrucHours.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        jComboBoxBadmintonInstrucHours.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxBadmintonInstrucHoursActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("BADMINTON");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelBadmintonPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabelBadmintonInstructorPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(8, 8, 8)
                            .addComponent(jCheckBoxBadmintonInstruct, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabelBadmintonInstructHourLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9)
                            .addComponent(jComboBoxBadmintonInstrucHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxBadmintonInstruct, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxBadmintonInstrucHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelBadmintonInstructHourLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBadmintonPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBadmintonInstructorPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jButtonBadmintonHelp.setText("Help");
        jButtonBadmintonHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBadmintonHelpActionPerformed(evt);
            }
        });

        jLabel105.setText("<html>Useful info: <br> There are a total of 4 badminton courts, each with 4 players max/court. <br> The equipment will be given to you.");

        javax.swing.GroupLayout jPanel1BadmintonLayout = new javax.swing.GroupLayout(jPanel1Badminton);
        jPanel1Badminton.setLayout(jPanel1BadmintonLayout);
        jPanel1BadmintonLayout.setHorizontalGroup(
            jPanel1BadmintonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1BadmintonLayout.createSequentialGroup()
                .addGroup(jPanel1BadmintonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1BadmintonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1BadmintonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1BadmintonLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15))
                            .addGroup(jPanel1BadmintonLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonBookBadminton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77))
                            .addGroup(jPanel1BadmintonLayout.createSequentialGroup()
                                .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1BadmintonLayout.createSequentialGroup()
                        .addGroup(jPanel1BadmintonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1BadmintonLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1BadmintonLayout.createSequentialGroup()
                                .addGroup(jPanel1BadmintonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1BadmintonLayout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(jLabel16))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1BadmintonLayout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBoxBadmintonSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel29)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1BadmintonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addGroup(jPanel1BadmintonLayout.createSequentialGroup()
                                        .addComponent(jComboBoxBadmintonTimeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxBadmintonTimeTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13)
                                        .addComponent(jButtonBadmintonHelp)))
                                .addGap(23, 23, 23)))
                        .addComponent(jLabel8)
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        jPanel1BadmintonLayout.setVerticalGroup(
            jPanel1BadmintonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1BadmintonLayout.createSequentialGroup()
                .addGroup(jPanel1BadmintonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1BadmintonLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1BadmintonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1BadmintonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jComboBoxBadmintonSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxBadmintonTimeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(jComboBoxBadmintonTimeTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(jButtonBadmintonHelp))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1BadmintonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1BadmintonLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1BadmintonLayout.createSequentialGroup()
                        .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)))
                .addComponent(jButtonBookBadminton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1BadmintonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18))
        );

        jTabbedPane1.addTab("Badminton", jPanel1Badminton);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("FITNESS CENTER");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Fitness CenterRESIZED.jpg"))); // NOI18N

        jLabel24.setText("<html>Our Fitness room allows you to train your body exactly how you want it.<br> The fitness center has all kinds of equipment so there is something for everyone.");

        jLabel50.setText("The facilities are available between 8am - 8pm every day");

        jButtonBookFitness.setText("BOOK");
        jButtonBookFitness.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBookFitnessActionPerformed(evt);
            }
        });

        jLabel30.setText("Select the date and hour/hours you wish use the Fitness center.");

        jLabel31.setText("Date:");

        jLabel33.setText("From:");

        jLabel34.setText("To");

        jComboBoxFitnessTimeFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8 am", "9 am", "10 am", "11 am", "12 am", "1 pm", "2 pm", "3 pm", "4 pm", "5 pm", "6 pm", "7 pm" }));
        jComboBoxFitnessTimeFrom.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxFitnessTimeFromActionPerformed(evt);
            }
        });

        jComboBoxFitnessTimeTo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9 am", "10 am", "11 am", "12 am", "1 pm", "2 pm", "3 pm", "4 pm", "5 pm", "6 pm", "7 pm", "8 pm" }));

        jComboBoxFitnessSelectDate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxFitnessSelectDateActionPerformed(evt);
            }
        });

        jLabel32.setText("Our holliday-resort does not provide instructors for this facility.");

        jLabel44.setText("(max 4 hours allowed per guest/day)");

        jButtonFitnessHelp.setText("Help");
        jButtonFitnessHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonFitnessHelpActionPerformed(evt);
            }
        });

        jLabel113.setText("<html>Useful info: <br> The Fitness room limits 20 people. <br> The equipment be given to you.");

        javax.swing.GroupLayout jPanel2FitnessLayout = new javax.swing.GroupLayout(jPanel2Fitness);
        jPanel2Fitness.setLayout(jPanel2FitnessLayout);
        jPanel2FitnessLayout.setHorizontalGroup(
            jPanel2FitnessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2FitnessLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel2FitnessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel32)
                    .addGroup(jPanel2FitnessLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxFitnessSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2FitnessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addGroup(jPanel2FitnessLayout.createSequentialGroup()
                                .addComponent(jComboBoxFitnessTimeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxFitnessTimeTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButtonFitnessHelp))))
                    .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(79, 79, 79))
            .addGroup(jPanel2FitnessLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2FitnessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2FitnessLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel2FitnessLayout.createSequentialGroup()
                        .addGroup(jPanel2FitnessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel50)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2FitnessLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonBookFitness, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
        );
        jPanel2FitnessLayout.setVerticalGroup(
            jPanel2FitnessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2FitnessLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(36, 36, 36)
                .addGroup(jPanel2FitnessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2FitnessLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBookFitness, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(jPanel2FitnessLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel32)
                        .addGap(121, 121, 121)
                        .addComponent(jLabel30)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2FitnessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34)
                            .addComponent(jComboBoxFitnessTimeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxFitnessTimeTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxFitnessSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonFitnessHelp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel44)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 126, Short.MAX_VALUE)))
                .addComponent(jLabel50)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Fitness", jPanel2Fitness);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/GolfRESIZED.jpg"))); // NOI18N

        jLabel25.setText("<html> Outdoor golf in a huge area in an exotic environment. <br> You dont have to book time just show up and swing your club.");

        jButtonBookGolf.setText("BOOK");

        jLabel56.setText("The cost for the instructor has been added to your bill ");

        jLabel57.setText("The facilities are available between 8am - 8pm every day");

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel58.setText("GOLF");

        jLabel67.setText("Do you wish to hire an instructor?");

        jLabelGolfInstructHourLabel.setText("                       ");

        jComboBoxGolfInstrucHours.setVisible(false);
        jComboBoxGolfInstrucHours.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        jComboBoxGolfInstrucHours.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxGolfInstrucHoursActionPerformed(evt);
            }
        });

        jLabelGolfPriceLabel.setText("       ");

        jLabelGolfInstructorPrice.setText("          ");

        jCheckBoxGolfInstruct.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jCheckBoxGolfInstructActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel58)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelGolfPriceLabel)
                        .addGap(12, 12, 12)
                        .addComponent(jLabelGolfInstructorPrice))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxGolfInstruct)
                        .addGap(28, 28, 28)
                        .addComponent(jLabelGolfInstructHourLabel)
                        .addGap(32, 32, 32)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxGolfInstrucHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxGolfInstruct)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelGolfInstructHourLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxGolfInstrucHours))
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelGolfPriceLabel)
                    .addComponent(jLabelGolfInstructorPrice)))
        );

        jLabel108.setText("<html>Useful info: <br> There are no player limits on this facility.<br> The equipment will be given to you.");

        jLabel80.setText("This facility does not require Time-booking, it is free to use for any guest at our resort.");

        jComboBoxGolfInstructorDate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxGolfInstructorDateActionPerformed(evt);
            }
        });
        jComboBoxGolfInstructorDate.setVisible(false);

        jLabelGolfInstructorDateTimeInfo.setText("On which date and time:");

        jLabelGolfInstructorTimeFrom.setText("From:");
        jLabelGolfInstructorTimeFrom.setVisible(false);

        jComboBoxGolfInstructorTimeFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8 am", "9 am", "10 am", "11 am", "12 am", "1 pm", "2 pm", "3 pm", "4 pm", "5 pm", "6 pm", "7 pm" }));
        jComboBoxGolfInstructorTimeFrom.setVisible(false);

        jLabelGolfInstructorDate.setText("Date:");
        jLabelGolfInstructorDate.setVisible(false);

        jLabelGolfInstructorTimeTo.setText("To:");
        jLabelGolfInstructorTimeTo.setVisible(false);

        jComboBoxGolfInstructorTimeTo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9 am", "10 am", "11 am", "12 am", "1 pm", "2 pm", "3 pm", "4 pm", "5 pm", "6 pm", "7 pm", "8 pm" }));
        jComboBoxGolfInstructorTimeTo.setVisible(false);

        javax.swing.GroupLayout jPanel3GolfLayout = new javax.swing.GroupLayout(jPanel3Golf);
        jPanel3Golf.setLayout(jPanel3GolfLayout);
        jPanel3GolfLayout.setHorizontalGroup(
            jPanel3GolfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3GolfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3GolfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3GolfLayout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel56))
                    .addGroup(jPanel3GolfLayout.createSequentialGroup()
                        .addGroup(jPanel3GolfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelGolfInstructorDateTimeInfo)
                            .addGroup(jPanel3GolfLayout.createSequentialGroup()
                                .addComponent(jLabelGolfInstructorDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxGolfInstructorDate, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jLabelGolfInstructorTimeFrom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxGolfInstructorTimeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelGolfInstructorTimeTo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxGolfInstructorTimeTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel80))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(jPanel3GolfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3GolfLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonBookGolf, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        jPanel3GolfLayout.setVerticalGroup(
            jPanel3GolfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3GolfLayout.createSequentialGroup()
                .addGroup(jPanel3GolfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3GolfLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3GolfLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabelGolfInstructorDateTimeInfo)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3GolfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxGolfInstructorDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelGolfInstructorTimeFrom)
                            .addComponent(jComboBoxGolfInstructorTimeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelGolfInstructorDate)
                            .addComponent(jLabelGolfInstructorTimeTo)
                            .addComponent(jComboBoxGolfInstructorTimeTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(jLabel80)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jButtonBookGolf, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3GolfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57))
                .addContainerGap())
        );

        jLabelGolfInstructorDateTimeInfo.setVisible(false);

        jTabbedPane1.addTab("Golf", jPanel3Golf);

        jLabel5.setText("<html>Handball is a teamsport usually 6 players on each team. <br> Test your accuracy and have fun with your teammates. ");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/HandballRESIZED.jpg"))); // NOI18N

        jComboBoxHandballTimeFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8 am", "9 am", "10 am", "11 am", "12 am", "1 pm", "2 pm", "3 pm", "4 pm", "5 pm", "6 pm", "7 pm" }));

        jComboBoxHandballTimeTo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9 am", "10 am", "11 am", "12 am", "1 pm", "2 pm", "3 pm", "4 pm", "5 pm", "6 pm", "7 pm", "8 pm" }));

        jLabel45.setText("Select the date and hour/hours you wish to play");

        jLabel46.setText("Date");

        jLabel47.setText("From:");

        jLabel55.setText("To:");

        jButtonBookHandball.setText("BOOK");
        jButtonBookHandball.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBookHandballActionPerformed(evt);
            }
        });

        jLabel36.setText("Our holliday-resort does not provide instructors for this facility.");

        jLabel42.setText("The facilities are available between 8am - 8pm every day");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel43.setText("Handball");

        jLabel51.setText("(max 4 facilities allowed per guest/day)");

        jButtonHandBallHelp.setText("Help");
        jButtonHandBallHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonHandBallHelpActionPerformed(evt);
            }
        });

        jLabel106.setText("<html>Useful info: <br> There are a total of 2 Handball courts, each with 12 players max/court. <br> The handballs will of cause be given to you.");

        jLabel107.setText("<html>please note that if too few people have <br> booked within the given time, the facility will be cancelled.");

        javax.swing.GroupLayout jPanel1HandballLayout = new javax.swing.GroupLayout(jPanel1Handball);
        jPanel1Handball.setLayout(jPanel1HandballLayout);
        jPanel1HandballLayout.setHorizontalGroup(
            jPanel1HandballLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1HandballLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonBookHandball, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
            .addGroup(jPanel1HandballLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1HandballLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1HandballLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1HandballLayout.createSequentialGroup()
                        .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1HandballLayout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1HandballLayout.createSequentialGroup()
                        .addGroup(jPanel1HandballLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1HandballLayout.createSequentialGroup()
                                .addGroup(jPanel1HandballLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1HandballLayout.createSequentialGroup()
                                        .addComponent(jLabel45)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1HandballLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel46)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBoxHandballSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel47)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBoxHandballTimeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel55)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxHandballTimeTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jButtonHandBallHelp)
                                .addGap(31, 31, 31))
                            .addGroup(jPanel1HandballLayout.createSequentialGroup()
                                .addGroup(jPanel1HandballLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1HandballLayout.createSequentialGroup()
                                        .addGap(298, 298, 298)
                                        .addComponent(jLabel51))
                                    .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1HandballLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80))))
        );
        jPanel1HandballLayout.setVerticalGroup(
            jPanel1HandballLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1HandballLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43)
                .addGap(48, 48, 48)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1HandballLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1HandballLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1HandballLayout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1HandballLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxHandballSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxHandballTimeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxHandballTimeTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46)
                            .addComponent(jLabel47)
                            .addComponent(jLabel55)
                            .addComponent(jButtonHandBallHelp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel51)
                        .addGap(43, 43, 43)))
                .addGroup(jPanel1HandballLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1HandballLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1HandballLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel42)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1HandballLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButtonBookHandball, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );

        jTabbedPane1.addTab("Handball", jPanel1Handball);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/bikingRESIZED.jpg"))); // NOI18N

        jLabel26.setText("<html>Ride our bikes to the heights you desire. the country provides <br> plenty of roads and mountainbike paths. Its free to use and no <br> booking required, just show up choose your own path. ");

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel63.setText("MOUNTAIN BIKING");

        jLabel53.setText("The facilities are available between 8am - 8pm every day");

        jLabel66.setText("This facility does not require Time-booking, it is free to use for any guest at our resort.");

        jLabel37.setText("Our holliday-resort does not provide instructors for this facility.");

        jLabel109.setText("<html>Useful info: <br>There are no player limits on this facility. <br> The equipment will be given to you.");

        javax.swing.GroupLayout jPanel4MountainBikeLayout = new javax.swing.GroupLayout(jPanel4MountainBike);
        jPanel4MountainBike.setLayout(jPanel4MountainBikeLayout);
        jPanel4MountainBikeLayout.setHorizontalGroup(
            jPanel4MountainBikeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4MountainBikeLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel4MountainBikeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel66)
                    .addComponent(jLabel37)
                    .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4MountainBikeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(72, 72, 72))
            .addGroup(jPanel4MountainBikeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4MountainBikeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addComponent(jLabel63))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4MountainBikeLayout.setVerticalGroup(
            jPanel4MountainBikeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4MountainBikeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63)
                .addGap(40, 40, 40)
                .addGroup(jPanel4MountainBikeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel4MountainBikeLayout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel66)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(jLabel53)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Mountain Biking", jPanel4MountainBike);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/bordtennisRESIZED.jpg"))); // NOI18N

        jLabel21.setText("<html>We have placed a tabletennis in the hall, where you can go and play without booking first. <br> A classic fun little activity for people at all ages.");

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel60.setText("TABLE TENNIS");

        jLabel54.setText("The facilities are available between 8am - 8pm every day");

        jLabel65.setText("This facility does not require Time-booking, it is free to use for any guest at our resort.");

        jLabel38.setText("Our holliday-resort does not provide instructors for this facility.");

        jLabel110.setText("<html> Useful info: <br> The equipment will be given to you.");

        javax.swing.GroupLayout jPanel6TableTennisLayout = new javax.swing.GroupLayout(jPanel6TableTennis);
        jPanel6TableTennis.setLayout(jPanel6TableTennisLayout);
        jPanel6TableTennisLayout.setHorizontalGroup(
            jPanel6TableTennisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6TableTennisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(jPanel6TableTennisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6TableTennisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54)
                    .addComponent(jLabel60))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6TableTennisLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel6TableTennisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel65)
                    .addComponent(jLabel38)
                    .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(115, 115, 115))
        );
        jPanel6TableTennisLayout.setVerticalGroup(
            jPanel6TableTennisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6TableTennisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel60)
                .addGroup(jPanel6TableTennisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6TableTennisLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel12)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6TableTennisLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel38)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel65)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(285, 285, 285)
                        .addComponent(jLabel54)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Table Tennis", jPanel6TableTennis);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/volleyballRESIZED.jpg"))); // NOI18N

        jLabel23.setText("<html>Playing volleyball is a great way to meet the other guests at the resort.<br> Sign-up at your preferred time and you will join a team consisting of other<br> guests and compete and have fun.");

        jButtonBookVolley.setText("BOOK");
        jButtonBookVolley.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBookVolleyActionPerformed(evt);
            }
        });

        jLabel35.setText("The facilities are available between 8am - 8pm every day");

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel62.setText("VOLLEYBALL");

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

        jComboBoxVolleyballTimeFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8 am", "9 am", "10 am", "11 am", "12 am", "1 pm", "2 pm", "3 pm", "4 pm", "5 pm", "6 pm", "7 pm" }));

        jLabel77.setText("To");

        jComboBoxVolleyballTimeTo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9 am", "10 am", "11 am", "12 am", "1 pm", "2 pm", "3 pm", "4 pm", "5 pm", "6 pm", "7 pm", "8 pm" }));

        jLabel39.setText("Our holliday-resort does not provide instructors for this facility.");

        jLabel52.setText("(max 4 facilities allowed per guest/day)");

        jButtonVolleybalHelp.setText("Help");
        jButtonVolleybalHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonVolleybalHelpActionPerformed(evt);
            }
        });

        jLabel111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel111.setText("<html> Useful info: <br>  There are a total of 2 volleyball courts, each with 12 players max/court. <br> The equipment will be given to you.");

        javax.swing.GroupLayout jPanel8VolleyballLayout = new javax.swing.GroupLayout(jPanel8Volleyball);
        jPanel8Volleyball.setLayout(jPanel8VolleyballLayout);
        jPanel8VolleyballLayout.setHorizontalGroup(
            jPanel8VolleyballLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8VolleyballLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8VolleyballLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel62))
                .addGap(0, 772, Short.MAX_VALUE))
            .addGroup(jPanel8VolleyballLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel8VolleyballLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8VolleyballLayout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8VolleyballLayout.createSequentialGroup()
                        .addGroup(jPanel8VolleyballLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel74)
                            .addGroup(jPanel8VolleyballLayout.createSequentialGroup()
                                .addComponent(jLabel75)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxVolleyballSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel76)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8VolleyballLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel52)
                                    .addGroup(jPanel8VolleyballLayout.createSequentialGroup()
                                        .addComponent(jComboBoxVolleyballTimeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxVolleyballTimeTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonVolleybalHelp))))
                            .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(jPanel8VolleyballLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(63, 63, 63))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8VolleyballLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonBookVolley, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        jPanel8VolleyballLayout.setVerticalGroup(
            jPanel8VolleyballLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8VolleyballLayout.createSequentialGroup()
                .addGroup(jPanel8VolleyballLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8VolleyballLayout.createSequentialGroup()
                        .addContainerGap(126, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel8VolleyballLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel62)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel39)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel74)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8VolleyballLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel75)
                            .addComponent(jLabel76)
                            .addComponent(jLabel77)
                            .addComponent(jComboBoxVolleyballTimeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxVolleyballTimeTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxVolleyballSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonVolleybalHelp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel52)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)))
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButtonBookVolley, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel35)
                .addGap(10, 10, 10))
        );

        jTabbedPane1.addTab("Volleyball", jPanel8Volleyball);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/TennisRESIZED.jpg"))); // NOI18N

        jLabel20.setText("<html> At Casablanca we have 6 state-of- the-art tennis courts. <br> You have the choice to book one of our highly experienced instructors, <br> who can make your game even better, or play with whoever you want.<html>");

        jButtonBookTennis.setText("BOOK");
        jButtonBookTennis.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonBookTennisActionPerformed(evt);
            }
        });

        jLabel48.setText("The cost for the instructor has been added to your bill ");

        jLabel49.setText("The facilities are available between 8am - 8pm every day");

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel61.setText("TENNIS");

        jLabel6.setText("Do you wish to hire an instructor?");

        jCheckBoxTennisInstruct.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jCheckBoxTennisInstructActionPerformed(evt);
            }
        });

        jLabelTennisInstructHourLabel.setText("                         ");

        jComboBoxTennisInstrucHours.setVisible(false);
        jComboBoxTennisInstrucHours.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        jComboBoxTennisInstrucHours.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxTennisInstrucHoursActionPerformed(evt);
            }
        });

        jLabelTennisPriceLabel.setText("       ");

        jLabelTennisInstructorPrice.setText("          ");

        jLabel78.setText("Select the date and hour/hours you wish to play");

        jLabel79.setText("Date:");

        jComboBoxTennisSelectDate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxTennisSelectDateActionPerformed(evt);
            }
        });

        jLabel86.setText("From:");

        jComboBoxTennisTimeFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8 am", "9 am", "10 am", "11 am", "12 am", "1 pm", "2 pm", "3 pm", "4 pm", "5 pm", "6 pm", "7 pm" }));

        jLabel87.setText("To");

        jComboBoxTennisTimeTo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9 am", "10 am", "11 am", "12 am", "1 pm", "2 pm", "3 pm", "4 pm", "5 pm", "6 pm", "7 pm", "8 pm" }));

        jLabel68.setText("(max 4 facilities allowed per guest/day)");

        jButtonTennisHelp.setText("Help");
        jButtonTennisHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonTennisHelpActionPerformed(evt);
            }
        });

        jLabel112.setText("<html>Useful info: <br> There are a total of 6 tennis courts, each with 4 players max/court. <br> The equipment will be given to you.");

        javax.swing.GroupLayout jPanel7TennisLayout = new javax.swing.GroupLayout(jPanel7Tennis);
        jPanel7Tennis.setLayout(jPanel7TennisLayout);
        jPanel7TennisLayout.setHorizontalGroup(
            jPanel7TennisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7TennisLayout.createSequentialGroup()
                .addGroup(jPanel7TennisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7TennisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7TennisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7TennisLayout.createSequentialGroup()
                                .addComponent(jButtonBookTennis, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76))
                            .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel7TennisLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7TennisLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel7TennisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7TennisLayout.createSequentialGroup()
                                .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel7TennisLayout.createSequentialGroup()
                                .addGroup(jPanel7TennisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7TennisLayout.createSequentialGroup()
                                        .addGroup(jPanel7TennisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel78, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7TennisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7TennisLayout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jCheckBoxTennisInstruct)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jComboBoxTennisInstrucHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7TennisLayout.createSequentialGroup()
                                                    .addGap(210, 210, 210)
                                                    .addGroup(jPanel7TennisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabelTennisPriceLabel)
                                                        .addComponent(jLabelTennisInstructHourLabel))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabelTennisInstructorPrice))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel7TennisLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel79)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxTennisSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel86)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel7TennisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel68)
                                            .addGroup(jPanel7TennisLayout.createSequentialGroup()
                                                .addComponent(jComboBoxTennisTimeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBoxTennisTimeTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(jButtonTennisHelp)))
                                        .addGap(49, 49, 49)))
                                .addComponent(jLabel13)))))
                .addGap(139, 139, 139))
            .addGroup(jPanel7TennisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel61)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7TennisLayout.setVerticalGroup(
            jPanel7TennisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7TennisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel61)
                .addGroup(jPanel7TennisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7TennisLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBookTennis, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel7TennisLayout.createSequentialGroup()
                        .addGroup(jPanel7TennisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7TennisLayout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabelTennisInstructHourLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7TennisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelTennisPriceLabel)
                                    .addComponent(jLabelTennisInstructorPrice)))
                            .addGroup(jPanel7TennisLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel7TennisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBoxTennisInstrucHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7TennisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jCheckBoxTennisInstruct)))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel78)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7TennisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel79)
                            .addComponent(jLabel86)
                            .addComponent(jLabel87)
                            .addComponent(jComboBoxTennisTimeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTennisTimeTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTennisSelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonTennisHelp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel68)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel7TennisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jLabel48))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Tennis", jPanel7Tennis);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/SwimmingRESIZED.jpg"))); // NOI18N

        jLabel22.setText("<html>Due to Marocco's hot climate, we highly recommend that you <br> try our beautiful swimming pool. It is great fun and great <br> excercise which you can do on your own or with other guests. ");

        jButtonBookSwimming.setText("BOOK");

        jLabel40.setText("The cost for the instructor has been added to your bill ");

        jLabel41.setText("The facilities are available between 8am - 8pm every day");

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel59.setText("SWIMMING");

        jLabel85.setText("Do you wish to hire an instructor?");

        jCheckBoxSwimmingInstruct.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jCheckBoxSwimmingInstructActionPerformed(evt);
            }
        });

        jLabelSwimmingInstructHourLabel.setText("                         ");

        jComboBoxSwimmingInstrucHours.setVisible(false);
        jComboBoxSwimmingInstrucHours.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        jComboBoxSwimmingInstrucHours.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxSwimmingInstrucHoursActionPerformed(evt);
            }
        });

        jLabelSwimmingPriceLabel.setText("       ");

        jLabelSwimmingInstructorPrice.setText("         ");

        jLabel64.setText("This facility does not require Time-booking, it is free to use for any guest at our resort.");

        jLabel114.setText("<html>Useful info: <br>There are no player limits for this facility.");

        jComboBoxSwimmingInstructorDate.setVisible(false);

        jComboBoxSwimmingInstructorTimeFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8 am", "9 am", "10 am", "11 am", "12 am", "1 pm", "2 pm", "3 pm", "4 pm", "5 pm", "6 pm", "7 pm" }));
        jComboBoxSwimmingInstructorTimeFrom.setVisible(false);

        jComboBoxSwimmingInstructorTimeTo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9 am", "10 am", "11 am", "12 am", "1 pm", "2 pm", "3 pm", "4 pm", "5 pm", "6 pm", "7 pm", "8 pm" }));
        jComboBoxSwimmingInstructorTimeTo.setVisible(false);

        jLabelSwimmingInstructorTimeFrom.setText("From:");
        jLabelSwimmingInstructorTimeFrom.setVisible(false);

        jLabelSwimmingInstructorTimeTo.setText("To:");
        jLabelSwimmingInstructorTimeTo.setVisible(false);

        jLabelSwimmingInstructorDate.setText("Date:");
        jLabelSwimmingInstructorDate.setVisible(false);

        jLabelSwimmingInstructorDateTimeInfo.setText("On which date and time:");
        jLabelSwimmingInstructorDateTimeInfo.setVisible(false);

        javax.swing.GroupLayout jPanel5SwimmingLayout = new javax.swing.GroupLayout(jPanel5Swimming);
        jPanel5Swimming.setLayout(jPanel5SwimmingLayout);
        jPanel5SwimmingLayout.setHorizontalGroup(
            jPanel5SwimmingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5SwimmingLayout.createSequentialGroup()
                .addGroup(jPanel5SwimmingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5SwimmingLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel40))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5SwimmingLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel5SwimmingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5SwimmingLayout.createSequentialGroup()
                                .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5SwimmingLayout.createSequentialGroup()
                                .addGroup(jPanel5SwimmingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5SwimmingLayout.createSequentialGroup()
                                        .addComponent(jLabel85)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBoxSwimmingInstruct)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabelSwimmingInstructHourLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBoxSwimmingInstrucHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5SwimmingLayout.createSequentialGroup()
                                        .addGroup(jPanel5SwimmingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5SwimmingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel5SwimmingLayout.createSequentialGroup()
                                                    .addComponent(jLabelSwimmingInstructorDate)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jComboBoxSwimmingInstructorDate, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(35, 35, 35)
                                                    .addComponent(jLabelSwimmingInstructorTimeFrom)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanel5SwimmingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel5SwimmingLayout.createSequentialGroup()
                                                            .addComponent(jLabelSwimmingPriceLabel)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(jLabelSwimmingInstructorPrice)
                                                            .addGap(17, 17, 17))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5SwimmingLayout.createSequentialGroup()
                                                            .addComponent(jComboBoxSwimmingInstructorTimeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(jLabelSwimmingInstructorTimeTo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(jComboBoxSwimmingInstructorTimeTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addComponent(jLabel64))
                                            .addComponent(jLabelSwimmingInstructorDateTimeInfo, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jLabel11)))))
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5SwimmingLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonBookSwimming, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
            .addGroup(jPanel5SwimmingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5SwimmingLayout.setVerticalGroup(
            jPanel5SwimmingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5SwimmingLayout.createSequentialGroup()
                .addGroup(jPanel5SwimmingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5SwimmingLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel11))
                    .addGroup(jPanel5SwimmingLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel59)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel5SwimmingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel85)
                            .addComponent(jCheckBoxSwimmingInstruct)
                            .addComponent(jComboBoxSwimmingInstrucHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSwimmingInstructHourLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5SwimmingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSwimmingPriceLabel)
                            .addComponent(jLabelSwimmingInstructorPrice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelSwimmingInstructorDateTimeInfo)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel5SwimmingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxSwimmingInstructorDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxSwimmingInstructorTimeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSwimmingInstructorTimeFrom)
                            .addComponent(jLabelSwimmingInstructorTimeTo)
                            .addComponent(jComboBoxSwimmingInstructorTimeTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSwimmingInstructorDate))
                        .addGap(53, 53, 53)
                        .addComponent(jLabel64)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5SwimmingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jButtonBookSwimming, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5SwimmingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel40))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Swimming", jPanel5Swimming);

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
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1028, 586));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxSwimmingInstrucHoursActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxSwimmingInstrucHoursActionPerformed
    {//GEN-HEADEREND:event_jComboBoxSwimmingInstrucHoursActionPerformed
        jLabelSwimmingInstructorPrice.setText("$" + (jComboBoxSwimmingInstrucHours.getSelectedIndex() + 1) * 40);
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
        jLabelTennisInstructorPrice.setText("$" + (jComboBoxTennisInstrucHours.getSelectedIndex() + 1) * 30);
    }//GEN-LAST:event_jComboBoxTennisInstrucHoursActionPerformed

    private void jCheckBoxTennisInstructActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBoxTennisInstructActionPerformed
    {//GEN-HEADEREND:event_jCheckBoxTennisInstructActionPerformed
        if(jCheckBoxTennisInstruct.isSelected())
        {
            jLabelTennisInstructHourLabel.setText("...for how many hours?");
            jComboBoxTennisInstrucHours.setVisible(true);
            jComboBoxTennisInstrucHours.setSelectedIndex(0);
            jLabelTennisPriceLabel.setText("Price:");
        } else
        {
            jLabelTennisInstructHourLabel.setText("");
            jComboBoxTennisInstrucHours.setVisible(false);
            jLabelTennisPriceLabel.setText("");
            jLabelTennisInstructorPrice.setText("");
        }
    }//GEN-LAST:event_jCheckBoxTennisInstructActionPerformed

    private void jComboBoxVolleyballSelectDateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxVolleyballSelectDateActionPerformed
    {//GEN-HEADEREND:event_jComboBoxVolleyballSelectDateActionPerformed
       
    }//GEN-LAST:event_jComboBoxVolleyballSelectDateActionPerformed

    private void jButtonBookHandballActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBookHandballActionPerformed
    {//GEN-HEADEREND:event_jButtonBookHandballActionPerformed
        String handballDate = (String)jComboBoxHandballSelectDate.getSelectedItem();
        String handballTimeFrom = (String)jComboBoxHandballTimeFrom.getSelectedItem();
        String handballTimeTo = (String)jComboBoxHandballTimeTo.getSelectedItem();
        insert.JDBCInsertFacility("12345", "02", handballDate, handballTimeFrom, handballTimeTo, "09098");
    }//GEN-LAST:event_jButtonBookHandballActionPerformed

    private void jCheckBoxGolfInstructActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBoxGolfInstructActionPerformed
    {//GEN-HEADEREND:event_jCheckBoxGolfInstructActionPerformed
        if(jCheckBoxGolfInstruct.isSelected())
        {
            jLabelGolfInstructHourLabel.setText("...for how many hours?");
            jComboBoxGolfInstrucHours.setVisible(true);
            jComboBoxGolfInstrucHours.setSelectedIndex(0);
            jLabelGolfPriceLabel.setText("Price:");
            jLabelGolfInstructorDateTimeInfo.setVisible(true);
            jLabelGolfInstructorDate.setVisible(true);
            jLabelGolfInstructorTimeFrom.setVisible(true);
            jLabelGolfInstructorTimeTo.setVisible(true);
            jComboBoxGolfInstructorDate.setVisible(true);
            jComboBoxGolfInstructorTimeFrom.setVisible(true);
            jComboBoxGolfInstructorTimeTo.setVisible(true);
        } else
        {
            jLabelGolfInstructHourLabel.setText("");
            jComboBoxGolfInstrucHours.setVisible(false);
            jLabelGolfPriceLabel.setText("");
            jLabelGolfInstructorPrice.setText("");
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
        jLabelGolfInstructorPrice.setText("$" + (jComboBoxGolfInstrucHours.getSelectedIndex() + 1) * 40);
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
        jLabelBadmintonInstructorPrice.setText("$" + (jComboBoxBadmintonInstrucHours.getSelectedIndex() + 1) * 30);
    }//GEN-LAST:event_jComboBoxBadmintonInstrucHoursActionPerformed

    private void jCheckBoxBadmintonInstructActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBoxBadmintonInstructActionPerformed
    {//GEN-HEADEREND:event_jCheckBoxBadmintonInstructActionPerformed
        if(jCheckBoxBadmintonInstruct.isSelected())
        {
            jLabelBadmintonInstructHourLabel.setText("...for how many hours?");
            jComboBoxBadmintonInstrucHours.setVisible(true);
            jComboBoxBadmintonInstrucHours.setSelectedIndex(0);
            jLabelBadmintonPriceLabel.setText("Price:");
        } else
        {
            jLabelBadmintonInstructHourLabel.setText("");
            jComboBoxBadmintonInstrucHours.setVisible(false);
            jLabelBadmintonPriceLabel.setText("");
            jLabelBadmintonInstructorPrice.setText("");
        }
    }//GEN-LAST:event_jCheckBoxBadmintonInstructActionPerformed

    private void jComboBoxBadmintonTimeToActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxBadmintonTimeToActionPerformed
    {//GEN-HEADEREND:event_jComboBoxBadmintonTimeToActionPerformed
        //        jComboBoxBadmintonTimeFrom.setSelectedItem(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12);
        //        jComboBoxBadmintonTimeTo.setSelectedItem(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12);
        //

        //        if (jComboBoxBadmintonTimeTo.getSelectedIndex() <= jComboBoxBadmintonTimeFrom.getSelectedIndex())
        //
        //{
            //            jLabel92.setText("must be between 1 and 4 hours");
            //            jLabel92.setVisible(true);
            //        } else
        //
        //{
            //            jLabel92.setText("");
            //            jLabel92.setVisible(false);
            //        }
        //
    }//GEN-LAST:event_jComboBoxBadmintonTimeToActionPerformed

    private void jComboBoxBadmintonTimeFromActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxBadmintonTimeFromActionPerformed
    {//GEN-HEADEREND:event_jComboBoxBadmintonTimeFromActionPerformed

    }//GEN-LAST:event_jComboBoxBadmintonTimeFromActionPerformed

    private void jComboBoxBadmintonSelectDateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxBadmintonSelectDateActionPerformed
    {//GEN-HEADEREND:event_jComboBoxBadmintonSelectDateActionPerformed

    }//GEN-LAST:event_jComboBoxBadmintonSelectDateActionPerformed

    private void jButtonBookBadmintonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBookBadmintonActionPerformed
    {//GEN-HEADEREND:event_jButtonBookBadmintonActionPerformed
        String badmintonDate = (String)jComboBoxBadmintonSelectDate.getSelectedItem();
        String badmintonTimeFrom = (String)jComboBoxBadmintonTimeFrom.getSelectedItem();
        String badmintonTimeTo = (String)jComboBoxBadmintonTimeTo.getSelectedItem();
        insert.JDBCInsertFacility("12345", "02", badmintonDate, badmintonTimeFrom, badmintonTimeTo, "09098");
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
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxOverviewEditBookingDate1ActionPerformed

    private void jButtonBookFitnessActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBookFitnessActionPerformed
    {//GEN-HEADEREND:event_jButtonBookFitnessActionPerformed
        String fitnessDate = (String)jComboBoxFitnessSelectDate.getSelectedItem();
        String fitnessTimeFrom = (String)jComboBoxFitnessTimeFrom.getSelectedItem();
        String fitnessTimeTo = (String)jComboBoxFitnessTimeTo.getSelectedItem();
        insert.JDBCInsertFacility("12345", "02", fitnessDate, fitnessTimeFrom, fitnessTimeTo, "09098");
    }//GEN-LAST:event_jButtonBookFitnessActionPerformed

    private void jButtonBookVolleyActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBookVolleyActionPerformed
    {//GEN-HEADEREND:event_jButtonBookVolleyActionPerformed
        String volleyballDate = (String)jComboBoxVolleyballSelectDate.getSelectedItem();
        String volleyTimeFrom = (String)jComboBoxVolleyballTimeFrom.getSelectedItem();
        String volleyTimeTo = (String)jComboBoxVolleyballTimeTo.getSelectedItem();
        insert.JDBCInsertFacility("12345", "02", volleyballDate, volleyTimeFrom, volleyTimeTo, "09098");
    }//GEN-LAST:event_jButtonBookVolleyActionPerformed

    private void jButtonBookTennisActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonBookTennisActionPerformed
    {//GEN-HEADEREND:event_jButtonBookTennisActionPerformed
        String tennisballDate = (String)jComboBoxTennisSelectDate.getSelectedItem();
        String tennisTimeFrom = (String)jComboBoxTennisTimeFrom.getSelectedItem();
        String tennisTimeTo = (String)jComboBoxTennisTimeTo.getSelectedItem();
        insert.JDBCInsertFacility("12345", "02", tennisballDate, tennisTimeFrom, tennisTimeTo, "09098");
    }//GEN-LAST:event_jButtonBookTennisActionPerformed

    private void jComboBoxGolfInstructorDateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxGolfInstructorDateActionPerformed
    {//GEN-HEADEREND:event_jComboBoxGolfInstructorDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxGolfInstructorDateActionPerformed

    private void jButtonPrintInstrucCostActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonPrintInstrucCostActionPerformed
    {//GEN-HEADEREND:event_jButtonPrintInstrucCostActionPerformed
        //select.printBill(guestid);
    }//GEN-LAST:event_jButtonPrintInstrucCostActionPerformed

    private void jButtonLoadBookingsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonLoadBookingsActionPerformed
    {//GEN-HEADEREND:event_jButtonLoadBookingsActionPerformed
        loadListOverview();
    }//GEN-LAST:event_jButtonLoadBookingsActionPerformed

    private void jButtonOverviewDeleteYes1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonOverviewDeleteYes1ActionPerformed
    {//GEN-HEADEREND:event_jButtonOverviewDeleteYes1ActionPerformed
        int a = jListBookedOverview.getSelectedIndex();
        delete.JDBCDeleteFacBooking("12345", tempBookOverview.get(a).getFacID(), 
        tempBookOverview.get(a).getTimeStart());
        jDialogOverviewDelete.setVisible(false);
        loadListOverview();
    }//GEN-LAST:event_jButtonOverviewDeleteYes1ActionPerformed

    private void jButtonOverviewDeleteNo1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonOverviewDeleteNo1ActionPerformed
    {//GEN-HEADEREND:event_jButtonOverviewDeleteNo1ActionPerformed
        jDialogOverviewDelete.setVisible(false);
    }//GEN-LAST:event_jButtonOverviewDeleteNo1ActionPerformed

    private void jButtonOverviewEditBookingSaveChanges1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonOverviewEditBookingSaveChanges1ActionPerformed
    {//GEN-HEADEREND:event_jButtonOverviewEditBookingSaveChanges1ActionPerformed
//        int a = jListBookedOverview.getSelectedIndex();
//        update.updateFacBook("12345", jComboBoxOverviewEditBookingDate1.getSelectedIndex(), 
//        (jComboBoxOverviewEditBookingTimeFrom1.getSelectedIndex()+8)+"", (jComboBoxOverviewEditBookingTimeFrom1.getSelectedIndex()+9)+"",
//        tempBookOverview.get(a).getTimeStart(), tempBookOverview.get(a).getTimeEnd());
    }//GEN-LAST:event_jButtonOverviewEditBookingSaveChanges1ActionPerformed

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

        /* Create and display the form */
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
    private javax.swing.JButton jButtonHandBallHelp;
    private javax.swing.JButton jButtonLoadBookings;
    private javax.swing.JButton jButtonOverviewDeleteBooking1;
    private javax.swing.JButton jButtonOverviewDeleteNo1;
    private javax.swing.JButton jButtonOverviewDeleteYes1;
    private javax.swing.JButton jButtonOverviewEditBooking1;
    private javax.swing.JButton jButtonOverviewEditBookingSaveChanges1;
    private javax.swing.JButton jButtonOverviewHelp;
    private javax.swing.JButton jButtonPrintInstrucCost;
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
    private javax.swing.JDialog jDialogOverviewDelete;
    private javax.swing.JDialog jDialogOverviewEditBooking;
    private javax.swing.JDialog jDialogOverviewHelp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel102;
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
    private javax.swing.JLabel jLabel116;
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
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
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
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
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
    private javax.swing.JLabel jLabelAlreadyBooked;
    private javax.swing.JLabel jLabelBadmintonInstructHourLabel;
    private javax.swing.JLabel jLabelBadmintonInstructorPrice;
    private javax.swing.JLabel jLabelBadmintonPriceLabel;
    private javax.swing.JLabel jLabelGolfInstructHourLabel;
    private javax.swing.JLabel jLabelGolfInstructorDate;
    private javax.swing.JLabel jLabelGolfInstructorDateTimeInfo;
    private javax.swing.JLabel jLabelGolfInstructorPrice;
    private javax.swing.JLabel jLabelGolfInstructorTimeFrom;
    private javax.swing.JLabel jLabelGolfInstructorTimeTo;
    private javax.swing.JLabel jLabelGolfPriceLabel;
    private javax.swing.JLabel jLabelOverviewGuestID;
    private javax.swing.JLabel jLabelSwimmingInstructHourLabel;
    private javax.swing.JLabel jLabelSwimmingInstructorDate;
    private javax.swing.JLabel jLabelSwimmingInstructorDateTimeInfo;
    private javax.swing.JLabel jLabelSwimmingInstructorPrice;
    private javax.swing.JLabel jLabelSwimmingInstructorTimeFrom;
    private javax.swing.JLabel jLabelSwimmingInstructorTimeTo;
    private javax.swing.JLabel jLabelSwimmingPriceLabel;
    private javax.swing.JLabel jLabelTennisInstructHourLabel;
    private javax.swing.JLabel jLabelTennisInstructorPrice;
    private javax.swing.JLabel jLabelTennisPriceLabel;
    private javax.swing.JList jListBookedOverview;
    private javax.swing.JPanel jPanel1Badminton;
    private javax.swing.JPanel jPanel1Handball;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel2Fitness;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel3Golf;
    private javax.swing.JPanel jPanel4MountainBike;
    private javax.swing.JPanel jPanel5Overview;
    private javax.swing.JPanel jPanel5Swimming;
    private javax.swing.JPanel jPanel6TableTennis;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel7Tennis;
    private javax.swing.JPanel jPanel8Volleyball;
    private javax.swing.JPanel jPanelFacilityHelp;
    private javax.swing.JPanel jPanelOverviewEditBooking;
    private javax.swing.JPanel jPanelOverviewHelp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
