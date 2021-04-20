package edu.aku.hassannaqvi.tpvics_hh_shrc.ui.list_activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import edu.aku.hassannaqvi.tpvics_hh_shrc.R
import edu.aku.hassannaqvi.tpvics_hh_shrc.adapters.PendingListAdapter
import edu.aku.hassannaqvi.tpvics_hh_shrc.core.MainApp
import edu.aku.hassannaqvi.tpvics_hh_shrc.databinding.ActivityPendingFormsBinding
import edu.aku.hassannaqvi.tpvics_hh_shrc.models.FormsContract

class PendingFormsActivity : AppCompatActivity() {

    lateinit var bi: ActivityPendingFormsBinding
    lateinit var adapter: PendingListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bi = DataBindingUtil.setContentView(this, R.layout.activity_pending_forms)
        bi.callback = this

        val unclosedForms = MainApp.appInfo.dbHelper.unclosedForms
        setupRecyclerView(unclosedForms)
    }

    private fun setupRecyclerView(forms_lst: MutableList<FormsContract>) {
        adapter = PendingListAdapter(this, forms_lst)
        bi.recyclerView.layoutManager = LinearLayoutManager(this)
        bi.recyclerView.adapter = adapter
    }
}
