package DependencyInjection.InjectingCollection.Models;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Product {
    private List<Object> lists;
    private Set<Object> sets;
    private Map<Object, Object> maps;
    private Properties props;

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Set<Object> getSets() {
        return sets;
    }

    public void setSets(Set<Object> sets) {
        this.sets = sets;
    }

    public Map<Object, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<Object, Object> maps) {
        this.maps = maps;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "lists=" + lists + "\n" + "sets=" + sets + "\n" + "maps=" + maps + "\n" + "props=" + props;
    }
}
