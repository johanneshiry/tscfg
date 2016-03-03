// generated by tscfg 0.3.0 on Wed Mar 02 09:39:21 PST 2016
// source: example/example0.spec.conf

package tscfg.example

object ScalaExample0Cfg {
  object Service {
    def apply(c: com.typesafe.config.Config): Service = {
      Service(
        if(c.hasPathOrNull("debug")) c.getBoolean("debug") else true,
        if(c.hasPathOrNull("factor")) c.getDouble("factor") else 0.75,
        if(c.hasPathOrNull("poolSize")) c.getInt("poolSize") else 32,
        if(c.hasPathOrNull("url")) c.getString("url") else "http://example.net/rest"
      )
    }
  }
  case class Service(
    debug : Boolean,
    factor : Double,
    poolSize : Int,
    url : String
  ) {
    override def toString: String = toString("")
    def toString(i:String): String = {
      i+ "debug = " + this.debug + "\n"+
      i+ "factor = " + this.factor + "\n"+
      i+ "poolSize = " + this.poolSize + "\n"+
      i+ "url = " + '"' + this.url + '"' + "\n"
    }
  }
  def apply(c: com.typesafe.config.Config): ScalaExample0Cfg = {
    ScalaExample0Cfg(
      Service(c.getConfig("service"))
    )
  }
}
case class ScalaExample0Cfg(
  service : ScalaExample0Cfg.Service
) {
  override def toString: String = toString("")
  def toString(i:String): String = {
    i+ "Service(\n" + this.service.toString(i+"    ") +i+ ")\n"
  }
}