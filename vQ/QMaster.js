function register(qMaster,callback) {
	var fireB = new Firebase('https://ummo.firebaseio.com/qMaster/users/'+qMaster.cellNum);
	fireB.set(qMaster);
}

function craeteQ(qMaster,vQ,callback){
	var fireB = new Firebase('https://ummo.firebaseio.com/qMaster/users/'+qMaster.cellNum+"/managedQ");
	fireB.set(vQ);
	
}

function destroyQ(qMaster,vQ,callback) {
	var fireB = new Firebase('https://ummo.firebaseio.com/qMaster/users/'+qMaster.cellNum+"/"+vQ);
	fireB.set(null);
	
}

function dQUser(qMaster,user) {
	var fireB = new Firebase('https://ummo.firebaseio.com/qMaster/users/'+qMaster.cellNum+"/managedQ/qErs");
	fireB.once("value",function (snapshot) {
	 var pos=snapshot.child(user).val();
		
	 snapshot.forEach(function(childSnapshot) {
    var key = childSnapshot.key();
    var childData = childSnapshot.val();
    if (childData>pos) {
    	fireB.child(key).set(childData-1);
    }
    
    fireB.child(user).set(null);
  });		
					
	})
}

function moveUser(user,vQ) {
}

function getFeedbacks(vQ){

}

function getMyques(qMaster) {
}

function destroyAllQs() {
	
}

function update(qMaster,callback) {
	var fireB = new Firebase('https://ummo.firebaseio.com/qMaster/users/'+qMaster.cellNum);
	fireB.on("value",function (snapshot) {callback(snapshot.val())},function (err) {callback(err)});
	}
	

exports.createQ=craeteQ;
exports.register=register;
exports.destroyQ=destroyQ;
exports.dQUser=dQUser;
exports.moveUser=moveUser;
exports.getFeedbacks=getFeedbacks;
exports.getMyques = getMyques;
exports.destroyAllQs=destroyAllQs;
exports.update=update;