package org.utl.dsm.softcja;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
/**
 * @author nikob
 */
public class SoftCJA{
    public static void main(String[] args){
        MongoClient client = MongoClients.create("mongodb+srv://root:,Enero2003@softcja.cdb6qyj.mongodb.net/?retryWrites=true&w=majority");
        MongoDatabase db = client.getDatabase("softCJA");
        MongoCollection col = db.getCollection("PersonasCitadas");
        Document sampleDoc = new Document("_id", "1").append("nombre", "John Smit");
        Document sampleDoc2 = new Document("_id", "1").append("nombre", "John Wick");
        col.find(sampleDoc);
        col.insertOne(sampleDoc);
        col.deleteOne(sampleDoc);
        col.updateOne(sampleDoc,sampleDoc2);
    }
}