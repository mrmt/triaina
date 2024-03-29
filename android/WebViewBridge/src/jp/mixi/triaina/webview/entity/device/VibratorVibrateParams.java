package jp.mixi.triaina.webview.entity.device;

import jp.mixi.triaina.commons.json.annotation.Exclude;
import jp.mixi.triaina.webview.entity.Params;
import android.os.Parcel;
import android.os.Parcelable;

public class VibratorVibrateParams implements Params {
	private Long[] mPattern;
	private Integer mRepeat;
	private Long mMsec;
	
	public VibratorVibrateParams() {}
	
	public VibratorVibrateParams(Parcel source) {
		mPattern = (Long[])source.readArray(VibratorVibrateParams.class.getClassLoader());
		mRepeat = source.readInt();
		mMsec = source.readLong();
	}
	
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeArray(mPattern);
		dest.writeInt(mRepeat);
		dest.writeLong(mMsec);
	}
	
	public Long[] getPattern() {
		return mPattern;
	}
	
	public void setPattern(Long[] pattern) {
		mPattern = pattern;
	}
	
	public void setRepeat(Integer repeat) {
		mRepeat = repeat;
	}
	
	public Integer getRepeat() {
		return mRepeat;
	}
	
	public Long getMsec() {
		return mMsec;
	}
	
	public void setMillisecound(Long msec) {
		mMsec = msec;
	}

	@Exclude
	public static final Parcelable.Creator<VibratorVibrateParams> CREATOR = new Parcelable.Creator<VibratorVibrateParams>() {
        @Override
        public VibratorVibrateParams createFromParcel(Parcel source) {
            return new VibratorVibrateParams(source);
        }
        @Override
        public VibratorVibrateParams[] newArray(int size) {
            return new VibratorVibrateParams[size];
        }
    };
    
	@Override
	public int describeContents() {
		return 0;
	}
}
