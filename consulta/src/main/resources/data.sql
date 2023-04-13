INSERT INTO tb_consulta (id, nome, convenio, data, hora) VALUES
                                                             (1, (SELECT nome FROM tb_paciente WHERE id = 1), 'Amil', '2023-04-15', '10:00:00'),
                                                             (2, (SELECT nome FROM tb_paciente WHERE id = 2), 'Bradesco', '2023-04-16', '14:00:00');
