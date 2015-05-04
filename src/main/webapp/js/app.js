var app = angular.module('first', ['ngRoute']);

app.controller('CtrlForm', function() {
	this.utente = {};
	this.addUser = function(utenti) {
		utenti.push(this.utente);
		this.utente = {};
	};
});
function ViewController($scope) {
}

app.config(function($routeProvider) {
	$routeProvider.when('/login', {
		templateUrl : 'login.html',
		controller : ViewController
	});
	$routeProvider.when('/register', {
		templateUrl : 'register.html',
		controller : ViewController
	});
	$routeProvider.when('/photos/:id', {
		templateUrl : 'photo-detail.html',
		controller : ViewController
	});
//	$routeProvider.otherwise({
//		redirectTo : '/login'
//	});
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

app.controller('LoginController', function($scope, $rootScope) {
	this.credentials = {
		username : 'marco',
		password : 'marco'
	};
	this.login = function(credentials) {
		alert("Eccomi!");
	};
});

app.controller('LoginController', function() {
	this.credentials = {
		username : '',
		password : ''
	};
	this.login = function(credentials) {
		alert("Eccomi!");
	};
});
app.controller('RegisterController', function($http, $scope) {
	this.credentials = {
			name : '',
			surname : '',
			username : '',
			password : '',
			
	};
	this.register = function($http, $scope) {
		alert("Eccomi!");
		var chiamata = $http.get('/prova/rest/utente/registra');
		chiamata.success(function(data){
			$scope.utente = data;
		});
		chiamata.error(function(error){
			alert(error);
		});
	};
});

