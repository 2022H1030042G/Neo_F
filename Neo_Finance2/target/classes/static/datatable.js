$(document).ready( function () {
	 var table = $('#UserTable').DataTable({
			"sAjaxSource": "/user",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			      { "mData": "account_no"},
		          { "mData": "amount_overdue" },
				  { "mData": "current_balance" },
				  { "mData": "date_opened" },
				  { "mData": "date_reported" },
				  { "mData": "lender" },
				  { "mData": "sanction_amount" },
				  { "mData": "type" }
			]
	 })
});