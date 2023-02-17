package com.muedsa.taffy.http;

import org.apache.hc.core5.annotation.Contract;
import org.apache.hc.core5.annotation.ThreadingBehavior;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.message.BasicNameValuePair;
import org.apache.hc.core5.util.LangUtils;
import org.apache.hc.core5.util.TextUtils;

import java.io.Serializable;
import java.util.Objects;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
public class SimpleNameValuePair implements NameValuePair, Serializable {

    private String name;
    private Object value;

    public SimpleNameValuePair(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getValue() {
        if(value == null){
            return null;
        }
        return value.toString();
    }

    @Override
    public String toString() {
        String valueStr = getValue();
        if (valueStr == null) {
            return name;
        }
        return this.name +
                "=" +
                valueStr;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof final BasicNameValuePair that) {
            return this.name.equalsIgnoreCase(that.getName()) && Objects.equals(this.getName(), that.getName());
        } else if (obj instanceof final SimpleNameValuePair that) {
            return this.name.equalsIgnoreCase(that.getName()) && Objects.equals(this.getValue(), that.getValue());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = LangUtils.HASH_SEED;
        hash = LangUtils.hashCode(hash, TextUtils.toLowerCase(this.name));
        hash = LangUtils.hashCode(hash, getValue());
        return hash;
    }
}
