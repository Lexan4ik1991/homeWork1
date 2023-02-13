package homeWork6;



import java.util.*;

public class laptop {
    private Integer id;
    private String manufacturer;
    private String model;

    private String color;
    private Integer diagonal;
    private Integer RAM;

    private Integer SSD;
    private String typeVC;


    public laptop(Integer id, String manufacturer, String model, String color, Integer RAM, Integer SSD) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.RAM = RAM;
        this.SSD = SSD;

    }

    @Override
    public String toString() {
        return "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", RAM=" + RAM +
                ", SSD=" + SSD;
    }

    public Map<String, String> getAllInfo() {
        Map<String, String> laptopInfo = new LinkedHashMap<>();
        laptopInfo.put("manufacturer", this.manufacturer);
        laptopInfo.put("model", this.model);
        laptopInfo.put("color", this.color);
        laptopInfo.put("RAM", this.RAM.toString());
        laptopInfo.put("SSD", this.SSD.toString());
        return null;
    }

    public void printInfo() {
        System.out.printf("id: %s,manufacturer: %s, model: %s, color: %s,RAM: %s,SSD: %s%n,id, manufacturer, model, color,RAM,SSD");
    }



        public void setId (Integer id){
            this.id = id;
        }
        public void setModel (String model){
            this.model = model;
        }
        public void setTypeVC (String typeVC){
            this.typeVC = typeVC;
        }

        public void setManufacturer (String manufacturer){
            this.manufacturer = manufacturer;
        }


        public void setColor (String color){
            this.color = color;
        }

        public void setRAM (Integer RAM){
            this.RAM = RAM;
        }
        public void setSSD (Integer SSD){
            this.SSD = SSD;
        }

        public void setDiagonal (Integer diagonal){
            this.diagonal = diagonal;
        }

        public Integer getId () {
            return id;
        }

        public String getModel () {
            return model;
        }

        public String getTypeVC () {
            return typeVC;
        }

        public Integer getRAM () {
            return RAM;
        }
        public Integer getSSD () {
            return SSD;
        }

        public String getColor () {
            return color;
        }

        public String getManufacturer () {
            return manufacturer;
        }

        public Integer getDiagonal () {
            return diagonal;
        }
    }





