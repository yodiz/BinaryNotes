
package test.org.bn.coders.test_asn;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net 
// Any modifications to this file will be lost upon recompilation of the source ASN.1. 
//

import org.bn.*;
import org.bn.annotations.*;
import org.bn.annotations.constraints.*;
import org.bn.coders.*;
import org.bn.types.*;




    @ASN1PreparedElement
    @ASN1Choice ( name = "TestParent2" )
    public class TestParent2 implements IASN1PreparedElement {
            @ASN1Integer( name = "" )
    
        @ASN1Element ( name = "field10", isOptional =  false , hasTag =  true, tag = 0 , hasDefaultValue =  false  )
    
	private Long field10 = null;
                
  @ASN1OctetString( name = "" )
    
        @ASN1Element ( name = "field20", isOptional =  true , hasTag =  true, tag = 1 , hasDefaultValue =  false  )
    
	private byte[] field20 = null;
                
  
    @ASN1String( name = "", 
        stringType = UniversalTag.UTF8String , isUCS = false )
    
        @ASN1Element ( name = "field30", isOptional =  false , hasTag =  true, tag = 2 , hasDefaultValue =  false  )
    
	private String field30 = null;
                
  @ASN1Integer( name = "" )
    
        @ASN1Element ( name = "field40", isOptional =  false , hasTag =  true, tag = 3 , hasDefaultValue =  false  )
    
	private Long field40 = null;
                
  
        
        public Long getField10 () {
            return this.field10;
        }

        public boolean isField10Selected () {
            return this.field10 != null;
        }

        private void setField10 (Long value) {
            this.field10 = value;
        }

        
        public void selectField10 (Long value) {
            this.field10 = value;
            
                    setField20(null);
                
                    setField30(null);
                
                    setField40(null);
                            
        }

        
  
        
        public byte[] getField20 () {
            return this.field20;
        }

        public boolean isField20Selected () {
            return this.field20 != null;
        }

        private void setField20 (byte[] value) {
            this.field20 = value;
        }

        
        public void selectField20 (byte[] value) {
            this.field20 = value;
            
                    setField10(null);
                
                    setField30(null);
                
                    setField40(null);
                            
        }

        
  
        
        public String getField30 () {
            return this.field30;
        }

        public boolean isField30Selected () {
            return this.field30 != null;
        }

        private void setField30 (String value) {
            this.field30 = value;
        }

        
        public void selectField30 (String value) {
            this.field30 = value;
            
                    setField10(null);
                
                    setField20(null);
                
                    setField40(null);
                            
        }

        
  
        
        public Long getField40 () {
            return this.field40;
        }

        public boolean isField40Selected () {
            return this.field40 != null;
        }

        private void setField40 (Long value) {
            this.field40 = value;
        }

        
        public void selectField40 (Long value) {
            this.field40 = value;
            
                    setField10(null);
                
                    setField20(null);
                
                    setField30(null);
                            
        }

        
  

	    public void initWithDefaults() {
	    }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(TestParent2.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
            