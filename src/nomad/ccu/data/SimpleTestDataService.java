package nomad.ccu.data;

import java.util.ArrayList;
import java.util.List;

import nomad.ccu.beans.Ccu;
import nomad.ccu.beans.GpsInfo;

public class SimpleTestDataService implements DataServiceInterface {
	@Override
	public List<Ccu> getCcuList() {
		Ccu ccu1 = new Ccu("ccu-1");
		ccu1.setGps(new GpsInfo(54.844409,-1.46543));
		Ccu ccu2 = new Ccu("ccu-2");
		ccu2.setGps(new GpsInfo(54.969707,-1.60409));

		List<Ccu> ccuList = new ArrayList<Ccu>();
		ccuList.add(ccu1);
		ccuList.add(ccu2);
		
		return ccuList;
	}
}
