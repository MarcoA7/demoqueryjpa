// Generated with g9.

package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Records")
public class Records implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    private Serializable lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Serializable getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Serializable aLockFlag) {
        lockFlag = aLockFlag;
    }

    private String fsId;
    private byte[] fsBlob;

    /** Default constructor. */
    public Records() {
        super();
    }

    /**
     * Access method for fsId.
     *
     * @return the current value of fsId
     */
    @Id
    public String getFsId() {
        return fsId;
    }

    /**
     * Setter method for fsId.
     *
     * @param aFsId the new value for fsId
     */
    public void setFsId(String aFsId) {
        fsId = aFsId;
    }

   

    /**
     * Access method for fsBlob.
     *
     * @return the current value of fsBlob
     */
    public byte[] getFsBlob() {
        return fsBlob;
    }

    /**
     * Setter method for fsBlob.
     *
     * @param aFsBlob the new value for fsBlob
     */
    public void setFsBlob(byte[] aFsBlob) {
        fsBlob = aFsBlob;
    }

}
