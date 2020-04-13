import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class CustomerGui {

	protected Shell shlCustomers;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CustomerGui window = new CustomerGui();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlCustomers.open();
		shlCustomers.layout();
		while (!shlCustomers.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlCustomers = new Shell();
		shlCustomers.setSize(555, 475);
		shlCustomers.setText("Customers");
		
		Label lblCustomer = new Label(shlCustomers, SWT.NONE);
		lblCustomer.setBounds(10, 122, 113, 20);
		lblCustomer.setText("Customer Name");
		
		Label lblCustomerZip = new Label(shlCustomers, SWT.NONE);
		lblCustomerZip.setBounds(10, 167, 173, 20);
		lblCustomerZip.setText("Customer Zip Code");
		
		Label lblZip = new Label(shlCustomers, SWT.NONE); // zip gets stored here
		lblZip.setBounds(203, 167, 70, 20);
		lblZip.setText("23789");
		
		Label lblInterests = new Label(shlCustomers, SWT.NONE);
		lblInterests.setBounds(10, 213, 70, 20);
		lblInterests.setText("Interests");
		
		Label lblInterestList = new Label(shlCustomers, SWT.NONE);
		lblInterestList.setBounds(203, 213, 321, 20);
		lblInterestList.setText("Golf, Fishing, Computer Programing");  //interests get imported here
		
		Label lblName = new Label(shlCustomers, SWT.NONE);
		lblName.setBounds(203, 122, 70, 20);
		lblName.setText("Bill Brewer");  // customers name imported here
		
		Label lblAccountManager = new Label(shlCustomers, SWT.NONE);
		lblAccountManager.setBounds(10, 263, 128, 20);
		lblAccountManager.setText("Account Manager");
		
		Label lblJamesSmith = new Label(shlCustomers, SWT.NONE);
		lblJamesSmith.setBounds(203, 263, 203, 20);
		lblJamesSmith.setText("James Smith");
		
		Combo combo = new Combo(shlCustomers, SWT.NONE);
		combo.setBounds(203, 45, 253, 28);
		
		Label lblChooseACustomer = new Label(shlCustomers, SWT.NONE);
		lblChooseACustomer.setBounds(10, 48, 161, 20);
		lblChooseACustomer.setText("Choose a Customer");
		
		Button btnCreateCustomer = new Button(shlCustomers, SWT.NONE);
		btnCreateCustomer.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnCreateCustomer.setBounds(10, 342, 229, 30);
		btnCreateCustomer.setText("Add A New Customer");

	}
}
