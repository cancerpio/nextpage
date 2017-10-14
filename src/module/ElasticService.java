package module;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.network.InetAddresses;
import org.elasticsearch.common.settings.Setting;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import dao.ElasticDao;

public class ElasticService {

    public String indexData(String data) throws UnknownHostException {
	// create setting first
	Settings setting = Settings.builder().put("cluster.name", "cancerpio_elastic").build();
	// get client and apply the setting
	TransportClient client = new PreBuiltTransportClient (setting)
		.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("node-1"),9200));
	return ElasticDao.indexJsonDocument(client, data);
    }
}
