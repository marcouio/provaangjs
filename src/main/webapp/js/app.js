var app = angular.module('first', []);
app.controller('CtrlForm', function() {
	this.utente = {};
	this.addUser = function(utenti) {
		utenti.push(this.utente);
		this.utente = {};
	};
});

app.controller("CtrlUtenti", function() {
	this.utenti = [];
});

app.controller("MenuController", function($http, $scope){
	$scope.menus = [];
	
	var chiamata = $http.get('/prova/rest/menu/disegna');
	chiamata.success(function(data){
		$scope.menus = data;
	});
	chiamata.error(function(error){
		alert(error);
	});
	
	
});

app.directive('menu', function(){
	return{
		restrict: 'E',
		templateUrl: 'menu.html'
	};
});

app.directive('footer', function(){
	return{
		restrict: 'E',
		templateUrl: 'footer.html'
	};
});

app.directive('tagNew', function(){
	return{
		restrict: 'E',
		templateUrl: 'tagNew.html'
	};
});
