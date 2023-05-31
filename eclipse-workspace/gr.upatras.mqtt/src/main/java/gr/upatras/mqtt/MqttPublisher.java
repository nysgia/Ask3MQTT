package gr.upatras.mqtt;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage; 
public class MqttPublisher {
	public static String topic = "football";
    public static void publishText(String text) {
    	String broker = "tcp://test.mosquitto.org:1883";
        String clientId = MqttClient.generateClientId();
         

        MqttClient mqttClient = null;
        try {
            mqttClient = new MqttClient(broker, clientId);
            mqttClient.connect();

            
            MqttMessage message = new MqttMessage(text.getBytes());
            mqttClient.publish(topic, message);

//            mqttClient.disconnect();
        } catch (MqttException e) {
            e.printStackTrace();
        }
        finally {
            // Disconnect the MQTT client
            if (mqttClient != null) {
                try {
                    mqttClient.disconnect();
                } catch (MqttException e) {
                    e.printStackTrace();
                }
            }
        }
        
    }
}

