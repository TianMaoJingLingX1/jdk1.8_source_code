package org.omg.CORBA;


/**
* org/omg/CORBA/WStringSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-i586-cygwin/jdk8u51/3951/corba/src/share/classes/org/omg/PortableInterceptor/CORBAX.idl
* Monday, June 8, 2015 6:01:16 PM PDT
*/


/** An array of WStrings */
public final class WStringSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public WStringSeqHolder ()
  {
  }

  public WStringSeqHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CORBA.WStringSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CORBA.WStringSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CORBA.WStringSeqHelper.type ();
  }

}
