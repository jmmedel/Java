import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class GUIKadai08 extends JFrame {

	private JPanel contentPane;

	private String[] courseyear={"ソフトＩコース","ソフトIIコース","ソフトIIIコース","ソフトＩVコース"};
	private String [][] coursename ={{"基本情報対策","Ｊ験対策","C言語ＩＩＩ","日商筆記対策","C言語３級"},
			{"基本情報対策","Ｊ験対策","Ｌｉｎｕｘ","オラクル対策","ＶｉｓｕａｌＢａｓｉｃ"},
			{"Ｗｅｂアプリケーション","システム設計特輪","応用情報対策","オラクル対策","ＶｉｓｕａｌＢａｓｉｃ"},
			{"特別漢習Ｉ","特別漢習Ｉ"},
			
		};
	
	
	
	private String [][] CityName= {{""}};
	private JScrollPane AreaScrollPane;
	private JLabel AreaLabel;
	private JComboBox PrefectureComboBox;
	private JList AreaList;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIKadai08 frame = new GUIKadai08();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUIKadai08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		AreaScrollPane = new JScrollPane();
		AreaScrollPane.setBounds(181, 32, 143, 126);
		contentPane.add(AreaScrollPane);
		
		AreaList = new JList(courseyear);
		AreaList.setVisibleRowCount(4);
		AreaScrollPane.setViewportView(AreaList);
		
		AreaLabel = new JLabel("\u30B3\u30FC\u30BA");
		AreaLabel.setBounds(12, 28, 68, 24);
		contentPane.add(AreaLabel);
		
		PrefectureComboBox = new JComboBox();
		PrefectureComboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				int AreaIndex = AreaList.getSelectedIndex();
				int PrefectureIndex = PrefectureComboBox.getSelectedIndex();
				
			}
		});
		PrefectureComboBox.setBounds(168, 168, 156, 27);
		contentPane.add(PrefectureComboBox);
		
		AreaList = new JList(courseyear);
		
		
		AreaList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				int AreaIndex=AreaList.getSelectedIndex();
				
				PrefectureComboBox.removeAllItems();
				
				for(String s:coursename[AreaIndex]) {
					PrefectureComboBox.addItem(s);
				}
				PrefectureComboBox.setSelectedIndex(0);
				
			}
		});
		AreaList.setBounds(12, 208, 143, -140);
		contentPane.add(AreaList);
		AreaList.setSelectedIndex(0);
		
		JLabel lblNewLabel = new JLabel("\u9078\u629E\uFF11\uFF1A");
		lblNewLabel.setBounds(12, 175, 50, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u9078\u629E\uFF12\uFF1A");
		lblNewLabel_1.setBounds(12, 208, 50, 13);
		contentPane.add(lblNewLabel_1);
	}
}
