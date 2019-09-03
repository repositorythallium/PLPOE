var gerenciadorPontoEletronicoModelModule = angular.module("gerenciadorPontoEletronicoModelModule", []);

gerenciadorPontoEletronicoModelModule.controller("gerenciadorPontoEletronicoModelController", function($scope, $http) {
	
	var NAME_API_PONTO_ELETRONICO = "http://localhost:8080/PLPOE-1.0.0.1-SNAPSHOT/rest/pontoEletronicoResource";
	
	$scope.gerenciadorPontoEletronicoModel = {};
	
	function incializador() {
		$scope.moduleName = "Registro de Ponto Eletrônico";
	};
	
	$scope.save = function(gerenciadorPontoEletronicoModel) {
		console.log(gerenciadorPontoEletronicoModel);
		$http.get(NAME_API_PONTO_ELETRONICO);
		delete $scope.gerenciadorPontoEletronicoModel;
	};
	
	$scope.update = function(gerenciadorPontoEletronicoModel) {
		
	};
	
	$scope.delete = function(gerenciadorPontoEletronicoModel) {
		
	};
	
	$scope.findAll = function() {
		
	};
	
	$scope.findOne = function(gerenciadorPontoEletronicoModel) {
		
	};
	
});