package jp.mixi.triaina.webview.entity.device;

import jp.mixi.triaina.commons.json.annotation.Exclude;
import jp.mixi.triaina.webview.entity.Params;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class NetHttpSendParams implements Params {
	private String mUrl;
	private String mMethod;
	private Bundle mHeaders;
	private Bundle mBody;
	private String mRawBody;

	public NetHttpSendParams() {}
	
	public NetHttpSendParams(Parcel source) {
		mUrl = source.readString();
		mMethod = source.readString();
		mHeaders = source.readBundle();
		mBody = source.readBundle();
		mRawBody = source.readString();
	}
	
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(mUrl);
		dest.writeString(mMethod);
		dest.writeBundle(mHeaders);
		dest.writeBundle(mBody);
		dest.writeString(mRawBody);
	}
	
	public String getUrl() {
		return mUrl;
	}
	
	public String getMethod() {
		return mMethod;
	}
	
	public Bundle getHeaders() {
		return mHeaders;
	}
	
	public Bundle getBody() {
		return mBody;
	}
	
	public String getRawBody() {
		return mRawBody;
	}
	
	public void setRawBody(String rawBody) {
		mRawBody = rawBody;
	}
	
	public void setUrl(String mUrl) {
		this.mUrl = mUrl;
	}

	public void setMethod(String mMethod) {
		this.mMethod = mMethod;
	}

	public void setHeaders(Bundle mHeaders) {
		this.mHeaders = mHeaders;
	}

	public void setBody(Bundle mBody) {
		this.mBody = mBody;
	}
	
	@Override
	public int describeContents() {
		return 0;
	}
	
	@Exclude
	public static final Parcelable.Creator<NetHttpSendParams> CREATOR = new Parcelable.Creator<NetHttpSendParams>() {
        @Override
        public NetHttpSendParams createFromParcel(Parcel source) {
            return new NetHttpSendParams(source);
        }
        @Override
        public NetHttpSendParams[] newArray(int size) {
            return new NetHttpSendParams[size];
        }
    };
}
