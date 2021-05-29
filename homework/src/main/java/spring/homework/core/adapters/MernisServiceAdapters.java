package spring.homework.core.adapters;

import java.rmi.RemoteException;
import java.time.LocalDate;

import org.springframework.stereotype.Service;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
@Service("realMernis")
public class MernisServiceAdapters  implements UserCheckServis{

	@Override
	public boolean checkIfRealPerson(String nationaltyId, String firstName, String lastName,
			LocalDate dateOfBirthYear) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(nationaltyId)
					, firstName.toUpperCase(), lastName.toUpperCase()
					, dateOfBirthYear.getYear());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
