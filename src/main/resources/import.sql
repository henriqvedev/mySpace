INSERT INTO tb_armarios(name) VALUES ('Neymar');
INSERT INTO tb_armarios(name) VALUES ('Endrick');
INSERT INTO tb_armarios(name) VALUES ('Antony');

INSERT INTO tb_players(armario_id, name) VALUES (1,'Neymar');
INSERT INTO tb_players(armario_id, name) VALUES (2, 'Endrick');
INSERT INTO tb_players(armario_id, name) VALUES (3, 'Antony');

INSERT INTO tb_itens(player_id, name) VALUES (1, 'Fone, Camisa' );
INSERT INTO tb_itens(player_id, name) VALUES (2, 'Garrafa, Meia' );
INSERT INTO tb_itens(player_id, name) VALUES (3, 'Cordão, Camisa, Óculos' );

--ALTER TABLE TB_ITENS ADD COLUMN CREATED_AT TIMESTAMP DEFAULT CURRENT_TIMESTAMP;--
--comando p registrar hora qu guardamos algo--