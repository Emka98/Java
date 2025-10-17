class Computer {
    
    private String producer;
    private int model; 

    public Computer(String producer, int model){
        this.producer = producer;
        this.model = model;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Computer other = (Computer) obj;
        if (producer != other.producer)
            return false;
        if (producer == null) {
            if (other.producer != null)
                return false;
        } else if (!producer.equals(other.producer))
            return false;
        if (model != other.model){
            return false;
        } 
        else if (model != other.model){
            return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return "Producer: " + producer + " Model: " + model; 
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}
