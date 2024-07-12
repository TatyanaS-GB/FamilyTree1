
  public interface Writer {
      void save(java.io.Serializable serializable);
  
      java.lang.Object read();
  
      void setPath(java.lang.String s);
  }