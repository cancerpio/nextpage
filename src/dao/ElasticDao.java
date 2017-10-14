package dao;

import org.elasticsearch.ElasticsearchException;
import org.elasticsearch.client.transport.TransportClient;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ElasticDao {
    //source : bean instanced by jakson ObjectMapper
    public static String indexBeanDocument(TransportClient client, String json) throws ElasticsearchException{
	ObjectMapper objectMapper = new ObjectMapper();
	client.prepareIndex().setSource(source)
    }
    //source : json String
    
}
