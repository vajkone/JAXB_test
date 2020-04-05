package legoset;


import lombok.Data;
import movie.YearAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.time.Year;
import java.util.List;
import java.util.Set;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"name", "theme", "subtheme", "year", "pieces","tags","minifigs","weight","url"})
@Data
public class LegoSet {

    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;


    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private Set<String> tags;

    private String name;
    private String subtheme;
    private int pieces;

    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
    private List<Minifig> minifigs;
    private String url;
    private String theme;
    private Weight weight;

    @XmlAttribute
    private String number;





}
