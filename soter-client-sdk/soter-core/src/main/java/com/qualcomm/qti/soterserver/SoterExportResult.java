package com.qualcomm.qti.soterserver;

import android.os.Parcel;
import android.os.Parcelable;

public class SoterExportResult implements Parcelable {

    public int resultCode;
    public byte[] exportData;
    public int exportDataLength;

    public SoterExportResult(){
        super();
    }


    public SoterExportResult(Parcel in) {
        resultCode = in.readInt();
        exportData = in.createByteArray();
        exportDataLength = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(resultCode);
        dest.writeByteArray(exportData);
        dest.writeInt(exportDataLength);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<SoterExportResult> CREATOR = new Creator<SoterExportResult>() {
        @Override
        public SoterExportResult createFromParcel(Parcel in) {
            return new SoterExportResult(in);
        }

        @Override
        public SoterExportResult[] newArray(int size) {
            return new SoterExportResult[size];
        }
    };
}
