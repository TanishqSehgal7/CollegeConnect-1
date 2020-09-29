package com.college.collegeconnect.models


import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.college.collegeconnect.datamodels.Constants
import com.college.collegeconnect.datamodels.Upload
import com.college.collegeconnect.settingsActivity.repository.FetchUploads
import com.college.collegeconnect.utils.FirebaseUtil
import com.google.firebase.database.*

class UploadViewModel : ViewModel() {

    var reference: DatabaseReference = FirebaseUtil.getDatabase().getReference(Constants.DATABASE_PATH_UPLOADS)
    val fetchUploads = FetchUploads(reference)

    fun getList(): LiveData<ArrayList<Upload>> {
        return fetchUploads
    }

}