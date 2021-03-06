import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class GroupingClusters2 {
    public static void main(String[] args) {
        //tag::groupingclusters[]
        Config configProd = new Config();
        configProd.setClusterName( "production" );

        Config configDev = new Config();
        configDev.setClusterName( "development" );

        HazelcastInstance h1 = Hazelcast.newHazelcastInstance( configProd );
        HazelcastInstance h2 = Hazelcast.newHazelcastInstance( configDev );
        HazelcastInstance h3 = Hazelcast.newHazelcastInstance( configDev );
        //end::groupingclusters[]
    }
}